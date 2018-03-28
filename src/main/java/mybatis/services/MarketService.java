package mybatis.services;

import mybatis.model.market.analize.SectorPerfComparer;
import mybatis.model.market.pojos.Rank;
import mybatis.model.market.pojos.Sector;
import mybatis.model.market.pojos.SectorRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class MarketService {

    @Autowired
    RestTemplate restTemplate;

    public SectorRoot getSectorsPerformance(){
        String fQuery = "https://www.alphavantage.co/query?function=SECTOR&apikey=";
        SectorRoot sectorRoot = restTemplate.getForObject(fQuery, SectorRoot.class);
        return sectorRoot;
    }

    public SectorPerfComparer getSectorsComparison(String sector1, String sector2, String tf1, String tf2) {

        SectorRoot sectorRoot = getSectorsPerformance();
        SectorPerfComparer sectorPerfComparer = new SectorPerfComparer(sectorRoot, sector1, sector2, tf1, tf2);

        return  sectorPerfComparer;
    }

    public Rank getSectorsTopPerf(String tf) {
        SectorRoot sectorRoot = getSectorsPerformance();
        return sectorRoot.getRankArray()[SectorRoot.decodeTimeframe(tf)];
    }

//    public SectorRoot getTickerOHLC() {
//
//    }
}
