package classes;

import utilities.*;

public class Pooh extends Hero {
    public Pooh(String name) {
        super(name);
        setCurrentPosition(Home.PoohHome);
    }

    private final Home home = Home.PoohHome;

    public void thinkOfHoney(Status s) {
        if ((s.getCurrentWeather()[0] == Weather.Cold) && (s.getCurrentWeather()[1] == Weather.Foggy)) {
            this.Afraid = true;
        }
        System.out.println(this.getName() + " представил себе мед, который пчёлы не смогут " +
                "сделать из-за плохой погоды.");
    }

    @Override
    public void goHome(Home h) {
        currentPosition = h;
        System.out.println(name + " подошел к " + currentPosition.getHomeName() + ".");
    }

    public Home getHome() {
        return home;
    }
}
