package units;

public class Sniper extends Shooters {
    public Sniper(String name, int x, int y) {
        super(name, 100, "Sniper", 9, 5, 30, x, y);
    }


    @Override
    public String getInfo() {
        return String.format("Name: %s, type: %s, hp: %d, shoots: %d", name, type, health, shoots);
    }
}
