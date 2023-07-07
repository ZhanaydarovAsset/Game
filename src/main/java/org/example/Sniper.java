package org.example;

public class Sniper extends Shooters {
    public Sniper(String name) {
        super(name, 100, "Sniper", 6, 5);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return ("Name: " + name + " Hp: " + health + " Type :" + type);
    }
}
