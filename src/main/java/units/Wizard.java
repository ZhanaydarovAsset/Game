package units;

import java.util.ArrayList;

public abstract class Wizard extends BaseHero{
    public Wizard(String name, int health, String type, int queue, int baseDamage, int healing, int x, int y) {
        super(name, health, type, queue, baseDamage, x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> their) {

    }
}
