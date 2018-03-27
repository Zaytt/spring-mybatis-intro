package mybatis.threads.nyt;

import mybatis.model.nyt.external.NYTDocs;
import mybatis.model.nyt.external.NYTRoot;
import mybatis.model.nyt.internal.NYTOverview;
import mybatis.services.NYTService;
import org.springframework.beans.factory.annotation.Autowired;

public class NYTOverviewThread implements Runnable{

    @Autowired
    NYTService nytService;

    Thread thrd;
    NYTRoot data;

    public NYTOverviewThread(NYTRoot data) {
        this.thrd = new Thread(this);
        this.data = data;
        this.thrd.start();
    }

    @Override
    public void run() {

        for (NYTDocs result: data.getResponse().getDocs()) {
            NYTOverview nytOverview = new NYTOverview();
            nytOverview.setDate(result.getPub_date());
            nytOverview.setHeadline(result.getHeadline().getMain());
            nytOverview.setSummary(result.getSnippet());
            try {
                nytOverview.setImageUrl(result.getMultimedia()[0].getUrl());
            } catch (Exception e) {
                nytOverview.setImageUrl("https://vignette.wikia.nocookie.net/assassinscreed/images/3/39/Not-found.jpg/revision/latest?cb=20110517171552");
            }
            nytService.insertNYTSummary(nytOverview);
        }

    }
}
