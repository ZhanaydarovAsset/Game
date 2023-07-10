package units;

import java.util.ArrayList;

public abstract class BaseHero implements Interface {
    public String name;
    public int health;
    public String type;
    public int queue; // очередь

    public int getQueue() {
        return queue;
    }

    public int baseDamage;
    Coordinate playgraund;

    public BaseHero(String name, int health, String type, int queue, int baseDamage, int x, int y) {
        this.name = name;
        this.health = health;
        this.type = type;
        this.queue = queue;
        this.baseDamage = baseDamage;
        playgraund = new Coordinate(x, y);
    }

    protected BaseHero findEnemy(ArrayList<BaseHero> enemies) {
        double min = 1000;
        int count = 0;
        for (int i = 0; i < enemies.size(); i++) {
            if (playgraund.calcDistanse(enemies.get(i).playgraund) < min) {
                min = playgraund.calcDistanse(enemies.get(i).playgraund);
                count = i;
            }
        }
        return enemies.get(count);
    }

}
