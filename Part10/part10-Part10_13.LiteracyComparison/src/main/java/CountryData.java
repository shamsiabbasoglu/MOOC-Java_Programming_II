
public class CountryData {

    private String gender;
    private String country;
    private int year;
    private String rate;

    public CountryData(String gender, String country, int year, String rate) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + rate;
    }
}
