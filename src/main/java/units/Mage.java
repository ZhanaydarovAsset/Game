package units;

public class Mage extends Wizard {
    public Mage(String name, int x, int y) {
        super(name, 100, "Mage", 1, 0, 3, x, y);
    }

    @Override
    public String getInfo(){
        return String.format("Name: %s, type: %s, x: %d, y: %d", name, type, playgraund.x, playgraund.y);
    }
}
