package XS1;


public class SleepModeCommand implements Command {
    private Light light;
    private AirConditioner ac;
    private Fan fan;

    public SleepModeCommand(Light light, AirConditioner ac, Fan fan) {
        this.light = light;
        this.ac = ac;
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.println("\n--- KÍCH HOẠT CHẾ ĐỘ NGỦ THÔNG MINH ---");
        light.off();
        ac.setTemperature(28);
        fan.setSpeed("thấp");
        System.out.println("---------------------------------------");
    }
}
