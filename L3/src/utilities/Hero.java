package utilities;

public abstract class Hero implements heroInterface {
    protected final String name;
    protected Home currentPosition;
    protected boolean Afraid = false;

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
    public void goHome(Home h) {
        currentPosition = h;
        System.out.println(name + " пойдет сейчас в " + currentPosition.getHomeName() + ".");
    }

    @Override
    public void wantToAsk(Hero whoIsAsked) {
        System.out.println(this.name + " хочет спросить " + whoIsAsked.getName() + ": \"Что ты завтра собираешься делать?" +
                " Если ничего, то давай сходим в поход с Пухом и пятачком?\"");
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

}