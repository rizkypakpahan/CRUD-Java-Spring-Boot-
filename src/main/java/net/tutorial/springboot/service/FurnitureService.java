package net.tutorial.springboot.service;
import java.util.List;

import net.tutorial.springboot.model.Furniture;

public interface FurnitureService {
	List<Furniture> getAllFurniture();
	void SaveFurniture(Furniture furniture);
	Furniture getFurnitureById(long id);
	void deleteFurnitureById(long id);
}
