public class Command {
    public static void main(String[] args) {
        Light light = new Light();
        lightCommand on = new TurnOnLight(light);
        lightCommand off = new TurnOffLight(light);

        RemoteLight remote = new RemoteLight();
        RemoteLight.setLightCommand(on);
        RemoteLight.pressPowerButton();
        RemoteLight.pressUndoButton();
    }
}

class Light{
    public void turnOn(){
        System.out.println("Đèn đã bật");
    }
    public void turnOff(){
        System.out.println("Đèn đã tắt");
    }
}

interface lightCommand{
    void execute();
    void undo();
}

class TurnOnLight implements lightCommand {
    private Light light;
    public TurnOnLight(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}

class TurnOffLight implements lightCommand {
    private Light light;
    public TurnOffLight(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}

class RemoteLight{
    private static lightCommand command;
    public static void setLightCommand(lightCommand command){
        RemoteLight.command = command;
    }
    public static void pressPowerButton(){
        command.execute();
    }
    public static void pressUndoButton(){
        command.undo();
    }
}