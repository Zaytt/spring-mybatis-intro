package mybatis.model.market.pojos;

public class Sector {
    private String id;
    private String name;
    private String timeframe;
    private double performance;

    public Sector(String id, String name, String timeframe, double performance) {
        this.id = id;
        this.name = name;
        this.timeframe = timeframe;
        this.performance = performance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

}
