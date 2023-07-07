package org.example;

public class Archer extends Shooters{
    public Archer(String name) {
        super(name, 100, "Archer", 7, 5);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo(){
        return ("Name: "+ name + " Hp: " + health + " Type :" + type);
    }
}
