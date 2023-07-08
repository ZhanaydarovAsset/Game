package units;

public class Archer extends Shooters{
    public Archer(String name, int x, int y) {
        super(name, 100, "Archer", 7, 5, x, y);
    }

    @Override
    public String getInfo(){
        return String.format("Name: %s, type: %s, x: %d, y: %d", name, type, playgraund.x, playgraund.y);
    }
}
