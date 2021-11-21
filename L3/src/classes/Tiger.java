package classes;

import utilities.*;

public class Tiger extends Hero {
    public Tiger(String name) {
        super(name);
        setCurrentPosition(Home.TigerHome);
    }

    private final Home home = Home.TigerHome;

    public Home getHome() {
        return home;
    }

    public boolean jumpsForward() {
        return true;
    }
}
