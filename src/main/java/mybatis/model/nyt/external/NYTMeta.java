package mybatis.model.nyt.external;

public class NYTMeta {

    int hits;
    int offset;
    int time;

    public NYTMeta() {
    }

    public NYTMeta(int hits, int offset, int time) {
        this.hits = hits;
        this.offset = offset;
        this.time = time;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
