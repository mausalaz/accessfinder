package com.novelty.accessfinder.rest.dao;

import org.springframework.stereotype.Repository;

import com.novelty.accessfinder.rest.model.Employees;
import com.novelty.accessfinder.rest.entity.EmployeeEntity;
 
@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new EmployeeEntity(1L, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getEmployeeList().add(new EmployeeEntity(2L, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new EmployeeEntity(3L, "David", "Kameron", "titanic@gmail.com"));
    }
     
    public Employees getAllEmployees() 
    {
        return list;
    }
     
    public void addEmployee(EmployeeEntity employee) {
        list.getEmployeeList().add(employee);
    }
}
