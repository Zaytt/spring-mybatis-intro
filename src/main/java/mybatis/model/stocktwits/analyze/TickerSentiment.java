package mybatis.model.stocktwits.analyze;

public class TickerSentiment {

    String ticker;
    String name;
    String datetime;
    int bullishcount;
    int bearishcount;
    int sentimentRating;


    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBullishcount() {
        return bullishcount;
    }

    public void setBullishcount(int bullishcount) {
        this.bullishcount = bullishcount;
    }

    public int getBearishcount() {
        return bearishcount;
    }

    public void setBearishcount(int bearishcount) {
        this.bearishcount = bearishcount;
    }

    public int getSentimentRating() {
        return sentimentRating;
    }

    public void setSentimentRating(int sentimentRating) {
        this.sentimentRating = sentimentRating;
    }


}
