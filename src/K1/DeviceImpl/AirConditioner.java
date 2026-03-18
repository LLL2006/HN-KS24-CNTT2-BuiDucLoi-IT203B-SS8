package K1.DeviceImpl;

import K1.Device;

public class AirConditioner implements Device {
    @Override public void turnOn() { System.out.println("Điều hòa: Đang làm mát..."); }
    @Override public void turnOff() { System.out.println("Điều hòa: Ngừng làm mát."); }
}
