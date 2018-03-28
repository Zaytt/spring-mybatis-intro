package mybatis.model.market.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Rank {

    String timeframe;
    Sector[] sectorArray = new Sector[11];

    @JsonProperty("Energy") //ArrayIndex 0
    String energy;
    @JsonProperty("Consumer Staples") //ArrayIndex 1
    String consumerStaples;
    @JsonProperty("Utilities") //ArrayIndex 2
    String utilities;
    @JsonProperty("Industrials") //ArrayIndex 3
    String industrials;
    @JsonProperty("Real Estate") //ArrayIndex 4
    String realEstate;
    @JsonProperty("Telecommunication Services") //ArrayIndex 5
    String telecommunicationServices;
    @JsonProperty("Materials") //ArrayIndex 6
    String materials;
    @JsonProperty("Consumer Discretionary") //ArrayIndex 7
    String consumerDiscretionary;
    @JsonProperty("Health Care") //ArrayIndex 8
    String healthCare;
    @JsonProperty("Information Technology") //ArrayIndex 9
    String informationTechnology;
    @JsonProperty("Financials") //ArrayIndex 10
    String financials;

    public Rank() {
    }

    public Sector[] getSectorArray() {
        return sectorArray;
    }

    public void setSectorArray(Sector[] sectorArray) {
        this.sectorArray = sectorArray;
    }

    /**
     * Receives a code with the first 2 letters of the sector.
     * Codes allowed:   en - Energy, cs - Consumer Staples, ut - Utilities, in - Industrials, re - Real Estate
     *                  ts - Telecomm. Services, ma - Materials, cd - Consumer Discretionary, hc - Health Care
     *                  it - Information Technology, fi - Financials.
     * @param sectorCode
     * @return the index of the given sector in sectorArray
     */
    public static int decodeSector(String sectorCode){
        int index = 0;
        switch (sectorCode){
            case "en":
                index = 0;
                break;
            case "cs":
                index = 1;
                break;
            case "ut":
                index = 2;
                break;
            case "in":
                index = 3;
                break;
            case "re":
                index = 4;
                break;
            case "ts":
                index = 5;
                break;
            case "ma":
                index = 6;
                break;
            case "cd":
                index = 7;
                break;
            case "hc":
                index = 8;
                break;
            case "it":
                index = 9;
                break;
            case "fi":
                index = 10;
                break;
        }

        return index;
    }

    /**
     * Translates the short timeframe code into a more detailed description.
     *
     * @param tf for timeframe
     * @return a complete description of the timeframe.
     */
    public static String decodeTimeframe(String tf){
        String timeframe = "n/a";
        switch (tf){
            case "rt":
                timeframe = "Real Time";
                break;
            case "1d":
                timeframe = "1 Day";
                break;
            case "5d":
                timeframe = "5 Days";
                break;
            case "1m":
                timeframe = "1 Month";
                break;
            case "3m":
                timeframe = "3 Months";
                break;
            case "ytd":
                timeframe = "Year to Date";
                break;
            case "1y":
                timeframe = "1 Year";
                break;
            case "3y":
                timeframe = "3 Years";
                break;
            case "5y":
                timeframe = "5 Years";
                break;
            case "10y":
                timeframe = "10 Years";
                break;

        }

        return timeframe;
    }


    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

    public Sector getEnergy() {
        return this.sectorArray[0];
    }

    public void setEnergy(String energy) {
        Sector sector = new Sector("en"+this.timeframe,"Energy",
                this.timeframe, Double.parseDouble(energy.replace("%","")));
        this.sectorArray[0] = sector;
        this.energy = energy;
    }

    public Sector getConsumerStaples() {
        return this.sectorArray[1];
    }

    public void setConsumerStaples(String consumerStaples) {
        Sector sector = new Sector("cs"+this.timeframe,"Consumer Staples",
                this.timeframe, Double.parseDouble(consumerStaples.replace("%","")));
        this.sectorArray[1] = sector;
        this.consumerStaples = consumerStaples;
    }

    public Sector getUtilities() {
        return this.sectorArray[2];
    }

    public void setUtilities(String utilities) {
        Sector sector = new Sector("ut"+timeframe, "Utilities", this.timeframe,
                Double.parseDouble(utilities.replace("%","")));
        this.sectorArray[2] = sector;
        this.utilities = utilities;
    }

    public Sector getIndustrials() {
        return this.sectorArray[3];
    }

    public void setIndustrials(String industrials) {
        Sector sector = new Sector("in"+timeframe,"Industrials", this.timeframe,
                Double.parseDouble(industrials.replace("%","")));
        this.sectorArray[3] = sector;
        this.industrials = industrials;
    }

    public Sector getRealEstate() {
        return this.sectorArray[4];
    }

    public void setRealEstate(String realEstate) {
        Sector sector = new Sector("re"+timeframe,"Real Estate", timeframe,
                Double.parseDouble(realEstate.replace("%","")));
        this.sectorArray[4] = sector;
        this.realEstate = realEstate;
    }

    public Sector getTelecommunicationServices() {
        return this.sectorArray[5];
    }

    public void setTelecommunicationServices(String telecommunicationServices) {
        Sector sector = new Sector("ts"+timeframe,"Telecommunication Services", timeframe,
                Double.parseDouble(telecommunicationServices.replace("%","")));
        this.sectorArray[5] = sector;
        this.telecommunicationServices = telecommunicationServices;
    }

    public Sector getMaterials() {
        return this.sectorArray[6];
    }

    public void setMaterials(String materials) {
        Sector sector = new Sector("ma"+timeframe,"Materials", timeframe,
                Double.parseDouble(materials.replace("%","")));
        this.sectorArray[6] = sector;
        this.materials = materials;
    }

    public Sector getConsumerDiscretionary() {
        return this.sectorArray[7];
    }

    public void setConsumerDiscretionary(String consumerDiscretionary) {
        Sector sector = new Sector("cd"+timeframe,"Consumer Discretionary", timeframe,
                Double.parseDouble(consumerDiscretionary.replace("%","")));
        this.sectorArray[7] = sector;
        this.consumerDiscretionary = consumerDiscretionary;
    }

    public Sector getHealthCare() {
        return this.sectorArray[8];
    }

    public void setHealthCare(String healthCare) {
        Sector sector = new Sector("hc"+timeframe, "Healthcare", timeframe,
                Double.parseDouble(healthCare.replace("%","")));
        this.sectorArray[8] = sector;
        this.healthCare = healthCare;
    }

    public Sector getInformationTechnology() {
        return this.sectorArray[9];
    }

    public void setInformationTechnology(String informationTechnology) {
        Sector sector = new Sector("it"+timeframe, "Information Technology", timeframe,
                Double.parseDouble(informationTechnology.replace("%","")));
        this.sectorArray[9] = sector;
        this.informationTechnology = informationTechnology;
    }

    public Sector getFinancials() {
        return this.sectorArray[10];
    }

    public void setFinancials(String financials) {
        Sector sector = new Sector("fi"+timeframe, "Financials", timeframe,
                Double.parseDouble(financials.replace("%","")));
        this.sectorArray[10] = sector;
        this.financials = financials;
    }
}
