package org.example;

public class Pikeman extends Infantry{
    public Pikeman(String name) {
        super(name, 100, "Pikeman", 3, 3);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo(){
        return ("Name: "+ name + " Hp: " + health + " Type :" + type);
    }
}
