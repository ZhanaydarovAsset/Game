package units;

public class Monk extends Wizard {
    public Monk(String name, int x, int y) {
        super(name, 100, "Monk", 5, 0, 2, x, y);
    }


    @Override
    public String getInfo() {
        return String.format("Name: %s, type: %s, x: %d, y: %d", name, type, playgraund.x, playgraund.y);
    }
}
