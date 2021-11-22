package utilities;

public interface statusInterface {
    Weather[] getCurrentWeather();

    int getCurrentDay();

    void nextDay();

    void turnWeatherToBad();
}
