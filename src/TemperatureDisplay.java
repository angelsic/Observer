public class TemperatureDisplay implements Observer{

    @Override
    public void update(int temp) {
        System.out.println("Temperature is " + temp + "°");
    }
}
