/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sunayanashivanagi
 */
public class City {
    
    private String cityName;
    private String stateName;
    private String country;
    

    public City(String cityName, String stateName, String country) {
        this.cityName = cityName;
        this.stateName = stateName;
        this.country = country;
        
    }

    City() {
    }
    
    
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
    
   

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    
    

    @Override
    public String toString() {
        return "City{" + "cityName=" + cityName + '}';
    }
    
    
    
}
