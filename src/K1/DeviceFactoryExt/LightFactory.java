package K1.DeviceFactoryExt;

import K1.Device;
import K1.DeviceFactory;
import K1.DeviceImpl.Light;

public class LightFactory extends DeviceFactory {
    @Override
    public Device createDevice() {
        System.out.println("LightFactory: Đã tạo đèn mới.");
        return new Light();
    }
}
