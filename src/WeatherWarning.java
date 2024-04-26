public class WeatherWarning implements Observer{

    @Override
    public void update(int temperature) {
        if(temperature > 60){
            System.out.println("Weather warning: " + temperature + "°");
        }
    }
}
