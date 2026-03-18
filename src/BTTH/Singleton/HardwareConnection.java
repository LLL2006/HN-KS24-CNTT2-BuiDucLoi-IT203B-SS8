package BTTH.Singleton;

public class HardwareConnection {
    private static HardwareConnection instance;
    private HardwareConnection() {
        System.out.println("[Singleton] Đang thiết lập kết nối phần cứng duy nhất...");
    }
    public static HardwareConnection getInstance() {
        if (instance == null) instance = new HardwareConnection();
        return instance;
    }
    public void execute(String action) {
        System.out.println("[Hardware] Thực thi: " + action);
    }
}
