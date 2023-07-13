package units;

import java.util.ArrayList;

public abstract class Wizard extends BaseHero{
    int healing;
    public Wizard(String name, int health, String type, int queue, int baseDamage, int healing, int x, int y) {
        super(name, health, type, queue, baseDamage, x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> their) {
        if(this.health > 0){
            for(BaseHero item : their){
                if(item.health < 98){
                    item.health += this.healing;
                    System.out.println("Вылечил :" + item.type);
                    return;
                }
            }
            BaseHero temp =  findEnemy(enemies);
            temp.health -= this.healing;
        }
    }
}
