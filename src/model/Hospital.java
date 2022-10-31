/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sunayanashivanagi
 */
public class Hospital extends Community {

    private String hospitalName;
    private int numberOfDoctors;
    private String speciality;

    public int getNumberOfDoctors() {
        return numberOfDoctors;
    }

    public void setNumberOfDoctors(int numberOfDoctors) {
        this.numberOfDoctors = numberOfDoctors;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Hospital(String hospitalName, int numberOfDoctors, String speciality, String communityName, int pinCode, String landMark,String cityName, String stateName, String country) {
        super(communityName, pinCode, landMark,cityName, stateName, country);
        this.hospitalName = hospitalName;
        this.numberOfDoctors = numberOfDoctors;
        this.speciality = speciality;
    }

}
