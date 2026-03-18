package K1.DeviceFactoryExt;

import K1.Device;
import K1.DeviceFactory;
import K1.DeviceImpl.Fan;

public class FanFactory extends DeviceFactory {
    @Override
    public Device createDevice() {
        System.out.println("FanFactory: Đã tạo quạt mới.");
        return new Fan();
    }
}
