package classes;

import utilities.*;

public class Rabbit extends Hero {
    public Rabbit(String name) {
        super(name);
        setCurrentPosition(Home.RabbitHome);
    }

    private final Home home = Home.RabbitHome;

    public Home getHome() {
        return home;
    }
}
