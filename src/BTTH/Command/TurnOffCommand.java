package BTTH.Command;

import BTTH.Model.Device;

public class TurnOffCommand implements Command {
    private Device device;
    public TurnOffCommand(Device device) { this.device = device; }
    public void execute() { device.turnOff(); }
}
