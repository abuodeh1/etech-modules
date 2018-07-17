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
@Table(name = "ECAPTURE_DOCUMENT_FIELD", schema="MOH")
public class DocumentField {
	
	@Id
    @Column(name="SOURCE_ID", nullable = false)
    private int sourceID;
    
    @Column(name="DATACLASS_FIELD1", length = 150)
    private String dataClassField1;
    @Column(name="DATACLASS_FIELD2", length = 150)
    private String dataClassField2;
    @Column(name="DATACLASS_FIELD3", length = 150)
    private String dataClassField3;
    @Column(name="DATACLASS_FIELD4", length = 150)
    private String dataClassField4;
    @Column(name="DATACLASS_FIELD5", length = 150)
    private String dataClassField5;
    @Column(name="DATACLASS_FIELD6", length = 150)
    private String dataClassField6;
    @Column(name="DATACLASS_FIELD7", length = 150)
    private String dataClassField7;
    
    @ManyToOne
    @JoinColumn(name = "DATACLASS_ID")
    private DataClass dataClass;
    
	public int getSourceID() {
		return sourceID;
	}
	public void setSourceID(int sourceID) {
		this.sourceID = sourceID;
	}
	public String getDataClassField1() {
		return dataClassField1;
	}
	public void setDataClassField1(String dataClassField1) {
		this.dataClassField1 = dataClassField1;
	}
	public String getDataClassField2() {
		return dataClassField2;
	}
	public void setDataClassField2(String dataClassField2) {
		this.dataClassField2 = dataClassField2;
	}
	public String getDataClassField3() {
		return dataClassField3;
	}
	public void setDataClassField3(String dataClassField3) {
		this.dataClassField3 = dataClassField3;
	}
	public String getDataClassField4() {
		return dataClassField4;
	}
	public void setDataClassField4(String dataClassField4) {
		this.dataClassField4 = dataClassField4;
	}
	public String getDataClassField5() {
		return dataClassField5;
	}
	public void setDataClassField5(String dataClassField5) {
		this.dataClassField5 = dataClassField5;
	}
	public String getDataClassField6() {
		return dataClassField6;
	}
	public void setDataClassField6(String dataClassField6) {
		this.dataClassField6 = dataClassField6;
	}
	public String getDataClassField7() {
		return dataClassField7;
	}
	public void setDataClassField7(String dataClassField7) {
		this.dataClassField7 = dataClassField7;
	}
	public DataClass getDataClass() {
		return dataClass;
	}
	public void setDataClass(DataClass dataClass) {
		this.dataClass = dataClass;
	}

}