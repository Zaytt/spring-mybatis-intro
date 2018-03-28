package mybatis.controllers;

import mybatis.model.stocktwits.TickerStreamRoot;
import mybatis.model.stocktwits.analyze.CompareSentiment;
import mybatis.model.stocktwits.analyze.TickerSentiment;
import mybatis.services.StockTwitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("stocktwits")
public class StockTwitsController {

    @Autowired
    StockTwitsService stockTwitsService;

    @RequestMapping("/stream/{ticker}")
    public TickerStreamRoot getTickerStream(@PathVariable(value="ticker")String ticker) {
        return stockTwitsService.getStreamTicker(ticker);
    }

    @RequestMapping("/sentiment/{ticker}/{datetime}")
    public TickerSentiment getTickerSentiment(@PathVariable(value="ticker")String ticker,
                                              @PathVariable(value="datetime")String datetime) {
        return stockTwitsService.getSentimentByPK(ticker, datetime);
    }

    @RequestMapping("/compare")
    public CompareSentiment getTickerStream(@RequestParam(value="ticker1")String ticker1,
                                            @RequestParam(value="ticker2")String ticker2){
        return stockTwitsService.compareSentiment(ticker1, ticker2);
    }

    // Create User
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public TickerSentiment insertTickerSentiment(@RequestBody TickerSentiment tickerSentiment) {
        return stockTwitsService.insertTickerSentiment(tickerSentiment);
    }



}
