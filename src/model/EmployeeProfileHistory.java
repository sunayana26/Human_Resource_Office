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
