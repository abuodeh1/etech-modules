package etech.security.core;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:20:38 AM
 */

@Entity
public class Provider {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int providerID;

	private String providerDescAr;
	private String providerDescEn;
	
	private String providerNameAr;
	private String providerNameEn;

	private boolean providerActivityStatus = true;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SPECIFICSID")
	private Specification specification = new Specification();
	
	
	
	public String getProviderDescAr() {
		return providerDescAr;
	}



	public void setProviderDescAr(String providerDescAr) {
		this.providerDescAr = providerDescAr;
	}



	public String getProviderDescEn() {
		return providerDescEn;
	}



	public void setProviderDescEn(String providerDescEn) {
		this.providerDescEn = providerDescEn;
	}



	public String getProviderNameAr() {
		return providerNameAr;
	}



	public void setProviderNameAr(String providerNameAr) {
		this.providerNameAr = providerNameAr;
	}



	public String getProviderNameEn() {
		return providerNameEn;
	}



	public void setProviderNameEn(String providerNameEn) {
		this.providerNameEn = providerNameEn;
	}



	public boolean isProviderActivityStatus() {
		return providerActivityStatus;
	}



	public void setProviderActivityStatus(boolean providerActivityStatus) {
		this.providerActivityStatus = providerActivityStatus;
	}



	public Specification getSpecification() {
		return specification;
	}



	public void setSpecification(Specification specification) {
		this.specification = specification;
	}



	public int getProviderID() {
		return providerID;
	}



	@Override
	public String toString() {
		return "Provider [providerID=" + providerID + ", providerDescAr=" + providerDescAr + ", providerDescEn="
				+ providerDescEn + ", providerNameAr=" + providerNameAr + ", providerNameEn=" + providerNameEn
				+ ", specification=" + specification + ", providerActivityStatus=" + providerActivityStatus + "]";
	}
	
}