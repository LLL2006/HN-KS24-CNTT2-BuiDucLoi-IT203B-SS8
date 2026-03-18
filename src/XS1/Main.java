package XS1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();
        TemperatureSensor sensor = new TemperatureSensor();

        sensor.attach(fan);
        sensor.attach(ac);

        Command sleepMode = new SleepModeCommand(light, ac, fan);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Nhấn nút NGỦ | 2. Giả lập nhiệt độ tăng | 0. Thoát");
            int choice = sc.nextInt();

            if (choice == 1) {
                sleepMode.execute();
            } else if (choice == 2) {
                System.out.print("Nhập nhiệt độ phòng: ");
                int t = sc.nextInt();
                sensor.setTemperature(t);
            } else break;
        }
    }
}
