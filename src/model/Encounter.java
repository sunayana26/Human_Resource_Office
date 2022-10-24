/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author sunayanashivanagi
 */
  public class Encounter {

    private Date date;

    private VitalSigns vitalSigns;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Encounter(Date date, VitalSigns vitalSigns) {
        this.date = date;

        this.vitalSigns = vitalSigns;
    }

    @Override
    public String toString() {
        return "Encounter{" + "date=" + date + ",  vitalSigns=" + vitalSigns + '}';
    }  
    
    
    
    
}
