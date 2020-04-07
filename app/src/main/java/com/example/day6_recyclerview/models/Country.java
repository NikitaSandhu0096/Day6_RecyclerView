package com.example.day6_recyclerview.models;

import android.content.SharedPreferences;

public class Country {
    private int countryId;
    private String countryName;
    private int countryFlag;
    private String description;

    public Country(int countryId, String countryName, int countryFlag, String description) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryFlag = countryFlag;
        this.description = description;
    }

    public Country(){
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(int countryFlag) {
        this.countryFlag = countryFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", countryFlag=" + countryFlag +
                ", description='" + description + '\'' +
                '}';
    }
}
