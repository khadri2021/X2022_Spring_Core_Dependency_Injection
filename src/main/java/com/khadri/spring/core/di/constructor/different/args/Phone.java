package com.khadri.spring.core.di.constructor.different.args;

public class Phone {
    private Sim sim;
    private String name;
    private Integer imei;
    private  Double cost;

    private String color;

    public Phone(Sim sim, String name, String color,Integer imei,double cost) {
        this.sim = sim;
        this.name = name;
        this.imei = imei;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "sim=" + sim +
                ", name='" + name + '\'' +
                ", imei=" + imei +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
