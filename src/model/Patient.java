/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sunayanashivanagi
 */
public class Patient extends Person {

    private String disease;
    private House house;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Patient(String disease, House house, String name, int age, String gender, String emailId, long phoneNumber, String userName, String password) {
        super(name, age, gender, emailId, phoneNumber, userName, password);
        this.disease = disease;
        this.house = house;

    }

    public Patient() {
        this.disease = "";
    }

    @Override
    public String toString() {
        return "Patient{" + "disease=" + disease + '}';
    }

}
