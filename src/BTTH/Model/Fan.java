package BTTH.Model;

public class Fan implements Device {
    private String name;
    public Fan(String name) { this.name = name; }
    public void turnOn() { System.out.println(name + ": Quay."); }
    public void turnOff() { System.out.println(name + ": Dừng."); }
    public void updateTemperature(int temp) {
        System.out.println(name + ": Nhận tin nhiệt độ " + temp + "°C -> Tự điều chỉnh tốc độ.");
    }
    public String getName() { return name; }
}
