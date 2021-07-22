package net.tutorial.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import net.tutorial.springboot.service.DeviceService;
import net.tutorial.springboot.model.Device;

@Controller
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	//menampilkan list 
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("ListComputer", deviceService.getAllDevice());
		return "index";
	}
	
	@GetMapping("/showNewDeviceForm")
	public String ShowNewDeviceForm(Model model) {
		Device device = new Device();
		model.addAttribute("computer",device);
		return "new_device";
		
	}
	
	@PostMapping("/SaveDevice")
	public String SaveDevice(@ModelAttribute("computer")Device device) {
		//simpan data  ke db
		deviceService.SaveDevice(device);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value="id")long id, Model model) {
		//ambildata  dari service
		Device device = deviceService.getDeviceById(id);
		
		//set data  sebagai model attribute
		model.addAttribute("computer",device);
		return "update_device";
	}
	
	@GetMapping("/deleteDevice/{id}")
	public String deleteDevice (@PathVariable(value="id")long id) {
		//memanggil metode hapus data
		this.deviceService.deleteDeviceById(id);
		return "redirect:/";
	}

}
