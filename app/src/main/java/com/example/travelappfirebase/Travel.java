package com.example.travelappfirebase;

public class Travel {
    private String Travel_name;

    private int Travel_range;
    private String url;

    public Travel(){
    }

    public Travel(String travel_name,int travel_range,String url) {
        this.Travel_name = travel_name;
        this.url = url;
        this.Travel_range = travel_range;
    }

    public String getTravel_name() {
        return Travel_name;
    }

    public void setTravel_name(String travel_name) {
        Travel_name = travel_name;
    }

    public int getTravel_range() {
        return Travel_range;
    }

    public void setTravel_range(int travel_range) {
        Travel_range = travel_range;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
