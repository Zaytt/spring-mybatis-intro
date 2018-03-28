package mybatis.services;

import mybatis.model.newsapi.NewsRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Autowired
    RestTemplate restTemplate;

    public NewsRoot search(String query){
        String fQuery = "https://newsapi.org/v2/top-headlines?q="+query+"&apiKey=";
        NewsRoot newsRoot = restTemplate.getForObject(fQuery, NewsRoot.class);

        return newsRoot;
    }

}
