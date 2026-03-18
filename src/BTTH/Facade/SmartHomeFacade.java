package BTTH.Facade;
import BTTH.Model.Device;

import java.util.List;

public class SmartHomeFacade {
    private List<Device> devices;
    public SmartHomeFacade(List<Device> devices) { this.devices = devices; }

    public void sleepMode() {
        System.out.println("\n[Facade] Kích hoạt Chế độ ngủ...");
        for(Device d : devices) {
            if (d.getName().contains("Đèn")) d.turnOff();
            if (d.getName().contains("Điều hòa")) d.updateTemperature(28);
        }
        System.out.println("-> Đèn tắt, AC 28°C, Quạt nhẹ.");
    }

    public void leaveHomeMode() {
        System.out.println("\n[Facade] Kích hoạt Chế độ rời nhà...");
        for(Device d : devices) d.turnOff();
    }
}
