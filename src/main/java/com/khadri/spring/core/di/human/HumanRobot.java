package com.khadri.spring.core.di.human;

import java.util.List;

public class HumanRobot {
    String name;
    Head head ;
    Legs legs;
    Hands hands;
    List<Integer> boltsAndScrews;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public Hands getHands() {
        return hands;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public List<Integer> getBoltsAndScrews() {
        return boltsAndScrews;
    }

    public void setBoltsAndScrews(List<Integer> boltsAndScrews) {
        this.boltsAndScrews = boltsAndScrews;
    }

    @Override
    public String toString() {
        return "HumanRobot{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", legs=" + legs +
                ", hands=" + hands +
                ", boltsAndScrews=" + boltsAndScrews +
                '}';
    }
}
