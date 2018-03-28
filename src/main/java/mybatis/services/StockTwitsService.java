package mybatis.services;

import mybatis.mappers.StockTwitsMapper;
import mybatis.model.stocktwits.Message;
import mybatis.model.stocktwits.TickerStreamRoot;
import mybatis.model.stocktwits.analyze.CompareSentiment;
import mybatis.model.stocktwits.analyze.TickerSentiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockTwitsService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    StockTwitsMapper stockTwitsMapper;

    public TickerStreamRoot getStreamTicker(String ticker){
        String fQuery = "https://api.stocktwits.com/api/2/streams/symbol/"+ticker+".json";
        TickerStreamRoot tickerStreamRoot = restTemplate.getForObject(fQuery, TickerStreamRoot.class);

        return tickerStreamRoot;
    }

    public TickerSentiment getSentimentByPK(String ticker, String datetime){
        return stockTwitsMapper.getTickerSentimentByPK(ticker, datetime);

    }

    public CompareSentiment compareSentiment(String ticker1, String ticker2){
        String fQuery = "https://api.stocktwits.com/api/2/streams/symbol/"+ticker1+".json";
        String fQuery2 = "https://api.stocktwits.com/api/2/streams/symbol/"+ticker2+".json";

        //Get the last 30 messages of ticker1 and ticker2 streams.
        TickerStreamRoot tickerStreamRoot1 = restTemplate.getForObject(fQuery, TickerStreamRoot.class);
        TickerStreamRoot tickerStreamRoot2 = restTemplate.getForObject(fQuery2, TickerStreamRoot.class);

        //Create a new CompareSentiment object
        CompareSentiment compareSentiment = new CompareSentiment();
        //Set the attributes
        compareSentiment.getTickerSentiment1().setTicker(ticker1);
        compareSentiment.getTickerSentiment2().setTicker(ticker2);
        compareSentiment.getTickerSentiment1().setName(tickerStreamRoot1.getSymbol().getTitle());
        compareSentiment.getTickerSentiment2().setName(tickerStreamRoot2.getSymbol().getTitle());
        //Look and count for the number of Bullish and Bearish twits.
        //Ticker1 Bullish Sentiment
        int t1Bullish = getSentimentCount(tickerStreamRoot1, "Bullish");
        compareSentiment.getTickerSentiment1().setBullishcount(t1Bullish);
        //Ticker1 Bearish Sentiment
        int t1Bearish = getSentimentCount(tickerStreamRoot1, "Bearish");
        compareSentiment.getTickerSentiment1().setBearishcount(t1Bearish);
        //Ticker2 Bullish Sentiment
        int t2Bullish = getSentimentCount(tickerStreamRoot2, "Bullish");
        compareSentiment.getTickerSentiment2().setBullishcount(t2Bullish);
        //Ticker2 Bearish Sentiment
        int t2Bearish = getSentimentCount(tickerStreamRoot2, "Bearish");
        compareSentiment.getTickerSentiment2().setBearishcount(t2Bearish);

        //Set ticker1 sentimentRating
        compareSentiment.getTickerSentiment1().setSentimentRating(t1Bullish-t1Bearish);
        //Set ticker2 sentimentRating
        compareSentiment.getTickerSentiment2().setSentimentRating(t2Bullish-t2Bearish);

        //Set ticker1 datetime;
        compareSentiment.getTickerSentiment1().setDatetime(getCurrentDateTime());
        //Set ticker2 datetime;
        compareSentiment.getTickerSentiment2().setDatetime(getCurrentDateTime());

        return compareSentiment;
    }

    //add new ticker sentiment
    public TickerSentiment insertTickerSentiment(TickerSentiment tickerSentiment) {
        stockTwitsMapper.insertSentiment(tickerSentiment);
        return stockTwitsMapper.getTickerSentimentByPK(tickerSentiment.getTicker(), tickerSentiment.getDatetime());
    }
    
    public int getSentimentCount(TickerStreamRoot tickerStreamRoot, String sentiment){
        int sentimentCount = 0;
        for (Message message: tickerStreamRoot.getMessages()) {
            if(message.getEntities().getSentiment() != null &&
                    message.getEntities().getSentiment().getBasic().compareTo(sentiment) == 0)
                sentimentCount++;
        }

        return sentimentCount;
    }

    public String getCurrentDateTime(){
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return sdf.format(dt);
    }


}
