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

        Hero[] crew = new Hero[]{pyatachok, rabbit, pooh, tiger, roo, kenga};
        Hike hike = new Hike(crew, "поход завтра утром");

        rabbit.wantToAsk(tiger);

        rabbit.goHome(tiger.getCurrentPosition());

        Status status = new Status();

        status.nextDay();
        status.turnWeatherToBad();
        pooh.isAfraid();
        pooh.thinkOfHoney(status);
        pooh.isAfraid();
        pyatachok.goHome(pooh.getCurrentPosition());
        pooh.shareFeelings(pyatachok);
        pyatachok.beIndifferent(pooh);
        pyatachok.thinkOfEvilPlan(status);
        pyatachok.goHome(rabbit.getHome());
        pooh.goHome((rabbit.getHome()));
        pyatachok.shareEvilPlan(status, tiger);

    }
}
