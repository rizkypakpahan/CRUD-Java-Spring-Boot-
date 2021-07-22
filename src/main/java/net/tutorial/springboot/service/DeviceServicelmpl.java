package net.tutorial.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import net.tutorial.springboot.repository.DeviceRepository;
import net.tutorial.springboot.model.Device;
import org.springframework.stereotype.Service;


@Service
public class DeviceServicelmpl implements DeviceService{
	
	@Autowired
private DeviceRepository deviceRepository;
	
	@Override
	public List<Device> getAllDevice(){
		return deviceRepository.findAll();
	}
	
	@Override
	public void SaveDevice (Device device) {
		this.deviceRepository.save(device);
	}
	
	@Override
	public Device getDeviceById(long id) {
		Optional<Device> optional = deviceRepository.findById(id);
		Device device = null;
		if(optional.isPresent()) {
			device=optional.get();
		}else {
			throw new RuntimeException("Not Found id ::"+ id);
		}
		return device;
	}
	
	@Override
	public void deleteDeviceById(long id) {
		this.deviceRepository.deleteById(id);
	}

}
