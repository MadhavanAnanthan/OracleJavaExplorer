package com.oracle.MyLearn;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HRApp {


    public static void main(String[] args) {
        System.out.println("Application is started");
        Employee emp1 = new Employee(1,"Madhavan",10.0);
        Employee emp2 = new Employee(1,"Madhavan",10.0);
        Employee emp3 = new Employee(1,"Madhavan",10.0);
        Department Department = new Department("Education");
        Department.addEmp(emp1);
        Department.addEmp(emp2);
        Department.addEmp(emp3);
        Employee[] allEmpDetails = Department.getAllEmpDetails();
        for (Employee emp : allEmpDetails){
            System.out.println(emp);
        }
        System.out.println("Employee Count--> " +Department.getAllEmpCount());


    }
}
