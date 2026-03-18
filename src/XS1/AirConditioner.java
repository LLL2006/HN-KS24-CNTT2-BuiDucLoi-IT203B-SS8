package XS1;

public class AirConditioner implements Observer {
    private int temperature = 25;

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Điều hòa: Nhiệt độ = " + temperature + "°C");
    }

    @Override
    public void update(int temp) {
        if (temp > 30) {
            System.out.println("Điều hòa: Nhận thấy nhiệt độ phòng cao (" + temp + "°C), duy trì làm mát.");
        }
    }
}
