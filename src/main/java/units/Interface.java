package units;

import java.util.ArrayList;

public interface Interface {
    void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> their);
    String getInfo();
}
