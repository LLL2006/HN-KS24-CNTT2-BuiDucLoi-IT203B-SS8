package XS1;

public class Fan implements Observer {
    private String speed = "Tắt";

    public void setSpeed(String speed) {
        this.speed = speed;
        System.out.println("Quạt: Chạy tốc độ " + speed);
    }

    @Override
    public void update(int temperature) {
        if (temperature > 30) {
            setSpeed("MẠNH (Tự động do nhiệt độ cao)");
        }
    }
}