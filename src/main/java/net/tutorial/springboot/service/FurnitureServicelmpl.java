package net.tutorial.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import net.tutorial.springboot.repository.FurnitureRepository;
import net.tutorial.springboot.model.Furniture;
import org.springframework.stereotype.Service;

@Service
public class FurnitureServicelmpl implements FurnitureService{
	@Autowired
	private FurnitureRepository furnitureRepository;
		
		@Override
		public List<Furniture> getAllFurniture(){
			return furnitureRepository.findAll();
		}
		
		@Override
		public void SaveFurniture (Furniture furniture) {
			this.furnitureRepository.save(furniture);
		}
		
		@Override
		public Furniture getFurnitureById(long id) {
			Optional<Furniture> optional = furnitureRepository.findById(id);
			Furniture furniture = null;
			if(optional.isPresent()) {
				furniture=optional.get();
			}else {
				throw new RuntimeException("Not Found id ::"+ id);
			}
			return furniture;
		}
		
		@Override
		public void deleteFurnitureById(long id) {
			this.furnitureRepository.deleteById(id);
		}

}
