package units;

public class Pikeman extends Infantry{
    public Pikeman(String name, int x, int y) {
        super(name, 100, "Pikeman", 3, 3, x, y);
    }


    @Override
    public String getInfo(){
        return String.format("Name: %s, type: %s, x: %d, y: %d", name, type, playgraund.x, playgraund.y);
    }
}
