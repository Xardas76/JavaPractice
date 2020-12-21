package com.company;

public class Address1 {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    private String apart;

    private String sep;

    public Address1(String address){
        sep = ",";
        String[] strings = address.split(sep);
        if(strings.length<7){
            throw new IllegalArgumentException();
        }

        country=strings[0].trim();
        region = strings[1].trim();
        city = strings[2].trim();
        street = strings[3].trim();
        house = strings[4].trim();
        corpus = strings[5].trim();
        apart = strings[6].trim();
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getCorpus() {
        return corpus;
    }

    public String getApart() {
        return apart;
    }

    @Override
    public String toString() {
        return "Address1{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", apart='" + apart + '\'' +
                '}';
    }
}
