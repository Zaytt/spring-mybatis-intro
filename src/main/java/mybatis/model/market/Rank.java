package mybatis.model.market;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rank {

    @JsonProperty("Energy")
    String energy;
    @JsonProperty("Consumer Staples")
    String consumerStaples;
    @JsonProperty("Utilities")
    String utilities;
    @JsonProperty("Industrials")
    String industrials;
    @JsonProperty("Real Estate")
    String realEstate;
    @JsonProperty("Telecommunication Services")
    String telecommunicationServices;
    @JsonProperty("Materials")
    String materials;
    @JsonProperty("Consumer Discretionary")
    String consumerDiscretionary;
    @JsonProperty("Health Care")
    String healthCare;
    @JsonProperty("Information Technology")
    String informationTechnology;
    @JsonProperty("Financials")
    String financials;

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getConsumerStaples() {
        return consumerStaples;
    }

    public void setConsumerStaples(String consumerStaples) {
        this.consumerStaples = consumerStaples;
    }

    public String getUtilities() {
        return utilities;
    }

    public void setUtilities(String utilities) {
        this.utilities = utilities;
    }

    public String getIndustrials() {
        return industrials;
    }

    public void setIndustrials(String industrials) {
        this.industrials = industrials;
    }

    public String getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(String realEstate) {
        this.realEstate = realEstate;
    }

    public String getTelecommunicationServices() {
        return telecommunicationServices;
    }

    public void setTelecommunicationServices(String telecommunicationServices) {
        this.telecommunicationServices = telecommunicationServices;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getConsumerDiscretionary() {
        return consumerDiscretionary;
    }

    public void setConsumerDiscretionary(String consumerDiscretionary) {
        this.consumerDiscretionary = consumerDiscretionary;
    }

    public String getHealthCare() {
        return healthCare;
    }

    public void setHealthCare(String healthCare) {
        this.healthCare = healthCare;
    }

    public String getInformationTechnology() {
        return informationTechnology;
    }

    public void setInformationTechnology(String informationTechnology) {
        this.informationTechnology = informationTechnology;
    }

    public String getFinancials() {
        return financials;
    }

    public void setFinancials(String financials) {
        this.financials = financials;
    }
}
