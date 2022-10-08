package com.example.main;

import com.example.data.Employee;

import java.util.Arrays;

public class Implementation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee("Vaibhav",12);
        Employee employee1 = new Employee("Vaibhav", 12);
        System.out.println("employee.equals(employee1) = " + employee.equals(employee1));
        System.out.println("employee.hashCode() = " + employee.hashCode());
        System.out.println("employee1.hashCode() = " + employee1.hashCode());
        System.out.println("employee = " + employee);
        System.out.println("employee1 = " + employee1);
        //Employee [name = Vaibhav, empCode = 12]
        /*
        employee = com.example.data.Employee@a9a423f4
        employee1 = com.example.data.Employee@a9a423f4
         */
        //Employee employee2 = (Employee) employee.clone();
        Employee employee3 = (Employee) employee;
        employee3.setName("Ramesh");
        System.out.println("employee = " + employee);
        System.out.println("employee3 = " + employee3);

        int[] arr = {10,20,30,40};
        int[] brr = arr.clone();
        brr[1] = 100;

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(brr) = " + Arrays.toString(brr));
        


    }
}
