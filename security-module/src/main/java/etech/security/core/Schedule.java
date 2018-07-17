package etech.security.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:20:38 AM
 */

@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int scheduleID;
	
	private boolean scheduleActivityStatus = true;
	
	private boolean scheduleDayFR;
	private boolean scheduleDayMO;
	private boolean scheduleDaySA;
	private boolean scheduleDaySU;
	private boolean scheduleDayTH;
	private boolean scheduleDayTU;
	private boolean scheduleDayWE;
	
	private boolean scheduleDefault;
	
	private String scheduleDescAr;
	private String scheduleDescEn;
	
	private int scheduleintervalEnd;
	private int scheduleIntervalStart;
	
	private String scheduleNameAr;
	private String scheduleNameEn;
	
	private boolean scheduleStatus;
	
	public boolean isScheduleActivityStatus() {
		return scheduleActivityStatus;
	}
	public Schedule setScheduleActivityStatus(boolean scheduleActivityStatus) {
		this.scheduleActivityStatus = scheduleActivityStatus;
		return this;
	}
	public Schedule setScheduleDayFR(boolean scheduleDayFR) {
		this.scheduleDayFR = scheduleDayFR;
		return this;
	}
	public Schedule setScheduleDayMO(boolean scheduleDayMO) {
		this.scheduleDayMO = scheduleDayMO;
		return this;
	}
	public Schedule setScheduleDaySA(boolean scheduleDaySA) {
		this.scheduleDaySA = scheduleDaySA;
		return this;
	}
	public Schedule setScheduleDaySU(boolean scheduleDaySU) {
		this.scheduleDaySU = scheduleDaySU;
		return this;
	}
	public Schedule setScheduleDayTH(boolean scheduleDayTH) {
		this.scheduleDayTH = scheduleDayTH;
		return this;
	}
	public Schedule setScheduleDayTU(boolean scheduleDayTU) {
		this.scheduleDayTU = scheduleDayTU;
		return this;
	}
	public Schedule setScheduleDayWE(boolean scheduleDayWE) {
		this.scheduleDayWE = scheduleDayWE;
		return this;
	}
	public Schedule setScheduleDefault(boolean scheduleDefault) {
		this.scheduleDefault = scheduleDefault;
		return this;
	}
	public Schedule setScheduleDescAr(String scheduleDescAr) {
		this.scheduleDescAr = scheduleDescAr;
		return this;
	}
	public Schedule setScheduleDescEn(String scheduleDescEn) {
		this.scheduleDescEn = scheduleDescEn;
		return this;
	}
	public Schedule setScheduleintervalEnd(int scheduleintervalEnd) {
		this.scheduleintervalEnd = scheduleintervalEnd;
		return this;
	}
	public Schedule setScheduleIntervalStart(int scheduleIntervalStart) {
		this.scheduleIntervalStart = scheduleIntervalStart;
		return this;
	}
	public Schedule setScheduleNameAr(String scheduleNameAr) {
		this.scheduleNameAr = scheduleNameAr;
		return this;
	}
	public Schedule setScheduleNameEn(String scheduleNameEn) {
		this.scheduleNameEn = scheduleNameEn;
		return this;
	}
	public Schedule setScheduleStatus(boolean scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
		return this;
	}
	public boolean isScheduleDayFR() {
		return scheduleDayFR;
	}
	public boolean isScheduleDayMO() {
		return scheduleDayMO;
	}
	public boolean isScheduleDaySA() {
		return scheduleDaySA;
	}
	public boolean isScheduleDaySU() {
		return scheduleDaySU;
	}
	public boolean isScheduleDayTH() {
		return scheduleDayTH;
	}
	public boolean isScheduleDayTU() {
		return scheduleDayTU;
	}
	public boolean isScheduleDayWE() {
		return scheduleDayWE;
	}
	public boolean isScheduleDefault() {
		return scheduleDefault;
	}
	public String getScheduleDescAr() {
		return scheduleDescAr;
	}
	public String getScheduleDescEn() {
		return scheduleDescEn;
	}
	public int getScheduleID() {
		return scheduleID;
	}
	public int getScheduleintervalEnd() {
		return scheduleintervalEnd;
	}
	public int getScheduleIntervalStart() {
		return scheduleIntervalStart;
	}
	public String getScheduleNameAr() {
		return scheduleNameAr;
	}
	public String getScheduleNameEn() {
		return scheduleNameEn;
	}
	public boolean isScheduleStatus() {
		return scheduleStatus;
	}

	

}