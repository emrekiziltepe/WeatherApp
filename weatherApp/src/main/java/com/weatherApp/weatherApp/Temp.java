package com.weatherApp.weatherApp;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temp {

    private int temp;

    public int getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = (int) (Math.floor(temp) - 273);
    }

    @Override
    public String toString() {
        return "" + temp + "";
    }


}
