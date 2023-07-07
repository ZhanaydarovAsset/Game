package org.example;

public class Peasant extends BaseHero{
    public Peasant(String name) {
        super(name, 100, "Peasant", 2, 0);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo(){
        return ("Name: "+ name + " Hp: " + health + " Type :" + type);
    }
}
