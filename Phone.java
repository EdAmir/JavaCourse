package com.company;

public class Phone {

    public String num, weight;
    public String model;

    public Phone(String name, String weight, String model) {
    }

    public String receiveCall(String name) {
        return (num + "  " + "Звонит" + " " + name);
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNum() {
        return num;
    }

    public String getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }


}
