package G1;

public class ACSetTemperatureCommand implements Command {
    private AirConditioner ac;
    private int newTemp;
    private int prevTemp; // Lưu lại để Undo

    public ACSetTemperatureCommand(AirConditioner ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
    }

    public void execute() {
        prevTemp = ac.getTemperature(); // Lưu trạng thái trước khi đổi
        ac.setTemperature(newTemp);
    }

    public void undo() {
        System.out.print("Undo: ");
        ac.setTemperature(prevTemp);
    }
}
