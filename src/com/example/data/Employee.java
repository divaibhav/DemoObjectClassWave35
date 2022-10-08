package com.example.data;

import java.util.Objects;

public class Employee {
    private String name;
    private int empCode;

    public Employee() {
    }

    public Employee(String name, int empCode) {
        this.name = name;
        this.empCode = empCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }
    /*public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else {
           //to access, cast the object to child
            //before casting check for the type of class, by using instanceof
            // obj instanceof Employee
            if(obj instanceof Employee) {
                Employee emp = (Employee) obj;
                if (this.getName().equals(emp.getName()) && this.getEmpCode() == emp.getEmpCode()) {
                    return true;
                }
            }
        }
        return false;
    }*/
    @Override
   public boolean equals(Object obj){
       if(this == obj){
           return true;
       }
       if(!(obj instanceof Employee)){
           return false;
       }
       Employee emp = (Employee) obj;
       if (this.getName().equals(emp.getName()) && this.getEmpCode() == emp.getEmpCode()) {
           return true;
       }
       return false;
   }
   @Override
   public int hashCode(){
       return Objects.hash(name, empCode);
    }
    /*@Override
    public String toString(){
        //Employee [name = Vaibhav, empCode = 12]
        return "Employee [name = " + name + ", empCode = " + empCode + "]";
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empCode=" + empCode +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
