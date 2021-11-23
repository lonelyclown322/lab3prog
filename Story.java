import classes.*;
import utilities.Hero;

public class Story {
    public static void main(String[] args) {

        Pyatachok pyatachok = new Pyatachok("Пятачок");
        Rabbit rabbit = new Rabbit("Кролик");
        Pooh pooh = new Pooh("Винни-Пух");
        Tiger tiger = new Tiger("Тигра");
        Roo roo = new Roo("Ру");
        Kenga kenga = new Kenga("Кенга");

        Hero[] crew = new Hero[]{pyatachok, rabbit, pooh, roo, kenga};
        Hike hike = new Hike(crew, "поход завтра утром");

        rabbit.inviteToHike(tiger, hike);

        rabbit.goTo(tiger.getHome());

        Status status = new Status();

        status.nextDay();
        status.turnWeatherToBad();
        pooh.isAfraid();
        pooh.thinkOfHoney(status);
        pooh.isAfraid();
        pyatachok.goTo(pooh.getCurrentPosition());
        pooh.shareFeelings(pyatachok);
        pyatachok.beIndifferent(pooh);
        pyatachok.thinkOfEvilPlan(status);
        pyatachok.goTo(rabbit.getHome());
        pooh.goTo((rabbit.getHome()));
        pyatachok.shareEvilPlan(status, tiger);

    }
}
