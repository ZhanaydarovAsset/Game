package units;

public class Archer extends Shooters{
    public Archer(String name, int x, int y) {
        super(name, 100, "Archer", 10, 5, 10, x, y);
    }

    @Override
    public String getInfo(){
        return String.format("Name: %s, type: %s, hp: %d, shoots: %d", name, type, health, shoots);
    }
}
