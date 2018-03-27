package mybatis.model.newsapi;

public class NewsRoot {

    String status;
    int totalResults;
    NewsArticles[] articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public NewsArticles[] getArticles() {
        return articles;
    }

    public void setArticles(NewsArticles[] articles) {
        this.articles = articles;
    }
}
