package Donnerstag3;

public class Friend {

    private String name;
    private int age;
    private String city;
    private String country;
    private int knowSince;
    private String homeCountry;

    public Friend(String name, int age, String city, String country, int knowSince) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
        this.knowSince = knowSince;

    }

    public String getHomeCountry() {
        return homeCountry;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getKnowSince() {
        return knowSince;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", knowSince=" + knowSince +
                '}';
    }
}
