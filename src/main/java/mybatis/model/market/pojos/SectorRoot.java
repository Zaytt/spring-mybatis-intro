package mybatis.model.market.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class SectorRoot {

    Rank[] rankArray = new Rank[10];

    @JsonProperty("Meta Data")
    MetaData metaData;
    @JsonProperty("Rank A: Real-Time Performance")
    Rank rankRealTime;
    @JsonProperty("Rank B: 1 Day Performance")
    Rank rank1D;
    @JsonProperty("Rank C: 5 Day Performance")
    Rank rank5D;
    @JsonProperty("Rank D: 1 Month Performance")
    Rank rank1M;
    @JsonProperty("Rank E: 3 Month Performance")
    Rank rank3M;
    @JsonProperty("Rank F: Year-to-Date (YTD) Performance")
    Rank rankYTD;
    @JsonProperty("Rank G: 1 Year Performance")
    Rank rank1Y;
    @JsonProperty("Rank H: 3 Year Performance")
    Rank rank3Y;
    @JsonProperty("Rank I: 5 Year Performance")
    Rank rank5Y;
    @JsonProperty("Rank J: 10 Year Performance")
    Rank rank10Y;


    public static int decodeTimeframe(String tf){
        int timeframe = 0;
        switch (tf){
            case "rt":
                timeframe = 0;
                break;
            case "1d":
                timeframe = 1;
                break;
            case "5d":
                timeframe = 2;
                break;
            case "1m":
                timeframe = 3;
                break;
            case "3m":
                timeframe = 4;
                break;
            case "ytd":
                timeframe = 5;
                break;
            case "1y":
                timeframe = 6;
                break;
            case "3y":
                timeframe = 7;
                break;
            case "5y":
                timeframe = 8;
                break;
            case "10y":
                timeframe = 9;
                break;
        }

        return timeframe;
    }
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public Rank getRankRealTime() {
        return rankArray[0];
    }

    public void setRankRealTime(Rank rankRealTime) {
        this.rankRealTime.setTimeframe("rt");
        rankArray[0] = rankRealTime;
        this.rankRealTime = rankRealTime;
    }

    public Rank getRank1D() {
        return rank1D;
    }

    public void setRank1D(Rank rank1D) {
        rank1D.setTimeframe("1d");
        rankArray[1] = rank1D;
        this.rank1D = rank1D;
    }

    public Rank getRank5D() {
        return rank5D;
    }

    public void setRank5D(Rank rank5D) {
        rank5D.setTimeframe("5d");
        rankArray[2] = rank5D;
        this.rank5D = rank5D;
    }

    public Rank getRank1M() {
        return rank1M;
    }

    public void setRank1M(Rank rank1M) {
        rank1M.setTimeframe("1M");
        rankArray[3] = rank1M;
        this.rank1M = rank1M;
    }

    public Rank getRank3M() {
        return rank3M;
    }

    public void setRank3M(Rank rank3M) {
        rank3M.setTimeframe("3m");
        rankArray[4] = rank3M;
        this.rank3M = rank3M;
    }

    public Rank getRankYTD() {
        return rankYTD;
    }

    public void setRankYTD(Rank rankYTD) {
        rankYTD.setTimeframe("ytd");
        rankArray[5] = rankYTD;
        this.rankYTD = rankYTD;
    }

    public Rank getRank1Y() {
        return rank1Y;
    }

    public void setRank1Y(Rank rank1Y) {
        rank1Y.setTimeframe("1y");
        rankArray[6] = rank1Y;
        this.rank1Y = rank1Y;
    }

    public Rank getRank3Y() {
        return rank3Y;
    }

    public void setRank3Y(Rank rank3Y) {
        rank3Y.setTimeframe("3y");
        rankArray[7] = rank3Y;
        this.rank3Y = rank3Y;
    }

    public Rank getRank5Y() {
        return rank5Y;
    }

    public void setRank5Y(Rank rank5Y) {
        rank5Y.setTimeframe("5y");
        rankArray[8] = rank5Y;
        this.rank5Y = rank5Y;
    }

    public Rank getRank10Y() {
        return rank10Y;
    }

    public void setRank10Y(Rank rank10Y) {
        rank10Y.setTimeframe("10y");
        rankArray[9] = rank10Y;
        this.rank10Y = rank10Y;
    }

    public Rank[] getRankArray() {
        return rankArray;
    }

    public void setRankArray(Rank[] rankArray) {
        this.rankArray = rankArray;
    }
}
