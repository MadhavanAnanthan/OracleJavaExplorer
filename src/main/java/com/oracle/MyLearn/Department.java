package com.oracle.MyLearn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Department {

    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    private static Employee[] employeeList = new Employee[10];
    private int lastAddedEmployeeIndex = -1;

    public void addEmp(Employee anEmployee) {
        if (lastAddedEmployeeIndex < employeeList.length) {
            lastAddedEmployeeIndex++;
            employeeList[lastAddedEmployeeIndex] = anEmployee;
        }
    }

    public Employee[] getAllEmpDetails() {
        Employee[] actualEmployee = new Employee[lastAddedEmployeeIndex + 1];
        for (int i = 0; i < actualEmployee.length; i++) {
            actualEmployee[i] = employeeList[i];
        }
        return actualEmployee;
    }

    public int getAllEmpCount() {
        return lastAddedEmployeeIndex + 1;
    }

    public Employee getEmpByID(int empId) {
        for (Employee emp : employeeList) {
            if (emp.getEmpId() == (empId)) {
                return emp;
            }
        }
        return null;
    }
}
