package com.khadri.spring.core.di.setter.different.args;

public class Laptop {

    private KeyBoard keyBoard;

    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "keyBoard=" + keyBoard +
                ", model='" + model + '\'' +
                '}';
    }
}
