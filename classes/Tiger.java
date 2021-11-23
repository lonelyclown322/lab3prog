package classes;

import utilities.*;

import java.util.Objects;

public class Tiger extends Hero {

    private final Home home = Home.TigerHome;

    public Tiger(String name) {
        super(name);
        setCurrentPosition(Home.TigerHome);
    }

    public Home getHome() {
        return home;
    }

    public boolean jumpsForward() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tiger)) return false;
        Tiger tiger = (Tiger) o;
        return getHome() == tiger.getHome() && Objects.equals(getName(), tiger.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "home=" + home +
                '}';
    }
}
