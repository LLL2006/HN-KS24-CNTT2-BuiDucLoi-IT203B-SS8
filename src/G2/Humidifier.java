package G2;

public class Humidifier implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Máy tạo ẩm: Đang điều chỉnh độ ẩm tương ứng với nhiệt độ " + temperature + "°C.");
    }
}
