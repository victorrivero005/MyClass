/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author victor.rivero005
 */
public class Employee {
    private String name;
    private int id;
    private String department;
    private String position;
    
    
    //Getters
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public String getPosition(){
        return position;
    }
    
    //Setters
    
    public void setName(String empName){
        name = empName;
    }
    
    public void setId(int empId){
        if (empId > 0) {
            id = empId;
        }
        else {
            System.out.println("ERROR: Invalid ID!");
        }
    }
    
    public void setDepartment (String empDept){
        department = empDept;
    }
    
    public void setPosition(String empPos){
        position = empPos;
    }
   
}
