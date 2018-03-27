package mybatis.model.market;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaData {

    @JsonProperty("Information")
    String info;

    @JsonProperty("Last Refreshed")
    String lastRefreshed;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }
}
