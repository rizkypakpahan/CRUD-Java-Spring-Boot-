package net.tutorial.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import net.tutorial.springboot.service.VehicleService;
import net.tutorial.springboot.model.Vehicle;

@Controller
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	
	//menampilkan list 
	@GetMapping("/VehiclePage")
	public String viewHomePage(Model model) {
		model.addAttribute("ListVehicle", vehicleService.getAllVehicle());
		return "vehicle";
	}
	
	@GetMapping("/showNewVehicleForm")
	public String showNewVehicleForm(Model model) {
		Vehicle vehicle = new Vehicle();
		model.addAttribute("Vehicle",vehicle);
		return "new_vehicle";
		
	}
	
	@PostMapping("/SaveVehicle")
	public String SaveVehicle(@ModelAttribute("vehicle")Vehicle vehicle) {
		//simpan data  ke db
		vehicleService.SaveVehicle(vehicle);
		return "redirect:/VehiclePage";
	}
	
	@GetMapping("/showFormForUpdateVehicle/{id}")
	public String showFormForUpdateVehicle(@PathVariable(value="id")long id, Model model) {
		//ambildata  dari service
		Vehicle vehicle = vehicleService.getVehicleById(id);
		
		//set data  sebagai model attribute
		model.addAttribute("vehicle",vehicle);
		return "update_vehicle";
	}
	
	@GetMapping("/deleteVehicle/{id}")
	public String deleteVehicle (@PathVariable(value="id")long id) {
		//memanggil metode hapus data
		this.vehicleService.deleteVehicleById(id);
		return "redirect:/VehiclePage";
	}


}
