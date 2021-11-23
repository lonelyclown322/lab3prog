package classes;

import utilities.*;

import java.util.Objects;

public class Pooh extends Hero {

    private final Home home = Home.PoohHome;

    public Pooh(String name) {
        super(name);
        setCurrentPosition(Home.PoohHome);
    }

    public void thinkOfHoney(Status s) {
        if ((s.getCurrentWeather()[0] == Weather.Cold) && (s.getCurrentWeather()[1] == Weather.Foggy)) {
            this.getAfraid(true);
        }
        System.out.println(this.getName() + " представил себе мед, который пчёлы не смогут " +
                "сделать из-за плохой погоды.");
    }

    @Override
    public void goTo(Home h) {
        this.setCurrentPosition(h);
        System.out.println(this.getName() + " подошел к " + this.getCurrentPosition().getHomeName() + ".");
    }

    public Home getHome() {
        return home;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pooh)) return false;
        Pooh pooh = (Pooh) o;
        return getHome() == pooh.getHome() && Objects.equals(getName(), pooh.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Pooh{" +
                "home=" + home +
                '}';
    }
}
