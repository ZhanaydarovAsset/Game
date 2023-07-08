package units;

import java.util.ArrayList;

public class Peasant extends BaseHero{
    public Peasant(String name, int x, int y) {

        super(name, 100, "Peasant", 2, 0, x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies) {
        int[] temp =  findEnemy(enemies);
        System.out.println(enemies.get(temp[1]).name + " " + temp[0]);
    }

    @Override
    public String getInfo(){
        return String.format("Name: %s, type: %s, x: %d, y: %d", name, type, playgraund.x, playgraund.y);
    }
}
