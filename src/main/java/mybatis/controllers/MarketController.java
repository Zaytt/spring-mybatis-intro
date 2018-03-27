package mybatis.controllers;

import mybatis.model.market.SectorRoot;
import mybatis.services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("market")
public class MarketController {

    @Autowired
    MarketService marketService;

    @RequestMapping("/sectors")
    public SectorRoot getSectors(){
        return marketService.getSectorsPerformance();
    }



}
