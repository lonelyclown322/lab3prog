package classes;

import utilities.*;

public class Status implements statusInterface {
    private int currentDay = 1;

    @Override
    public Weather[] getCurrentWeather() {
        return currentWeather;
    }

    private final Weather[] currentWeather = new Weather[]{Weather.Warm, Weather.Sunny};

    @Override
    public int getCurrentDay() {
        return currentDay;
    }

    @Override
    public void nextDay() {
        currentDay++;
        System.out.println("Наступил следующий день.");
    }

    @Override
    public void turnWeatherToBad() {
        System.out.println("Погода испортилась.");
        System.out.println("Было " + currentWeather[0].getWeatherName()
                + " и " + currentWeather[1].getWeatherName() + ".");
        currentWeather[0] = Weather.Cold;
        currentWeather[1] = Weather.Foggy;
        System.out.println("Стало " + currentWeather[0].getWeatherName()
                + " и " + currentWeather[1].getWeatherName() + ".");
    }
}
