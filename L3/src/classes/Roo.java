package classes;

import utilities.*;

public class Roo extends Hero {
    public Roo(String name) {
        super(name);
        setCurrentPosition(Home.RooHome);
    }

    private final Home home = Home.RooHome;

    public Home getHome() {
        return home;
    }
}
