package classes;

import utilities.*;

import java.util.Objects;

public class Pyatachok extends Hero {
    public Pyatachok(String name) {
        super(name);
        setCurrentPosition(Home.PyatachokHome);
    }

    private final Home home = Home.PyatachokHome;

    @Override
    public void goHome(Home h) {
        this.setCurrentPosition(h);
        System.out.println(this.getName() + " подошел к " + this.getCurrentPosition().getHomeName() + ".");
    }

    public void thinkOfEvilPlan(Status s) {
        if ((s.getCurrentWeather()[0] == Weather.Cold) && (s.getCurrentWeather()[1] == Weather.Foggy)) {
            System.out.println(this.getName() + " думал о том, как грустно будет тому, кого будто бы случайно" +
                    " забудут в этот день в лесу.");
        }
    }

    public void shareEvilPlan(Status s, Tiger t) {
        if (((s.getCurrentWeather()[0] == Weather.Cold) && (s.getCurrentWeather()[1] == Weather.Foggy)) &&
                (t.jumpsForward())) {
            System.out.println(this.getName() + " сказал: \"День подходящий, " + t.getName() + " всегда выскакивает вперед," +
                    " так что все получится.\"");
        }
    }

    public Home getHome() {
        return home;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pyatachok)) return false;
        Pyatachok pyatachok = (Pyatachok) o;
        return getHome() == pyatachok.getHome() && Objects.equals(getName(), pyatachok.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHome()) + Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Pyatachok{" +
                "home=" + home +
                '}';
    }
}
