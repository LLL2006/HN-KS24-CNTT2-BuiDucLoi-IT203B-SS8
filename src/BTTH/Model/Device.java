package BTTH.Model;

public interface Device {
    void turnOn();
    void turnOff();
    void updateTemperature(int temp);
    String getName();
}
