package classes;

import utilities.*;

import java.util.Objects;

public class Rabbit extends Hero {

    private final Home home = Home.RabbitHome;

    public Rabbit(String name) {
        super(name);
        setCurrentPosition(Home.RabbitHome);
    }

    public Home getHome() {
        return home;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rabbit)) return false;
        Rabbit rabbit = (Rabbit) o;
        return getHome() == rabbit.getHome() && Objects.equals(getName(), rabbit.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "home=" + home +
                '}';
    }
}
