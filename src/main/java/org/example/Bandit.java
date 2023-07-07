package org.example;

public class Bandit extends Infantry{
    public Bandit(String name) {
        super(name, 100, "Bandit", 4, 3);
    }

    @Override
    public void step() {

    }
    @Override
    public String getInfo(){
        return ("Name: "+ name + " Hp: " + health + " Type :" + type);
    }
}
