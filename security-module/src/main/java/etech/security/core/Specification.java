package etech.security.core;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:20:38 AM
 */

@Entity
public class Specification {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int specificsID;
	
	private String specificsCredential;
	private String specificsHost;
	private int specificsPort;
	private String specificsPrincipal;
	private String specificsURI;
	
	

	public String getSpecificsCredential() {
		return specificsCredential;
	}



	public void setSpecificsCredential(String specificsCredential) {
		this.specificsCredential = specificsCredential;
	}



	public String getSpecificsHost() {
		return specificsHost;
	}



	public void setSpecificsHost(String specificsHost) {
		this.specificsHost = specificsHost;
	}



	public int getSpecificsPort() {
		return specificsPort;
	}



	public void setSpecificsPort(int specificsPort) {
		this.specificsPort = specificsPort;
	}



	public String getSpecificsPrincipal() {
		return specificsPrincipal;
	}



	public void setSpecificsPrincipal(String specificsPrincipal) {
		this.specificsPrincipal = specificsPrincipal;
	}



	public String getSpecificsURI() {
		return specificsURI;
	}



	public void setSpecificsURI(String specificsURI) {
		this.specificsURI = specificsURI;
	}



	public int getSpecificsID() {
		return specificsID;
	}



	@Override
	public String toString() {
		return "Specification [specificsID=" + specificsID + ", specificsCredential=" + specificsCredential
				+ ", specificsHost=" + specificsHost + ", specificsPort=" + specificsPort + ", specificsPrincipal="
				+ specificsPrincipal + ", specificsURI=" + specificsURI + "]";
	}

}