package units;

public class Monk extends Wizard {
    public Monk(String name, int x, int y) {
        super(name, 100, "Monk", 7, 0, 2, x, y);
    }


    @Override
    public String getInfo() {
        return String.format("Name: %s, type: %s, hp %d, damage: %d", name, type, health, baseDamage);
    }
}
