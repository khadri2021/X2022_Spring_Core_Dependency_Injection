package com.khadri.spring.core.di.setter;

public class Student {

    //properties
    private Integer stdNo;

    //constructors
    Student(){
        System.out.println("Student constructor");
    }

   //methods
    public void setStdNo(Integer stdNo) {
        System.out.println("setter method executing : "+stdNo);

        this.stdNo = stdNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdNo=" + stdNo +
                '}';
    }
}
