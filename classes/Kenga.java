package classes;

import utilities.*;

import java.util.Objects;

public class Kenga extends Hero {

    private final Home home = Home.KengaHome;

    public Kenga(String name) {
        super(name);
        setCurrentPosition(Home.KengaHome);
    }

    public Home getHome() {
        return home;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kenga)) return false;
        Kenga kenga = (Kenga) o;
        return getHome() == kenga.getHome() && Objects.equals(getName(), kenga.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Kenga{" +
                "home=" + home +
                '}';
    }
}
