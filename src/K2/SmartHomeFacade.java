package K2;

public class SmartHomeFacade {
    private TemperatureSensor sensor;

    public SmartHomeFacade(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    public void leaveHome() {
        System.out.println("FACADE: Đang kích hoạt chế độ Rời nhà...");
        System.out.println("-> Tắt đèn");
        System.out.println("-> Tắt quạt");
        System.out.println("-> Tắt điều hòa");
        System.out.println("=> Hệ thống an toàn.");
    }

    public void sleepMode() {
        System.out.println("FACADE: Đang kích hoạt chế độ Ngủ...");
        System.out.println("-> Tắt đèn");
        System.out.println("-> Điều hòa set 28°C");
        System.out.println("-> Quạt chạy tốc độ thấp");
    }

    public void getCurrentTemperature() {
        double temp = sensor.getTemperatureCelsius();
        System.out.printf("Nhiệt độ hiện tại: %.1f°C\n", temp);
    }
}
