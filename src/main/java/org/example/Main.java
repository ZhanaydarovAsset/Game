package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BaseHero monk = new Monk("Monah");
        BaseHero pikeman = new Pikeman("Leo");
        BaseHero archer = new Archer("Shrek");

        BaseHero peasant = new Peasant("Holop");

        BaseHero mag = new Mage("Merlin");
        BaseHero bandit = new Bandit("Max");
        BaseHero sniper = new Sniper("Howk");


        ArrayList<BaseHero> list = new ArrayList<>();
        list.add(monk);
        list.add(peasant);
        list.add(mag);
        list.add(pikeman);
        list.add(bandit);
        list.add(sniper);
        list.add(archer);

        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            int k = new Random().nextInt(7);
            switch (k) {
                case 0:
                    team1.add(new Mage("Alisa"));
                    break;
                case 1:
                    team1.add(new Archer("Masha"));
                    break;
                case 2:
                    team1.add(new Sniper("Saske"));
                    break;
                case 3:
                    team1.add(new Pikeman("Gektor"));
                    break;
                case 4:
                    team1.add(new Bandit("Loki"));
                    break;
                case 5:
                    team1.add(new Monk("Li"));
                    break;
                default:
                    team1.add(new Peasant("Ivan"));
            }
        }
        for(int i = 0; i < 10; i++) {
            int k = new Random().nextInt(4);
            switch (k) {
                case 0:
                    team2.add(new Mage("Alisa"));
                    break;
                case 1:
                    team2.add(new Archer("Masha"));
                    break;
                case 2:
                    team2.add(new Pikeman("Gektor"));
                    break;
                default:
                    team2.add(new Peasant("Ivan"));
            }
        }
        System.out.println("Team #1");
        team1.forEach(j -> System.out.println(j.getInfo()));
        System.out.println("Team #2");
        team2.forEach(n -> System.out.println(n.getInfo()));
    }
}