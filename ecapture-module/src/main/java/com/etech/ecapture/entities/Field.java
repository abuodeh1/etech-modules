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
@Table(name = "ECAPTURE_FIELD", schema="MOH")
public class Field {
	
	@Id
    @Column(name="FIELD_ID", nullable = false)
    private int fieldID;
   
    @Column(name="FIELD_ALIAS", length = 50)
    private String fieldAlias;
    @Column(name="FIELD_DEFAULT_VALUE", length = 25)
    private String fieldDefaultValue;
    @Column(name="FIELD_INDEX")
    private int fieldIndex;
    @Column(name="FIELD_LOOKUP_ID")
    private int fieldLookupID;
    @Column(name="FIELD_MANDATORY")
    private boolean fieldMandatory;
    @Column(name="FIELD_NAME", nullable = false, length = 50)
    private String fieldName;
    @Column(name="FIELD_NAME_AR", length = 50)
    private String fieldNameAr;
    @Column(name="FIELD_ORDER", nullable = false)
    private int fieldOrder;
    @Column(name="FIELD_SIZE")
    private int fieldSize;
    @Column(name="FIELD_STATUS")
    private short fieldStatus;
    @Column(name="FIELD_TEXTLINES")
    private int fieldTextlines;
    @Column(name="FIELD_TOOLTIP", length = 50)
    private String fieldTooltip;
    @Column(name="FIELD_TOOLTIP_AR", length = 50)
    private String fieldTooltipAr;
    @Column(name="FIELD_TYPE")
    private short fieldType;
    
    @ManyToOne
    @JoinColumn(name = "DATACLASS_ID")
    private DataClass dataClass;

	public int getFieldID() {
		return fieldID;
	}

	public void setFieldID(int fieldID) {
		this.fieldID = fieldID;
	}

	public String getFieldAlias() {
		return fieldAlias;
	}

	public void setFieldAlias(String fieldAlias) {
		this.fieldAlias = fieldAlias;
	}

	public String getFieldDefaultValue() {
		return fieldDefaultValue;
	}

	public void setFieldDefaultValue(String fieldDefaultValue) {
		this.fieldDefaultValue = fieldDefaultValue;
	}

	public int getFieldIndex() {
		return fieldIndex;
	}

	public void setFieldIndex(int fieldIndex) {
		this.fieldIndex = fieldIndex;
	}

	public int getFieldLookupID() {
		return fieldLookupID;
	}

	public void setFieldLookupID(int fieldLookupID) {
		this.fieldLookupID = fieldLookupID;
	}

	public boolean isFieldMandatory() {
		return fieldMandatory;
	}

	public void setFieldMandatory(boolean fieldMandatory) {
		this.fieldMandatory = fieldMandatory;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldNameAr() {
		return fieldNameAr;
	}

	public void setFieldNameAr(String fieldNameAr) {
		this.fieldNameAr = fieldNameAr;
	}

	public int getFieldOrder() {
		return fieldOrder;
	}

	public void setFieldOrder(int fieldOrder) {
		this.fieldOrder = fieldOrder;
	}

	public int getFieldSize() {
		return fieldSize;
	}

	public void setFieldSize(int fieldSize) {
		this.fieldSize = fieldSize;
	}

	public short getFieldStatus() {
		return fieldStatus;
	}

	public void setFieldStatus(short fieldStatus) {
		this.fieldStatus = fieldStatus;
	}

	public int getFieldTextlines() {
		return fieldTextlines;
	}

	public void setFieldTextlines(int fieldTextlines) {
		this.fieldTextlines = fieldTextlines;
	}

	public String getFieldTooltip() {
		return fieldTooltip;
	}

	public void setFieldTooltip(String fieldTooltip) {
		this.fieldTooltip = fieldTooltip;
	}

	public String getFieldTooltipAr() {
		return fieldTooltipAr;
	}

	public void setFieldTooltipAr(String fieldTooltipAr) {
		this.fieldTooltipAr = fieldTooltipAr;
	}

	public short getFieldType() {
		return fieldType;
	}

	public void setFieldType(short fieldType) {
		this.fieldType = fieldType;
	}

	public DataClass getDataClass() {
		return dataClass;
	}

	public void setDataClass(DataClass dataClass) {
		this.dataClass = dataClass;
	}
}