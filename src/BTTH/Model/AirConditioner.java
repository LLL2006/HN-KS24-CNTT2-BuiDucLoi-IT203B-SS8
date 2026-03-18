package BTTH.Model;

public class AirConditioner implements Device {
    private String name;
    private int temp = 25;
    public AirConditioner(String name) { this.name = name; }
    public void turnOn() { System.out.println(name + ": Khởi động máy nén."); }
    public void turnOff() { System.out.println(name + ": Ngừng máy nén."); }
    public void updateTemperature(int temp) { this.temp = temp; }
    public String getName() { return name; }
}
