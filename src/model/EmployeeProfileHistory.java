/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sunayanashivanagi
 */
public class EmployeeProfileHistory {
    
    private ArrayList<EmployeeProfile> history;
    
    public EmployeeProfileHistory()
    {
    this.history= new ArrayList<EmployeeProfile>();
     addNewEmployee(new EmployeeProfile("John",100,23,"Male","23 Sept 2022",13,"CNAS","Front-End Developer",12312123,"john@n.co"));
        addNewEmployee(new EmployeeProfile("Jose",101,25,"Female","23 Jan 2021",10,"YELLOW","Back-End Developer",12312123,"jose@n.co"));
        addNewEmployee(new EmployeeProfile("Adam",102,27,"Male","22 Oct 2019",8,"ORANGE","Senior Developer",12312123,"adam@n.co"));
        addNewEmployee(new EmployeeProfile("Karen",103,30,"female","23 April 2016",6,"CNAS","Project Manager",12312123,"jose@n.co"));
        addNewEmployee(new EmployeeProfile("Jack",104,25,"Male","23 Sept 2022",13,"CNAS","Front-End Developer",12312123,"jack@n.co"));
        addNewEmployee(new EmployeeProfile("Jin",105,25,"Female","23 Sept 2022",13,"CNAS","Front-End Developer",12312123,"jin@n.co"));
    
    }

    public ArrayList<EmployeeProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeProfile> history) {
        this.history = history;
    }
    
    public EmployeeProfile addNewEmployee(EmployeeProfile employeeProfile){
      history.add(employeeProfile);
      System.out.println("Employee Added->"+employeeProfile);
      return employeeProfile;     
    }
    
    public void deleteEmployee(int index)
    {
        history.remove(index);
    }
    
    public void updateEmployee(EmployeeProfile pe, int index)
    {
        history.set(index, pe);
    }
    
}
