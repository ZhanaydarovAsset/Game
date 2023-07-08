package units;

public class Bandit extends Infantry{
    public Bandit(String name, int x, int y) {
        super(name, 100, "Bandit", 4, 3, x, y);
    }

    @Override
    public String getInfo(){
        return String.format("Name: %s, type: %s, x: %d, y: %d", name, type, playgraund.x, playgraund.y);
    }
}
