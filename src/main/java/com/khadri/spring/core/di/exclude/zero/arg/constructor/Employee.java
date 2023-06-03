package com.khadri.spring.core.di.exclude.zero.arg.constructor;

public class Employee {
    private int empId;

    Employee(){
        System.out.println("no-arg constructor");
    }
    Employee(int empId){
        System.out.println("Constructor executed "+empId);
        this.empId = empId;
    }

    public void setEmpId(int empId) {
        System.out.println("setter method executed");
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                '}';
    }
}
