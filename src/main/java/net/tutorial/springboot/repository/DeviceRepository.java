package net.tutorial.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.tutorial.springboot.model.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

}




