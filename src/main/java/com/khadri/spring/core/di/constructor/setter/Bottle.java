package com.khadri.spring.core.di.constructor.setter;

public class Bottle {
    private Water water;

    public Bottle(Water water){
        this.water = water;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "water=" + water +
                '}';
    }
}
