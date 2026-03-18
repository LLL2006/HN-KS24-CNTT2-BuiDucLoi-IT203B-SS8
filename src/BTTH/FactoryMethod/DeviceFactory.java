package BTTH.FactoryMethod;

import BTTH.Model.Device;

public abstract class DeviceFactory {
    public abstract Device createDevice(String name);
}
