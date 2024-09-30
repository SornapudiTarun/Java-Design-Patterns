package ObserverDesignPattern;

public class ObserverDesignPatternMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer display1= new DisplayElement("Display 1");
        Observer display2= new DisplayElement("Display 2");

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        weatherStation.setWeatherDat(32.0f,34.4f);
        weatherStation.setWeatherDat(28.2f,36.6f);
    }
}
