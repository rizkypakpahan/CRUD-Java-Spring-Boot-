package net.tutorial.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import net.tutorial.springboot.service.FurnitureService;
import net.tutorial.springboot.model.Furniture;

@Controller
public class FurnitureController {
	@Autowired
	private FurnitureService furnitureService;
	
	//menampilkan list 
	@GetMapping("/FurniturePage")
	public String viewHomePage(Model model) {
		model.addAttribute("ListFurniture", furnitureService.getAllFurniture());
		return "furniture";
	}
	
	@GetMapping("/showNewFurnitureForm")
	public String showNewFurnitureForm(Model model) {
		Furniture furniture = new Furniture();
		model.addAttribute("furniture",furniture);
		return "new_furniture";
		
	}
	
	@PostMapping("/SaveFurniture")
	public String SaveDevice(@ModelAttribute("furniture")Furniture furniture) {
		//simpan data  ke db
		furnitureService.SaveFurniture(furniture);
		return "redirect:/FurniturePage";
	}
	
	@GetMapping("/showFormForUpdateFurniture/{id}")
	public String showFormForUpdate(@PathVariable(value="id")long id, Model model) {
		//ambildata mhs dari service
		Furniture furniture = furnitureService.getFurnitureById(id);
		
		//set data mhs sebagai model attribute
		model.addAttribute("furniture",furniture);
		return "update_furniture";
	}
	
	@GetMapping("/deleteFurniture/{id}")
	public String deleteFurniture (@PathVariable(value="id")long id) {
		//memanggil metode hapus data
		this.furnitureService.deleteFurnitureById(id);
		return "redirect:/FurniturePage";
	}


}
