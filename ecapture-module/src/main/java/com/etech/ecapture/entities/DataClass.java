package com.etech.ecapture.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 13-Dec-2017 12:28:26 PM
 */

@Entity
@Table(name = "ECAPTURE_DATACLASS", schema="MOH")
public class DataClass {

	@Id
    @Column(name="DataClass_ID", nullable = false)
    private int dataClassID;
	
    @Column(name="DataClass_CLONED_INDEX")
    private int dataClassClonedIndex;
    @Column(name="DataClass_CREATED_BY", nullable = false)
    private int dataClassCreatedBy;
    @Column(name="DataClass_CREATE_DATETIME", nullable = false)
    private Date dataClassCreateDatetime;
    @Column(name="DataClass_DESC", length = 25)
    private String dataClassDesc;
    @Column(name="DataClass_FIELD_COUNT", nullable = false)
    private int dataClassFieldCount;
    @Column(name="DataClass_INDEX")
    private int dataClassIndex;
    @Column(name="DataClass_ISREAL")
    private boolean dataClassIsReal;
    @Column(name="DataClass_NAME", nullable = false, length = 25)
    private String dataClassName;
    @Column(name="DataClass_NAME_AR", length = 25)
    private String dataClassNameAr;
    @Column(name="DataClass_STATUS")
    private short dataClassStatus;
    @Column(name="DataClass_UPDATE_DATETIME")
    private Date dataClassUpdateDatetime;
    @Column(name="DataClass_USEDFOR", nullable = false)
    private short dataClassUsedFor;
    
    @OneToMany(mappedBy = "dataClass")
    private List<Field> fields;
    
    @OneToMany(mappedBy = "dataClass")
    private List<Folder> folders;
    
    @OneToMany(mappedBy = "dataClass")
    private List<Batch> batches;
    
    @OneToMany(mappedBy = "dataClass")
    private List<DocumentField> documentFields;
    
	public int getDataClassID() {
		return dataClassID;
	}
	public void setDataClassID(int dataClassID) {
		this.dataClassID = dataClassID;
	}
	public int getDataClassClonedIndex() {
		return dataClassClonedIndex;
	}
	public void setDataClassClonedIndex(int dataClassClonedIndex) {
		this.dataClassClonedIndex = dataClassClonedIndex;
	}
	public int getDataClassCreatedBy() {
		return dataClassCreatedBy;
	}
	public void setDataClassCreatedBy(int dataClassCreatedBy) {
		this.dataClassCreatedBy = dataClassCreatedBy;
	}
	public Date getDataClassCreateDatetime() {
		return dataClassCreateDatetime;
	}
	public void setDataClassCreateDatetime(Date dataClassCreateDatetime) {
		this.dataClassCreateDatetime = dataClassCreateDatetime;
	}
	public String getDataClassDesc() {
		return dataClassDesc;
	}
	public void setDataClassDesc(String dataClassDesc) {
		this.dataClassDesc = dataClassDesc;
	}
	public int getDataClassFieldCount() {
		return dataClassFieldCount;
	}
	public void setDataClassFieldCount(int dataClassFieldCount) {
		this.dataClassFieldCount = dataClassFieldCount;
	}
	public int getDataClassIndex() {
		return dataClassIndex;
	}
	public void setDataClassIndex(int dataClassIndex) {
		this.dataClassIndex = dataClassIndex;
	}
	public boolean isDataClassIsReal() {
		return dataClassIsReal;
	}
	public void setDataClassIsReal(boolean dataClassIsReal) {
		this.dataClassIsReal = dataClassIsReal;
	}
	public String getDataClassName() {
		return dataClassName;
	}
	public void setDataClassName(String dataClassName) {
		this.dataClassName = dataClassName;
	}
	public String getDataClassNameAr() {
		return dataClassNameAr;
	}
	public void setDataClassNameAr(String dataClassNameAr) {
		this.dataClassNameAr = dataClassNameAr;
	}
	public short getDataClassStatus() {
		return dataClassStatus;
	}
	public void setDataClassStatus(short dataClassStatus) {
		this.dataClassStatus = dataClassStatus;
	}
	public Date getDataClassUpdateDatetime() {
		return dataClassUpdateDatetime;
	}
	public void setDataClassUpdateDatetime(Date dataClassUpdateDatetime) {
		this.dataClassUpdateDatetime = dataClassUpdateDatetime;
	}
	public short getDataClassUsedFor() {
		return dataClassUsedFor;
	}
	public void setDataClassUsedFor(short dataClassUsedFor) {
		this.dataClassUsedFor = dataClassUsedFor;
	}
	public List<Field> getFields() {
		return fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
	public List<Folder> getFolders() {
		return folders;
	}
	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}
	public List<Batch> getBatches() {
		return batches;
	}
	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}
	public List<DocumentField> getDocumentFields() {
		return documentFields;
	}
	public void setDocumentFields(List<DocumentField> documentFields) {
		this.documentFields = documentFields;
	}

}