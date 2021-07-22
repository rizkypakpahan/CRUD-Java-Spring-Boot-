package net.tutorial.springboot.model;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
@Table(name="computer")

public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name="dev_cate")
	public String devicecate;
	
	@Column(name="dev_brand")
	public String devicebrand;
	
	@Column(name="dev_model")
	public String devicemodel;
	
	@Column(name="dev_specs")
	public String devicespecs;
	
	public long getId() {
		return id;
	}
	
	public void setId (long devId) {
		this.id = devId;
	}

	public String getdevicecate() {
		return devicecate;
	}
	
	public void setdevicecate(String devicecate) {
		this.devicecate=devicecate;
	}
	
	public String getdevicebrand() {
		return devicebrand;
	}
	
	public void setdevicebrand(String devicebrand) {
		this.devicebrand=devicebrand;
	}
	
	public String getdevicemodel() {
		return devicemodel;
	}
	
	public void setdevicemodel(String devicemodel) {
		this.devicemodel=devicemodel;
	}
	
	public String getdevicespecs() {
		return devicespecs;
	}
	
	public void setdevicespecs(String devicespecs) {
		this.devicespecs=devicespecs;
	}
	
	

}
