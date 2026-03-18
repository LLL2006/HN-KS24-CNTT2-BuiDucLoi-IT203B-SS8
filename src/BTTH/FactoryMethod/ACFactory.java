package BTTH.FactoryMethod;


import BTTH.Model.*;

public class ACFactory extends DeviceFactory {
    public Device createDevice(String name) { return new AirConditioner(name); }
}
