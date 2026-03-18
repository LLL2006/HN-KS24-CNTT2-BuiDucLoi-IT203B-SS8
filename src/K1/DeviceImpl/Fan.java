package K1.DeviceImpl;

import K1.Device;

public class Fan implements Device {
    @Override public void turnOn() { System.out.println("Quạt: Quay vù vù."); }
    @Override public void turnOff() { System.out.println("Quạt: Dừng quay."); }
}
