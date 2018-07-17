package com.etech.ecapture.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 13-Dec-2017 12:28:26 PM
 */

@Entity
@Table(name = "ECAPTURE_DOCUMENT", schema="MOH")
public class Document {

	@Id
    @Column(name="DOCUMENT_ID", nullable = false)
    private int documentID;
    
	@Column(name="DOCUMENT_ALIAS", length = 50)
    private String documentAlias;
    @Column(name="DOCUMENT_CREATED_BY", nullable = false)
    private int documentCreatedBy;
    @Column(name="DOCUMENT_CREATE_DATETIME", nullable = false)
    private Date documentCreateDatetime;
    @Column(name="DOCUMENT_EXTENSION", nullable = false, length = 25)
    private String documentExtension;
    @Column(name="DOCUMENT_ISAUTONAMING")
    private boolean documentIsAutoNaming;
    @Column(name="DOCUMENT_NAME", nullable = false, length = 50)
    private String documentName;
    @Column(name="DOCUMENT_NAME_AR", length = 50)
    private String documentNameAr;
    @Column(name="DOCUMENT_ORDER")
    private int documentOrder;
    @Column(name="DOCUMENT_PAGES")
    private int documentPages;
    @Column(name="DOCUMENT_STATUS")
    private short documentStatus;
    @Column(name="DOCUMENT_UPDATE_DATETIME")
    private Date documentUpdateDatetime;
    
    @ManyToOne
    @JoinColumn(name = "FOLDER_ID")
    private Folder folder;
    
    @ManyToOne
    @JoinColumn(name = "BATCH_ID")
    private Batch batch;
    
	public int getDocumentID() {
		return documentID;
	}
	public void setDocumentID(int documentID) {
		this.documentID = documentID;
	}
	public String getDocumentAlias() {
		return documentAlias;
	}
	public void setDocumentAlias(String documentAlias) {
		this.documentAlias = documentAlias;
	}
	public int getDocumentCreatedBy() {
		return documentCreatedBy;
	}
	public void setDocumentCreatedBy(int documentCreatedBy) {
		this.documentCreatedBy = documentCreatedBy;
	}
	public Date getDocumentCreateDatetime() {
		return documentCreateDatetime;
	}
	public void setDocumentCreateDatetime(Date documentCreateDatetime) {
		this.documentCreateDatetime = documentCreateDatetime;
	}
	public String getDocumentExtension() {
		return documentExtension;
	}
	public void setDocumentExtension(String documentExtension) {
		this.documentExtension = documentExtension;
	}
	public boolean isDocumentIsAutoNaming() {
		return documentIsAutoNaming;
	}
	public void setDocumentIsAutoNaming(boolean documentIsAutoNaming) {
		this.documentIsAutoNaming = documentIsAutoNaming;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentNameAr() {
		return documentNameAr;
	}
	public void setDocumentNameAr(String documentNameAr) {
		this.documentNameAr = documentNameAr;
	}
	public int getDocumentOrder() {
		return documentOrder;
	}
	public void setDocumentOrder(int documentOrder) {
		this.documentOrder = documentOrder;
	}
	public int getDocumentPages() {
		return documentPages;
	}
	public void setDocumentPages(int documentPages) {
		this.documentPages = documentPages;
	}
	public short getDocumentStatus() {
		return documentStatus;
	}
	public void setDocumentStatus(short documentStatus) {
		this.documentStatus = documentStatus;
	}
	public Date getDocumentUpdateDatetime() {
		return documentUpdateDatetime;
	}
	public void setDocumentUpdateDatetime(Date documentUpdateDatetime) {
		this.documentUpdateDatetime = documentUpdateDatetime;
	}
	public Folder getFolder() {
		return folder;
	}
	public void setFolder(Folder folder) {
		this.folder = folder;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}

}