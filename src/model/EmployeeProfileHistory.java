/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sunayanashivanagi
 */
public class EmployeeProfileHistory {
    
    private ArrayList<EmployeeProfile> history;

    public EmployeeProfileHistory() {
        this.history = new ArrayList<EmployeeProfile>();
        addNewEmployee(new EmployeeProfile("John",100,23,"Male",new Date(22,9,2),13,"CNAS","Front-End Developer",12312123,"john@n.co"));
        addNewEmployee(new EmployeeProfile("Jose",101,25,"Female",new Date(22,9,2),10,"YELLOW","Back-End Developer",12312123,"jose@n.co"));
        addNewEmployee(new EmployeeProfile("Adam",102,27,"Male",new Date(22,9,2),8,"ORANGE","Senior Developer",12312123,"adam@n.co"));
        addNewEmployee(new EmployeeProfile("Karen",103,30,"female",new Date(22,9,2),6,"CNAS","Project Manager",12312123,"jose@n.co"));
        addNewEmployee(new EmployeeProfile("Vignesh",104,25,"Male",new Date(22,9,2),13,"CNAS","Front-End Developer",12312123,"vignesh@n.co"));
        addNewEmployee(new EmployeeProfile("Sonu",105,25,"Female",new Date(22,9,2),13,"CNAS","Front-End Developer",12312123,"sonu@n.co"));

    }   

    public ArrayList<EmployeeProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeProfile> history) {
        this.history = history;
    }
    
    public EmployeeProfile addNewEmployee(EmployeeProfile employeeProfile){
        System.out.println("Employee Added->"+employeeProfile);
        history.add(employeeProfile); 
        return employeeProfile;
    }
    
    public void deleteEmployee(int index){
        history.remove(index);
    }
    
    public void updateEmployee(EmployeeProfile ep,int index){
        history.set(index,ep);
    }
    public void deleteAll(){
    history.removeAll(history);
    }
    @Override
    public String toString() {
        return "EmployeeProfileHistory{" + "history=" + history + '}';
    }
    
}