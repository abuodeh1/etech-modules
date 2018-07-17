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
@Table(name = "ECAPTURE_FOLDER", schema="MOH")
public class Folder {

	@Id
    @Column(name="FOLDER_ID", nullable = false)
    private int folderID;
    
    @Column(name="FOLDER_ALIAS", length = 50)
    private String folderAlias;
    @Column(name="FOLDER_CREATED_BY", nullable = false)
    private int folderCreatedBy;
    @Column(name="FOLDER_CREATE_DATETIME", nullable = false)
    private Date folderCreateDatetime;
    @Column(name="FOLDER_INDEX", length = 25)
    private String folderIndex;
    @Column(name="FOLDER_NAME", nullable = false, length = 50)
    private String folderName;
    @Column(name="FOLDER_NAME_AR", length = 50)
    private String folderNameAr;
    @Column(name="FOLDER_PARENTINDEX")
    private int folderParentIndex;
    @Column(name="FOLDER_UPDATE_DATETIME")
    private Date folderUpdateDatetime;
    
    @OneToMany(mappedBy = "folder")
    private List<Document> documents;
    
    @ManyToOne
    @JoinColumn(name = "DATACLASS_ID")
    private DataClass dataClass;

	public int getFolderID() {
		return folderID;
	}

	public void setFolderID(int folderID) {
		this.folderID = folderID;
	}

	public String getFolderAlias() {
		return folderAlias;
	}

	public void setFolderAlias(String folderAlias) {
		this.folderAlias = folderAlias;
	}

	public int getFolderCreatedBy() {
		return folderCreatedBy;
	}

	public void setFolderCreatedBy(int folderCreatedBy) {
		this.folderCreatedBy = folderCreatedBy;
	}

	public Date getFolderCreateDatetime() {
		return folderCreateDatetime;
	}

	public void setFolderCreateDatetime(Date folderCreateDatetime) {
		this.folderCreateDatetime = folderCreateDatetime;
	}

	public String getFolderIndex() {
		return folderIndex;
	}

	public void setFolderIndex(String folderIndex) {
		this.folderIndex = folderIndex;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public String getFolderNameAr() {
		return folderNameAr;
	}

	public void setFolderNameAr(String folderNameAr) {
		this.folderNameAr = folderNameAr;
	}

	public int getFolderParentIndex() {
		return folderParentIndex;
	}

	public void setFolderParentIndex(int folderParentIndex) {
		this.folderParentIndex = folderParentIndex;
	}

	public Date getFolderUpdateDatetime() {
		return folderUpdateDatetime;
	}

	public void setFolderUpdateDatetime(Date folderUpdateDatetime) {
		this.folderUpdateDatetime = folderUpdateDatetime;
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