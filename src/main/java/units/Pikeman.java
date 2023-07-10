package units;

public class Pikeman extends Infantry{
    public Pikeman(String name, int x, int y) {
        super(name, 100, "Pikeman", 8, 3, x, y);
    }


    @Override
    public String getInfo(){
        return String.format("Name: %s, type: %s, hp: %d", name, type, health);
    }
}
