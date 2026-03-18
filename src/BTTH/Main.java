//package BTTH;
//
//import BTTH.Adapter.*;
//import BTTH.Command.*;
//import BTTH.Singleton.HardwareConnection;
//import BTTH.Facade.*;
//import BTTH.FactoryMethod.*;
//import java.util.*;
//
//public class Main {
//    public static <ThermometerAdapter> void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HardwareConnection conn = HardwareConnection.getInstance(); // Singleton
//
//        List<Device> deviceList = new ArrayList<>();
//        // Khởi tạo mặc định một số thiết bị bằng Factory
//        DeviceFactory lightFactory = new LightFactory();
//        DeviceFactory fanFactory = new FanFactory();
//        deviceList.add(lightFactory.createDevice("Đèn phòng khách"));
//        deviceList.add(fanFactory.createDevice("Quạt trần"));
//
//        SmartHomeFacade facade = new SmartHomeFacade(deviceList);
//        OldThermometer oldSensor = new OldThermometer();
//        ThermometerAdapter adapter = new ThermometerAdapter(oldSensor);
//
//        while (true) {
//            System.out.println("\n=== SMART HOME CONTROL ===");
//            System.out.println("1. Bật/tắt thiết bị");
//            System.out.println("2. Điều chỉnh nhiệt độ điều hòa (Observer)");
//            System.out.println("3. Xem nhiệt độ hiện tại (Adapter)");
//            System.out.println("4. Chế độ ngủ (Facade)");
//            System.out.println("5. Chế độ rời nhà (Facade)");
//            System.out.println("6. Thêm thiết bị mới (Factory)");
//            System.out.println("0. Thoát");
//            System.out.print("Chọn: ");
//            int choice = sc.nextInt(); sc.nextLine();
//
//            switch (choice) {
//                case 1: // Command Pattern
//                    for (int i = 0; i < deviceList.size(); i++) {
//                        System.out.println(i + ". " + deviceList.get(i).getName());
//                    }
//                    System.out.print("Chọn thiết bị: ");
//                    int devIdx = sc.nextInt();
//                    System.out.print("1. Bật, 2. Tắt: ");
//                    int act = sc.nextInt();
//                    Command cmd = (act == 1) ? new TurnOnCommand(deviceList.get(devIdx)) : new TurnOffCommand(deviceList.get(devIdx));
//                    cmd.execute();
//                    break;
//
//                case 2: // Observer Pattern
//                    System.out.print("Nhập nhiệt độ mới: ");
//                    int temp = sc.nextInt();
//                    System.out.println("Điều hòa: Nhiệt độ = " + temp);
//                    for(Device d : deviceList) d.updateTemperature(temp); // Thông báo cho Observers
//                    break;
//
//                case 3: // Adapter Pattern
//                    System.out.printf("Nhiệt độ hiện tại: %.1f°C (từ cảm biến cũ)\n", adapter.getTemperatureCelsius());
//                    break;
//
//                case 4: facade.sleepMode(); break; // Facade
//
//                case 5: facade.leaveHomeMode(); break; // Facade
//
//                case 6: // Factory Method
//                    System.out.println("1. Đèn, 2. Quạt, 3. AC");
//                    int type = sc.nextInt(); sc.nextLine();
//                    System.out.print("Nhập tên thiết bị: ");
//                    String name = sc.nextLine();
//                    DeviceFactory fact = switch(type) {
//                        case 1 -> new LightFactory();
//                        case 2 -> new FanFactory();
//                        default -> new ACFactory();
//                    };
//                    deviceList.add(fact.createDevice(name));
//                    System.out.println("Đã thêm thiết bị thành công.");
//                    break;
//
//                case 0: return;
//            }
//        }
//    }
//}
