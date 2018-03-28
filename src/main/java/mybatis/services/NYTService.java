package mybatis.services;

import mybatis.mappers.NYTMapper;
import mybatis.model.nyt.external.NYTDocs;
import mybatis.model.nyt.external.NYTRoot;
import mybatis.model.nyt.challenges.ResponseComparison;
import mybatis.model.nyt.internal.NYTOverview;
import mybatis.threads.nyt.NYTOverviewThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// class NYTService
@Service
public class NYTService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    NYTMapper nytMapper;

    public NYTRoot searchNYT(String query, boolean persist) {
        String fQuery = "https://api.nytimes.com/svc/search/v2/articlesearch.json?q=" + query + "&api-key=";
        NYTRoot response = restTemplate.getForObject(
                fQuery, NYTRoot.class);

        response.setCopyright("This is my copyright wey");
        System.out.println("-------------got the results-------------");
        if(persist){
            NYTOverviewThread thread = new NYTOverviewThread(response);
        }
        System.out.println("-------------returning response-------------");

        return response;
    }

    public ResponseComparison compareNYTResult(String t1, String t2) {

        //Look for the docs of the first search param
        NYTRoot responseOne = searchNYT(t1, false);
        //Look for the docs of the second search param
        NYTRoot responseTwo = searchNYT(t2, false);

        //Create a new ResponseComparison object
        ResponseComparison obj = new ResponseComparison();
        //Set the ResponseComparison object's search terms
        obj.setSearchTermOne(t1);
        obj.setSearchTermTwo(t2);

        //Get the length of the array of the results of the searches above.
        obj.setSearchTermOneResultCount(responseOne.getResponse().getMeta().getHits());
        obj.setSearchTermTwoResultCount(responseTwo.getResponse().getMeta().getHits());

        return obj;
    }

    public void insertNYTSummary(NYTOverview result) {
        nytMapper.insertSummary(result);
    }
}
