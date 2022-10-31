/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sunayanashivanagi
 */
public class Community extends City {

    private String communityName;
    private int pinCode;
    private String landMark;

    public Community(String communityName, int pinCode, String landMark, String cityName, String stateName, String country) {
        super(cityName, stateName, country);
        this.communityName = communityName;
        this.pinCode = pinCode;
        this.landMark = landMark;
    }

    Community() {
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    @Override
    public String toString() {
        return "Community{" + "communityName=" + communityName + ", pinCode=" + pinCode + ", landMark=" + landMark + '}';
    }

}
