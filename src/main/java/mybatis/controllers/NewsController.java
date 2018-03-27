package mybatis.controllers;

import mybatis.model.newsapi.NewsRoot;
import mybatis.model.nyt.external.NYTRoot;
import mybatis.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("news")
public class NewsController {
    @Autowired
    NewsService newsService;

    @RequestMapping("/search")
    public NewsRoot search(@RequestParam(value="query") String query) {

        return newsService.search(query);

    }

}
