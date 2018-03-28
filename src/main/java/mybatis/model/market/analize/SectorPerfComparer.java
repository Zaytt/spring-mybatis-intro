package mybatis.model.market.analize;

import mybatis.model.market.pojos.Rank;
import mybatis.model.market.pojos.Sector;
import mybatis.model.market.pojos.SectorRoot;

public class SectorPerfComparer {
    Sector sector1;
    Sector sector2;


    public SectorPerfComparer(SectorRoot sectorRoot, String sector1Name, String sector2Name,
                              String sector1TF, String sector2TF) {


        sector1 = findSector(sectorRoot, sector1Name, sector1TF);
        sector2 = findSector(sectorRoot, sector2Name, sector2TF);
    }

    /**
     * Gets a sector object from the main SectorRoot in a given timeframe
     * @param sectorRoot the full sector info
     * @param sector the sector code
     * @param tf the timeframe code
     * @return
     */

    public Sector findSector(SectorRoot sectorRoot, String sector, String tf){
        int sectorIndex = 0;
        Sector sectorObj = null;

        switch(tf){
            case "rt":

                sectorIndex = sectorRoot.getRankRealTime().decodeSector(sector);
                sectorObj = sectorRoot.getRankRealTime().getSectorArray()[sectorIndex];
                sectorObj.setId(sector+tf);
                sectorObj.setTimeframe(tf);
                break;
            case "1d":
                sectorIndex = sectorRoot.getRankRealTime().decodeSector(sector);
                sectorObj = sectorRoot.getRankRealTime().getSectorArray()[sectorIndex];
                sectorObj.setId(sector+tf);
                sectorObj.setTimeframe(tf);
                break;
            case "5d":
                sectorIndex = sectorRoot.getRankRealTime().decodeSector(sector);
                sectorObj = sectorRoot.getRankRealTime().getSectorArray()[sectorIndex];
                sectorObj.setId(sector+tf);
                sectorObj.setTimeframe(tf);
                break;
            case "1m":
                sectorIndex = sectorRoot.getRankRealTime().decodeSector(sector);
                sectorObj = sectorRoot.getRankRealTime().getSectorArray()[sectorIndex];
                sectorObj.setId(sector+tf);
                sectorObj.setTimeframe(tf);
                break;
            case "3m":
                sectorIndex = sectorRoot.getRankRealTime().decodeSector(sector);
                sectorObj = sectorRoot.getRankRealTime().getSectorArray()[sectorIndex];
                sectorObj.setId(sector+tf);
                sectorObj.setTimeframe(tf);
                break;
            case "ytd":
                sectorIndex = sectorRoot.getRankRealTime().decodeSector(sector);
                sectorObj = sectorRoot.getRankRealTime().getSectorArray()[sectorIndex];
                sectorObj.setId(sector+tf);
                sectorObj.setTimeframe(tf);
                break;
            case "1y":
                sectorIndex = sectorRoot.getRankRealTime().decodeSector(sector);
                sectorObj = sectorRoot.getRankRealTime().getSectorArray()[sectorIndex];
                sectorObj.setId(sector+tf);
                sectorObj.setTimeframe(tf);
                break;
            case "5y":
                sectorIndex = sectorRoot.getRankRealTime().decodeSector(sector);
                sectorObj = sectorRoot.getRankRealTime().getSectorArray()[sectorIndex];
                sectorObj.setId(sector+tf);
                sectorObj.setTimeframe(tf);
                break;
            case "10y":
                sectorIndex = sectorRoot.getRankRealTime().decodeSector(sector);
                sectorObj = sectorRoot.getRankRealTime().getSectorArray()[sectorIndex];
                sectorObj.setId(sector+tf);
                sectorObj.setTimeframe(tf);
                break;
        }

        return sectorObj;
    }

    public Sector getSector1() {
        return sector1;
    }

    public void setSector1(Sector sector1) {
        this.sector1 = sector1;
    }

    public Sector getSector2() {
        return sector2;
    }

    public void setSector2(Sector sector2) {
        this.sector2 = sector2;
    }
}
