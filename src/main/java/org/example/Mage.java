package org.example;

public class Mage extends Wizard {
    public Mage(String name) {
        super(name, 100, "Mage", 1, 0, 3);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo(){
        return ("Name: "+ name + " Hp: " + health + " Type :" + type);
    }
}
