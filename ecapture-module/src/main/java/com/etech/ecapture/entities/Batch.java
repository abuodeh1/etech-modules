package com.etech.ecapture.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 13-Dec-2017 12:28:26 PM
 */

@Entity
@Table(name = "ECAPTURE_BATCH", schema="MOH")
public class Batch {

	@Id
    @Column(name="BATCH_ID", nullable = false)
    private int batchID;
    
	@Column(name="BATCH_ALIAS", length = 50)
    private String batchAlias;
    @Column(name="BATCH_CREATED_BY", nullable = false)
    private int batchCreatedBy;
    @Column(name="BATCH_CREATE_DATETIME", nullable = false)
    private Date batchCreateDatetime;
    @Column(name="BATCH_NAME", nullable = false, length = 50)
    private String batchName;
    @Column(name="BATCH_NAME_AR", length = 50)
    private String batchNameAr;
    @Column(name="BATCH_PERIOD", length = 25)
    private String batchPeriod;
    @Column(name="BATCH_STATUS")
    private boolean batchStatus;
    @Column(name="BATCH_UPDATE_DATETIME")
    private Date batchUpdateDatetime;
    
    @OneToMany(mappedBy = "batch")
    private List<Document> documents;
    
    @ManyToOne
    @JoinColumn(name = "DATACLASS_ID")
    private DataClass dataClass;
    
	public int getBatchID() {
		return batchID;
	}
	public void setBatchID(int batchID) {
		this.batchID = batchID;
	}
	public String getBatchAlias() {
		return batchAlias;
	}
	public void setBatchAlias(String batchAlias) {
		this.batchAlias = batchAlias;
	}
	public int getBatchCreatedBy() {
		return batchCreatedBy;
	}
	public void setBatchCreatedBy(int batchCreatedBy) {
		this.batchCreatedBy = batchCreatedBy;
	}
	public Date getBatchCreateDatetime() {
		return batchCreateDatetime;
	}
	public void setBatchCreateDatetime(Date batchCreateDatetime) {
		this.batchCreateDatetime = batchCreateDatetime;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchNameAr() {
		return batchNameAr;
	}
	public void setBatchNameAr(String batchNameAr) {
		this.batchNameAr = batchNameAr;
	}
	public String getBatchPeriod() {
		return batchPeriod;
	}
	public void setBatchPeriod(String batchPeriod) {
		this.batchPeriod = batchPeriod;
	}
	public boolean isBatchStatus() {
		return batchStatus;
	}
	public void setBatchStatus(boolean batchStatus) {
		this.batchStatus = batchStatus;
	}
	public Date getBatchUpdateDatetime() {
		return batchUpdateDatetime;
	}
	public void setBatchUpdateDatetime(Date batchUpdateDatetime) {
		this.batchUpdateDatetime = batchUpdateDatetime;
	}
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	public DataClass getDataClass() {
		return dataClass;
	}
	public void setDataClass(DataClass dataClass) {
		this.dataClass = dataClass;
	}

}