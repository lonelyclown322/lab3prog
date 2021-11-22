package classes;

import utilities.*;

import java.util.Arrays;

public class Hike {
    private final Hero[] heroes;

    private final String name;

    public Hike(Hero[] heroes, String name) {
        this.name = name;
        this.heroes = heroes;
        for (int i = 0; i < heroes.length - 1; i++) {
            System.out.print(heroes[i].getName() + ", ");
        }
        System.out.println(heroes[heroes.length - 1].getName() + " выступят в " + name + ".");
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hike)) return false;
        Hike hike = (Hike) o;
        return Arrays.equals(getHeroes(), hike.getHeroes());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getHeroes());
    }

    @Override
    public String toString() {
        return "Hike= " + name;
    }
}
