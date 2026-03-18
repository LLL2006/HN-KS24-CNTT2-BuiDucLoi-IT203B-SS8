package G2;
import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    @Override
    public void attach(Observer o) {
        observers.add(o);
        // Tên lớp của observer (Fan, Humidifier...)
        System.out.println(o.getClass().getSimpleName() + ": Đã đăng ký nhận thông báo.");
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("\n[Cảm biến]: Nhiệt độ thay đổi -> " + temperature + "°C");
        notifyObservers();
    }
}
