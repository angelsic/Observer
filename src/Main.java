public class Main {
    public static void main (String[] args){
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new TemperatureDisplay());
        weatherStation.addObserver(new WeatherWarning());

        weatherStation.setTemperature(40);
        weatherStation.setTemperature(80);
    }
}
