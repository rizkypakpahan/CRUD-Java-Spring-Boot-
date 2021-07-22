package net.tutorial.springboot.model;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="vehicle")

public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name="vehic_cate")
	public String vehiccate;
	
	@Column(name="vehic_brand")
	public String vehicbrand;
	
	@Column(name="vehic_model")
	public String vehicmodel;
	
	@Column(name="vehic_specs")
	public String vehicspecs;
	
	public long getId() {
		return id;
	}
	
	public void setId (long vehicId) {
		this.id = vehicId;
	}

	public String getvehiccate() {
		return vehiccate;
	}
	
	public void setvehiccate(String vehiccate) {
		this.vehiccate=vehiccate;
	}
	
	public String getvehicbrand() {
		return vehicbrand;
	}
	
	public void setvehicbrand(String vehicbrand) {
		this.vehicbrand=vehicbrand;
	}
	
	public String getvehicmodel() {
		return vehicmodel;
	}
	
	public void setvehicmodel(String vehicmodel) {
		this.vehicmodel=vehicmodel;
	}
	
	public String getvehicspecs() {
		return vehicspecs;
	}
	
	public void setvehicspecs(String vehicspecs) {
		this.vehicspecs=vehicspecs;
	}
	
}
