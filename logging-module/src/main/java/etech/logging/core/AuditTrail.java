package etech.logging.core;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Version;

@Entity
public class AuditTrail {

	@Version
	@Column(name = "UPDATE_TS")
	private Calendar dateMaj;

	@Column(name = "CREATION_TS", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
	private Calendar dateCrea;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int auditID;
	//private Timestamp auditTime;
	private String tableName;
	private String instanceKey;
	private int userID = -1;
	
	@PrePersist
	void onCreate() {
		this.setDateCrea(Calendar.getInstance());
	}

	public Calendar getDateMaj() {
		return dateMaj;
	}

	public void setDateMaj(Calendar dateMaj) {
		this.dateMaj = dateMaj;
	}

	public Calendar getDateCrea() {
		return dateCrea;
	}

	public void setDateCrea(Calendar dateCrea) {
		this.dateCrea = dateCrea;
	}

	public int getAuditID() {
		return auditID;
	}

	public void setAuditID(int auditID) {
		this.auditID = auditID;
	}

//	public Timestamp getAuditTime() {
//		return auditTime;
//	}
//
//	public void setAuditTime(Timestamp auditTime) {
//		this.auditTime = auditTime;
//	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getInstanceKey() {
		return instanceKey;
	}

	public void setInstanceKey(String instanceKey) {
		this.instanceKey = instanceKey;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}
