package K1;

import K1.DeviceFactoryExt.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Device currentDevice = null;

        while (true) {
            System.out.println("1. Kết nối phần cứng (Singleton)");
            System.out.println("2. Tạo thiết bị mới (Factory Method)");
            System.out.println("3. Bật thiết bị");
            System.out.println("4. Tắt thiết bị");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                HardwareConnection conn = HardwareConnection.getInstance();
                conn.connect();
            } else if (choice == 2) {
                System.out.println("Chọn loại: 1. Đèn | 2. Quạt | 3. Điều hòa");
                int type = sc.nextInt();
                DeviceFactory factory = switch (type) {
                    case 1 -> new LightFactory();
                    case 2 -> new FanFactory();
                    case 3 -> new AirConditionerFactory();
                    default -> null;
                };
                if (factory != null) currentDevice = factory.createDevice();
            } else if (choice == 3) {
                if (currentDevice != null) currentDevice.turnOn();
                else System.out.println("Chưa có thiết bị nào được tạo!");
            } else if (choice == 4) {
                if (currentDevice != null) currentDevice.turnOff();
            } else if (choice == 0) break;
        }
    }
}
