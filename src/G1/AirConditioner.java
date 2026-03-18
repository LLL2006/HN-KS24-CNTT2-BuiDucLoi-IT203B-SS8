package G1;

public class AirConditioner {
    private int temperature = 25;

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Điều hòa: Nhiệt độ = " + temperature + "°C");
    }

    public int getTemperature() { return temperature; }
}
