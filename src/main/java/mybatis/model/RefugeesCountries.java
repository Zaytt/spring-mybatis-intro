package mybatis.model;

public class RefugeesCountries {
    int id;
    int year;
    String asylum_country;
    String origin_country;
    int refugees;
    int asylum_seekers;
    int refugees_returned;
    int idps;
    int idps_returned;
    int stateless_persons;
    int others_of_concern;
    int total_population;

    public RefugeesCountries(int id, int year, String asylum_country, String origin_country, int refugees,
                             int asylum_seekers, int refugees_returned, int idps, int idps_returned,
                             int stateless_persons, int others_of_concern, int total_population) {
        this.id = id;
        this.year = year;
        this.asylum_country = asylum_country;
        this.origin_country = origin_country;
        this.refugees = refugees;
        this.asylum_seekers = asylum_seekers;
        this.refugees_returned = refugees_returned;
        this.idps = idps;
        this.idps_returned = idps_returned;
        this.stateless_persons = stateless_persons;
        this.others_of_concern = others_of_concern;
        this.total_population = total_population;
    }

    public RefugeesCountries(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAsylum_country() {
        return asylum_country;
    }

    public void setAsylum_country(String asylum_country) {
        this.asylum_country = asylum_country;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    public int getRefugees() {
        return refugees;
    }

    public void setRefugees(int refugees) {
        this.refugees = refugees;
    }

    public int getAsylum_seekers() {
        return asylum_seekers;
    }

    public void setAsylum_seekers(int asylum_seekers) {
        this.asylum_seekers = asylum_seekers;
    }

    public int getRefugees_returned() {
        return refugees_returned;
    }

    public void setRefugees_returned(int refugees_returned) {
        this.refugees_returned = refugees_returned;
    }

    public int getIdps() {
        return idps;
    }

    public void setIdps(int idps) {
        this.idps = idps;
    }

    public int getIdps_returned() {
        return idps_returned;
    }

    public void setIdps_returned(int idps_returned) {
        this.idps_returned = idps_returned;
    }

    public int getStateless_persons() {
        return stateless_persons;
    }

    public void setStateless_persons(int stateless_persons) {
        this.stateless_persons = stateless_persons;
    }

    public int getOthers_of_concern() {
        return others_of_concern;
    }

    public void setOthers_of_concern(int others_of_concern) {
        this.others_of_concern = others_of_concern;
    }

    public int getTotal_population() {
        return total_population;
    }

    public void setTotal_population(int total_population) {
        this.total_population = total_population;
    }
}
