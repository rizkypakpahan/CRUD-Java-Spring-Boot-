package net.tutorial.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.tutorial.springboot.model.Furniture;

@Repository
public interface FurnitureRepository extends JpaRepository<Furniture, Long> {

}
