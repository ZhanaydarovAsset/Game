package org.example;

public abstract class BaseHero implements Interface {
    public String name;
    public int health;
    public String type;
    public int queue; // очередь
    public int baseDamage;

    public BaseHero(String name, int health, String type, int queue, int baseDamage) {
        this.name = name;
        this.health = health;
        this.type = type;
        this.queue = queue;
        this.baseDamage = baseDamage;
    }

}
