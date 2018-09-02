package etech.logging.core;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Version;

public class AuditTrailValue {

	@Version
	@Column(name="UPDATE_TS")
	private Calendar dateMaj;
		
	@Column(name="CREATION_TS", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
	private Calendar dateCrea;
	
	private int auditValueID;
	private String columnName;
	private String oldValue;
	private String newValue;
	
	private AuditTrail auditTrail;
}
