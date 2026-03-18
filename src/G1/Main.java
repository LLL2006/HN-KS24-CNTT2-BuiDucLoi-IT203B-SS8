package G1;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light livingRoomLight = new Light();
        AirConditioner ac = new AirConditioner();

        remote.setCommand(0, new LightOnCommand(livingRoomLight));
        remote.setCommand(1, new LightOffCommand(livingRoomLight));
        remote.setCommand(2, new ACSetTemperatureCommand(ac, 26));

        System.out.println("\n--- Thao tác ---");
        remote.pressButton(0);
        remote.pressButton(1);

        System.out.println("\nThử nghiệm Undo");
        remote.pressUndo();

        System.out.println("\nThao tác Điều hòa");
        remote.pressButton(2);
        remote.pressUndo();
    }
}
