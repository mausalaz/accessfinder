package com.novelty.accessfinder.rest.model;

import java.util.ArrayList;
import java.util.List;

import com.novelty.accessfinder.rest.entity.EmployeeEntity;
 
public class Employees 
{
    private List<EmployeeEntity> employeeList;
     
    public List<EmployeeEntity> getEmployeeList() {
        if(employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }
  
    public void setEmployeeList(List<EmployeeEntity> employeeList) {
        this.employeeList = employeeList;
    }
}
