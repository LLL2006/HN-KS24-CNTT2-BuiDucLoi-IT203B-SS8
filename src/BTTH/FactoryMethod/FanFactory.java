package BTTH.FactoryMethod;
import BTTH.Model.*;

public class FanFactory extends DeviceFactory {
    public Device createDevice(String name) { return new Fan(name); }
}
