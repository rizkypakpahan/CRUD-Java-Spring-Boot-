package net.tutorial.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import net.tutorial.springboot.repository.VehicleRepository;
import net.tutorial.springboot.model.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class VehicleServicelmpl implements VehicleService{
	
	@Autowired
	private VehicleRepository vehicleRepository;
		
		@Override
		public List<Vehicle> getAllVehicle(){
			return vehicleRepository.findAll();
		}
		
		@Override
		public void SaveVehicle (Vehicle vehicle) {
			this.vehicleRepository.save(vehicle);
		}
		
		@Override
		public Vehicle getVehicleById(long id) {
			Optional<Vehicle> optional = vehicleRepository.findById(id);
			Vehicle vehicle = null;
			if(optional.isPresent()) {
				vehicle=optional.get();
			}else {
				throw new RuntimeException("Not Found id ::"+ id);
			}
			return vehicle;
		}
		
		@Override
		public void deleteVehicleById(long id) {
			this.vehicleRepository.deleteById(id);
		}


}
