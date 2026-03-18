package G2;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        Fan ceilingFan = new Fan();
        Humidifier humidifier = new Humidifier();

        sensor.attach(ceilingFan);
        sensor.attach(humidifier);

        sensor.setTemperature(18);

        sensor.setTemperature(26);

        System.out.println("\n--- Hủy đăng ký Quạt ---");
        sensor.detach(ceilingFan);
        sensor.setTemperature(30);
    }
}