package units;

import java.util.ArrayList;

public abstract class Infantry extends BaseHero{
    public Infantry(String name, int health, String type, int queue, int baseDamage, int x, int y) {
        super(name, health, type, queue, baseDamage, x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies) {
       int[] temp =  findEnemy(enemies);
        System.out.println(enemies.get(temp[1]).name + " " + temp[0]);
    }
}
