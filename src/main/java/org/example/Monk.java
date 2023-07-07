package org.example;

public class Monk extends Wizard {
    public Monk(String name) {
        super(name, 100, "Monk", 5, 0, 2);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return ("Name: " + name + " Hp: " + health + " Type :" + type);
    }
}
