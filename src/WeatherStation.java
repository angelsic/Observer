import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private ArrayList<Observer> observers;
    private int temperature;

    public WeatherStation(){
        this.observers = new ArrayList<>();
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers){
            observer.update(this.temperature);
        }
    }
}
