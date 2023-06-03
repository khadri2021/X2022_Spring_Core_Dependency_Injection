package com.khadri.spring.core.di.constructor.setter;

public class Water {

    private String mineral;

    public void setMineral(String mineral) {
        this.mineral = mineral;
    }

    @Override
    public String toString() {
        return "Water{" +
                "mineral='" + mineral + '\'' +
                '}';
    }
}
