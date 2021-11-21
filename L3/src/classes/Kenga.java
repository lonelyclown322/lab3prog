package classes;

import utilities.*;

public class Kenga extends Hero {
    public Kenga(String name) {
        super(name);
        setCurrentPosition(Home.KengaHome);
    }

    private final Home home = Home.KengaHome;

    public Home getHome() {
        return home;
    }
}
