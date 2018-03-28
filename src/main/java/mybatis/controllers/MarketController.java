package mybatis.controllers;

import mybatis.model.market.analize.SectorPerfComparer;
import mybatis.model.market.pojos.Rank;
import mybatis.model.market.pojos.Sector;
import mybatis.model.market.pojos.SectorRoot;
import mybatis.services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("market")
public class MarketController {

    @Autowired
    MarketService marketService;

    @RequestMapping("/sectors")
    public SectorRoot getSectors(){
        return marketService.getSectorsPerformance();
    }

    @RequestMapping("/sectors/top/{tf}")
    public Rank getSectors(@PathVariable(value="tf")String tf){
        return marketService.getSectorsTopPerf(tf);
    }

    @RequestMapping("/sectors/compare")
    public SectorPerfComparer getSectorPerformanceTF(@RequestParam(value="sect1") String sector1,
                                                     @RequestParam(value="sect2") String sector2,
                                                     @RequestParam(value="tf1") String tf1,
                                                     @RequestParam(value="tf2") String tf2){
        return marketService.getSectorsComparison(sector1,sector2,tf1,tf2);

    }




}
