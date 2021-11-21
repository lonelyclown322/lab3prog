package utilities;

public interface statusInterface {
    public Weather[] getCurrentWeather();

    public int getCurrentDay();

    public void nextDay();

    public void turnWeatherToBad();
}
