package com.etech.ecapture.entities;

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
@Table(name = "ECAPTURE_LOG_COMPONENT", schema="MOH")
public class LogComponent {
	
	@Id
    @Column(name="LOG_COMPONENT_ID", nullable = false, insertable = false, updatable = false)
    private int logComponentID;
    
	@Column(name="FIELD_NAME", nullable = false, length = 25)
    private String fieldName;
    @Column(name="NEW_VALUE", nullable = false, length = 50)
    private String newValue;
    @Column(name="OLD_VALUE", nullable = false, length = 50)
    private String oldValue;
    @Column(name="RECORD_ID", nullable = false)
    private int recordID;
    @Column(name="TABLE_NAME", nullable = false, length = 25)
    private String tableName;
    
    @ManyToOne
    @JoinColumn(name = "LOG_ID")
    private Log log;

	public int getLogComponentID() {
		return logComponentID;
	}

	public void setLogComponentID(int logComponentID) {
		this.logComponentID = logComponentID;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public int getRecordID() {
		return recordID;
	}

	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

}