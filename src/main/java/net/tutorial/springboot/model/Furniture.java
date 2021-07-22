package net.tutorial.springboot.model;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="furniture")

public class Furniture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name="furn_cate")
	public String furncate;
	
	@Column(name="furn_brand")
	public String furnbrand;
	
	@Column(name="furn_model")
	public String furnmodel;
	
	@Column(name="furn_specs")
	public String furnspecs;
	
	public long getId() {
		return id;
	}
	
	public void setId (long furnId) {
		this.id = furnId;
	}

	public String getfurncate() {
		return furncate;
	}
	
	public void setfurncate(String furncate) {
		this.furncate=furncate;
	}
	
	public String getfurnbrand() {
		return furnbrand;
	}
	
	public void setfurnbrand(String furnbrand) {
		this.furnbrand=furnbrand;
	}
	
	public String getfurnmodel() {
		return furnmodel;
	}
	
	public void setfurnmodel(String furnmodel) {
		this.furnmodel=furnmodel;
	}
	
	public String getfurnspecs() {
		return furnspecs;
	}
	
	public void setfurnspecs(String furnspecs) {
		this.furnspecs=furnspecs;
	}
}
