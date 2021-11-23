package utilities;

import java.util.Objects;

import classes.Hike;

public abstract class Hero implements heroInterface {
    private final String name;
    private Home currentPosition;
    private boolean Afraid = false;

    public boolean getAfraid(boolean b) {
        return Afraid;
    }

    public void setAfraid(boolean t) {
        this.Afraid = t;
    }

    public Home getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Home currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Hero(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public void goTo(Home h) {
        currentPosition = h;
        System.out.println(name + " пойдет сейчас в " + currentPosition.getHomeName() + ".");
    }

    @Override
    public void inviteToHike(Hero whoIsAsked, Hike hike) {
        System.out.println(this.name + " хочет спросить " + whoIsAsked.getName() + ": \"Что ты завтра собираешься делать?" +
                " Если ничего, то давай сходим в " + hike.getName() + "?\"");
        hike.appendHeroInInvited(whoIsAsked);
    }

    @Override
    public void isAfraid() {
        if (!Afraid) {
            System.out.println(this.name + " не боялся.");
        } else {
            System.out.println(this.name + " испугался.");
        }
    }

    @Override
    public void shareFeelings(Hero h) {
        if (this.Afraid) {
            System.out.println(this.name + " сказал персонажу " + h.name + ", что ему страшно.");
        }
    }

    @Override
    public void beIndifferent(Hero h) {
        System.out.println(this.name + " сказал персонажу " + h.name + ", что его это не особо волнует.");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", currentPosition=" + currentPosition +
                ", Afraid=" + Afraid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hero)) return false;
        Hero hero = (Hero) o;
        return Objects.equals(getName(), hero.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}