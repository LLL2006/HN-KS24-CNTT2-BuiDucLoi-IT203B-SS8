package XS1;

import java.util.*;

public class TemperatureSensor {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) { observers.add(o); }

    public void setTemperature(int temp) {
        System.out.println("\n[Cảm biến]: Nhiệt độ phòng hiện tại = " + temp + "°C");
        for (Observer o : observers) o.update(temp);
    }
}
