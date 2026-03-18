package BTTH.FactoryMethod;

import BTTH.Model.*;

public class LightFactory extends DeviceFactory {
    public Device createDevice(String name) { return new Light(name); }
}
