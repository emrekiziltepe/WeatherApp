package com.weatherApp.weatherApp;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    private String name;
    public Temp main;
    @JsonProperty("weather")
    public List<JsonProperties> property;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Temp getMain() {
        return main;
    }
    public void setMain(Temp main) {
        this.main = main;
    }
    public List<JsonProperties> getProperty() {
        return property;
    }
    public void setProperty(List<JsonProperties> property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Weather [name=" + name + ", main=" + main + ", property=" + property + "]";
    }



}


