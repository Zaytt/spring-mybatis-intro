package mybatis.services;

import mybatis.model.market.SectorRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarketService {

    @Autowired
    RestTemplate restTemplate;

    public SectorRoot getSectorsPerformance(){
        String fQuery = "https://www.alphavantage.co/query?function=SECTOR&apikey=";
        SectorRoot sectorRoot = restTemplate.getForObject(fQuery, SectorRoot.class);

        return sectorRoot;
    }

}
