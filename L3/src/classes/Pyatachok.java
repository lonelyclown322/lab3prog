package classes;

import utilities.*;

public class Pyatachok extends Hero {
    public Pyatachok(String name) {
        super(name);
        setCurrentPosition(Home.PyatachokHome);
    }

    private final Home home = Home.PyatachokHome;

    @Override
    public void goHome(Home h) {
        currentPosition = h;
        System.out.println(name + " подошел к " + currentPosition.getHomeName() + ".");
    }

    public void thinkOfEvilPlan(Status s) {
        if ((s.getCurrentWeather()[0] == Weather.Cold) && (s.getCurrentWeather()[1] == Weather.Foggy)) {
            System.out.println(name + " думал о том, как грустно будет тому, кого будто бы случайно" +
                    " забудут в этот день в лесу.");
        }
    }

    public void shareEvilPlan(Status s, Tiger t) {
        if (((s.getCurrentWeather()[0] == Weather.Cold) && (s.getCurrentWeather()[1] == Weather.Foggy)) &&
                (t.jumpsForward())) {
            System.out.println(name + " сказал: \"День подходящий, " + t.getName() + " всегда выскакивает вперед," +
                    " так что все получится.\"");
        }
    }

    public Home getHome() {
        return home;
    }
}
