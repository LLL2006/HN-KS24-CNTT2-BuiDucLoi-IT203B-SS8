package K1.DeviceFactoryExt;

import K1.Device;
import K1.DeviceFactory;
import K1.DeviceImpl.AirConditioner;

public class AirConditionerFactory extends DeviceFactory {
    @Override
    public Device createDevice() {
        System.out.println("ACFactory: Đã tạo điều hòa mới.");
        return new AirConditioner();
    }
}
