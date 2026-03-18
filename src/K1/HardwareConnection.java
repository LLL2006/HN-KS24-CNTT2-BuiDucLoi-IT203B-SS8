package K1;

public class HardwareConnection {
    private static HardwareConnection instance;

    private HardwareConnection() {
        System.out.println("HardwareConnection: Đang khởi tạo đường truyền vật lý");
    }

    public static HardwareConnection getInstance() {
        if (instance == null) {
            instance = new HardwareConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("HardwareConnection: Đã kết nối phần cứng thành công.");
    }

    public void disconnect() {
        System.out.println("HardwareConnection: Đã ngắt kết nối.");
    }
}
