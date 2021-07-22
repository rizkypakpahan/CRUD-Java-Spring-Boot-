package net.tutorial.springboot.service;
import java.util.List;
import net.tutorial.springboot.model.Vehicle;

public interface VehicleService {
	List<Vehicle> getAllVehicle();
	void SaveVehicle(Vehicle vehicle);
	Vehicle getVehicleById(long id);
	void deleteVehicleById(long id);

}
