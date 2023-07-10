package units;

import java.util.ArrayList;

public class Peasant extends BaseHero{
    public Peasant(String name, int x, int y) {

        super(name, 100, "Peasant", 5, 0, x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> their) {

    }

    @Override
    public String getInfo(){
        return String.format("Name: %s, type: %s, hp: %d", name, type, health);
    }
}
