package net.tutorial.springboot.service;
import java.util.List;
import net.tutorial.springboot.model.Device;

public interface DeviceService {
	List<Device> getAllDevice();
	void SaveDevice(Device device);
	Device getDeviceById(long id);
	void deleteDeviceById(long id);

}
