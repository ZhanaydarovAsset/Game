package org.example;

public abstract class Wizard extends BaseHero{
    public Wizard(String name, int health, String type, int queue, int baseDamage) {
        super(name, health, type, queue, baseDamage);
    }
    int healing;
}
