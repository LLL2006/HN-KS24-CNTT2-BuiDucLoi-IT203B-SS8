package BTTH.Model;

public class Light implements Device {
    private String name;
    public Light(String name) { this.name = name; }
    public void turnOn() { System.out.println(name + ": Bật sáng."); }
    public void turnOff() { System.out.println(name + ": Tắt."); }
    public void updateTemperature(int temp) {} // Đèn không quan tâm nhiệt độ
    public String getName() { return name; }
}
