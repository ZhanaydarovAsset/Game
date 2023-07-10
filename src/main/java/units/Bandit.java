package units;

public class Bandit extends Infantry{
    public Bandit(String name, int x, int y) {
        super(name, 100, "Bandit", 7, 3, x, y);
    }

    @Override
    public String getInfo(){
        return String.format("Name: %s, type: %s, hp: %d", name, type, health);
    }
}
