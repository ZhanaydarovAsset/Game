package org.example;

import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt(4);
            int y = new Random().nextInt(50);
            switch (k) {
                case 0:
                    team2.add(new Mage("Alisa", 0, new Random().nextInt(50)));
                    team1.add(new Monk("Li", 9, new Random().nextInt(50)));
                    break;
                case 1:
                    team2.add(new Archer("Masha", 0, new Random().nextInt(50)));
                    team1.add(new Sniper("Saske", 9, new Random().nextInt(50)));
                    break;
                case 2:
                    team2.add(new Pikeman("Gektor", 0, new Random().nextInt(50)));
                    team1.add(new Bandit("Loki", 9, new Random().nextInt(50)));
                    break;
                default:
                    team2.add(new Peasant("Ivan", 0, new Random().nextInt(50)));
                    team1.add(new Peasant("Holop", 9, new Random().nextInt(50)));
            }
        }
        System.out.println("Team #1");
        team1.forEach(j -> System.out.println(j.getInfo()));
        System.out.println("Team #2");
        team2.forEach(n -> System.out.println(n.getInfo()));

        team1.forEach(n -> n.step(team2));
        System.out.println("-".repeat(15));
        team2.forEach(n -> n.step(team1));
    }
}