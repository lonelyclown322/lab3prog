package classes;

import utilities.*;

public class Hike {
    private final Hero[] heroes;

    public Hike(Hero[] heroes, String name) {
        this.heroes = heroes;
        for (int i = 0; i < heroes.length - 1; i++) {
            System.out.print(heroes[i].getName() + ", ");
        }
        System.out.println(heroes[heroes.length - 1].getName() + " выступят в " + name + ".");
    }

    public Hero[] getHeroes() {
        return heroes;
    }
}
