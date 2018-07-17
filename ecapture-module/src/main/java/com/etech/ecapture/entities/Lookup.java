package com.etech.ecapture.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 13-Dec-2017 2:23:47 PM
 */

@Entity
@Table(name = "ECAPTURE_LOOKUP", schema="MOH")
public class Lookup {

	@Id
	@Column(name="LOOKUP_ID", nullable = false)
    private Double lookupID;
    
	@Column(name="LOOKUP_DEFAULT", length = 25)
    private String lookupDefault;
    @Column(name="LOOKUP_DESC", length = 150)
    private String lookupDesc;
    @Column(name="LOOKUP_DESC_AR", length = 150)
    private String lookupDescAr;
    @Column(name="LOOKUP_NAME", nullable = false, length = 50)
    private String lookupName;
    @Column(name="LOOKUP_NAME_AR", length = 50)
    private String lookupNameAr;
    @Column(name="LOOKUP_ORDER")
    private int lookupOrder;
    @Column(name="LOOKUP_PARENT_ID")
    private int lookupParentID;
    @Column(name="LOOKUP_STATUS")
    private short lookupStatus;
    
	public Double getLookupID() {
		return lookupID;
	}
	public void setLookupID(Double lookupID) {
		this.lookupID = lookupID;
	}
	public String getLookupDefault() {
		return lookupDefault;
	}
	public void setLookupDefault(String lookupDefault) {
		this.lookupDefault = lookupDefault;
	}
	public String getLookupDesc() {
		return lookupDesc;
	}
	public void setLookupDesc(String lookupDesc) {
		this.lookupDesc = lookupDesc;
	}
	public String getLookupDescAr() {
		return lookupDescAr;
	}
	public void setLookupDescAr(String lookupDescAr) {
		this.lookupDescAr = lookupDescAr;
	}
	public String getLookupName() {
		return lookupName;
	}
	public void setLookupName(String lookupName) {
		this.lookupName = lookupName;
	}
	public String getLookupNameAr() {
		return lookupNameAr;
	}
	public void setLookupNameAr(String lookupNameAr) {
		this.lookupNameAr = lookupNameAr;
	}
	public int getLookupOrder() {
		return lookupOrder;
	}
	public void setLookupOrder(int lookupOrder) {
		this.lookupOrder = lookupOrder;
	}
	public int getLookupParentID() {
		return lookupParentID;
	}
	public void setLookupParentID(int lookupParentID) {
		this.lookupParentID = lookupParentID;
	}
	public short getLookupStatus() {
		return lookupStatus;
	}
	public void setLookupStatus(short lookupStatus) {
		this.lookupStatus = lookupStatus;
	}

}