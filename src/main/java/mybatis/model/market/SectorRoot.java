package mybatis.model.market;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SectorRoot {

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
}
