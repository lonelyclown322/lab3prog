package classes;

import utilities.*;

import java.util.Objects;

public class Roo extends Hero {
    public Roo(String name) {
        super(name);
        setCurrentPosition(Home.RooHome);
    }

    private final Home home = Home.RooHome;

    public Home getHome() {
        return home;
    }

    @Override
    public String toString() {
        return "Roo{" +
                "home=" + home +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Roo)) return false;
        Roo roo = (Roo) o;
        return getHome() == roo.getHome() && Objects.equals(getName(), roo.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHome()) + Objects.hash(getName());
    }
}
