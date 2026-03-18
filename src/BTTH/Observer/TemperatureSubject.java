package BTTH.Observer;
import BTTH.Model.Device;

import java.util.*;

public class TemperatureSubject {
    private List<Device> observers = new ArrayList<>();
    private int temperature;

    public void addObserver(Device d) { observers.add(d); }
    public void setTemperature(int t) {
        this.temperature = t;
        notifyObservers();
    }
    private void notifyObservers() {
//        for (Device d : observers) d.update(temperature);
    }
}
