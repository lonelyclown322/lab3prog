package classes;

import utilities.*;

import java.util.Arrays;
import java.util.Objects;

public class Status implements statusInterface {
    private int currentDay = 1;

    private final Weather[] currentWeather = new Weather[]{Weather.Warm, Weather.Sunny};

    @Override
    public Weather[] getCurrentWeather() {
        return currentWeather;
    }

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

    @Override
    public void turnWeatherToGood() {
        System.out.println("Погода улучшилась.");
        System.out.println("Было " + currentWeather[0].getWeatherName()
                + " и " + currentWeather[1].getWeatherName() + ".");
        currentWeather[0] = Weather.Warm;
        currentWeather[1] = Weather.Sunny;
        System.out.println("Стало " + currentWeather[0].getWeatherName()
                + " и " + currentWeather[1].getWeatherName() + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Status)) return false;
        Status status = (Status) o;
        return getCurrentDay() == status.getCurrentDay() && Arrays.equals(getCurrentWeather(), status.getCurrentWeather());
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentDay);
    }

    @Override
    public String toString() {
        return "Status{" +
                "currentDay=" + currentDay +
                ", currentWeather=" + Arrays.toString(currentWeather) +
                '}';
    }
}
