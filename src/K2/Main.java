package K2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OldThermometer oldSensor = new OldThermometer();
        TemperatureSensor adapter = new ThermometerAdapter(oldSensor);

        SmartHomeFacade smartHome = new SmartHomeFacade(adapter);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Xem nhiệt độ (Adapter)");
            System.out.println("2. Chế độ rời nhà (Facade)");
            System.out.println("3. Chế độ ngủ (Facade)");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> smartHome.getCurrentTemperature();
                case 2 -> smartHome.leaveHome();
                case 3 -> smartHome.sleepMode();
                case 0 -> System.exit(0);
            }
        }
    }
}
