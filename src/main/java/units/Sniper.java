package units;

public class Sniper extends Shooters {
    public Sniper(String name, int x, int y) {
        super(name, 100, "Sniper", 6, 5, x, y);
    }


    @Override
    public String getInfo() {
        return String.format("Name: %s, type: %s, x: %d, y: %d", name, type, playgraund.x, playgraund.y);
    }
}
