package BTTH.Command;

import BTTH.Model.Device;

public class TurnOnCommand implements Command {
    private Device device;
    public TurnOnCommand(Device device) { this.device = device; }
    public void execute() { device.turnOn(); }
}
