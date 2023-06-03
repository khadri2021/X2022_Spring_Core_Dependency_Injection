package com.khadri.spring.core.di.constructor;

public class Customer {
    private int custId;

    public Customer(int custId){
        System.out.println("Customer constructor");
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                '}';
    }
}
