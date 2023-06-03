package com.khadri.spring.core.di.setter.different.args;

import java.util.Set;

public class KeyBoard {

    private Set<Integer> numericKeys;

    private Set<String> alphaKeys;


    public void setAlphaKeys(Set<String> alphaKeys) {
        this.alphaKeys = alphaKeys;
    }

    public void setNumericKeys(Set<Integer> numericKeys) {
        this.numericKeys = numericKeys;
    }

    @Override
    public String toString() {
        return "KeyBoard{" +
                "numericKeys=" + numericKeys +
                ", alphaKeys=" + alphaKeys +
                '}';
    }
}
