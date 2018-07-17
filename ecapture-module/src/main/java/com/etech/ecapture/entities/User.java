package com.etech.ecapture.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 13-Dec-2017 2:23:47 PM
 */
@Entity
@Table(name = "ECAPTURE_USER", schema="MOH")
public class User {

	@Id
    @Column(name="USER_ID", nullable = false)
    private Integer userID;
    
    @Column(name="USER_ACTING_AS", length = 25)
    private String userActingAs;
    @Column(name="USER_EMAIL", nullable = false, length = 50)
    private String userEmail;
    @Column(name="USER_EXPIRY_DATE")
    private Date userExpiryDate;
    @Column(name="USER_FAILED_LOGIN_COUNT")
    private int userFailedLoginCount;
    @Column(name="USER_FNAME", length = 25)
    private String userFName;
    @Column(name="USER_FNAME_AR", length = 25)
    private String userFNameAr;
    @Column(name="USER_ISLOCKED")
    private String userIsLocked;
    @Column(name="USER_ISREAL")
    private boolean userIsReal;
    @Column(name="USER_LNAME", length = 25)
    private String userLName;
    @Column(name="USER_LNAME_AR", length = 25)
    private String userLNameAr;
    @Column(name="USER_PASSWORD", nullable = false, length = 25)
    private String userPassword;
    @Column(name="USER_STATUS")
    private short userStatus;
    @Column(name="USER_UNLOCK_DATETIME")
    private Date userUnlockDatetime;
    @Column(name="USER_USERID", nullable = false)
    private String userUserID;

//  @OneToMany(mappedBy = "user")
//  private List<Log> logs;
  
//  public List<Group> groups;
//	public List<Role> roles;

	@Override
	public String toString(){
		return "UserID=" + userUserID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserActingAs() {
		return userActingAs;
	}

	public void setUserActingAs(String userActingAs) {
		this.userActingAs = userActingAs;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getUserExpiryDate() {
		return userExpiryDate;
	}

	public void setUserExpiryDate(Date userExpiryDate) {
		this.userExpiryDate = userExpiryDate;
	}

	public int getUserFailedLoginCount() {
		return userFailedLoginCount;
	}

	public void setUserFailedLoginCount(int userFailedLoginCount) {
		this.userFailedLoginCount = userFailedLoginCount;
	}

	public String getUserFName() {
		return userFName;
	}

	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}

	public String getUserFNameAr() {
		return userFNameAr;
	}

	public void setUserFNameAr(String userFNameAr) {
		this.userFNameAr = userFNameAr;
	}

	public String getUserIsLocked() {
		return userIsLocked;
	}

	public void setUserIsLocked(String userIsLocked) {
		this.userIsLocked = userIsLocked;
	}

	public boolean isUserIsReal() {
		return userIsReal;
	}

	public void setUserIsReal(boolean userIsReal) {
		this.userIsReal = userIsReal;
	}

	public String getUserLName() {
		return userLName;
	}

	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}

	public String getUserLNameAr() {
		return userLNameAr;
	}

	public void setUserLNameAr(String userLNameAr) {
		this.userLNameAr = userLNameAr;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public short getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(short userStatus) {
		this.userStatus = userStatus;
	}

	public Date getUserUnlockDatetime() {
		return userUnlockDatetime;
	}

	public void setUserUnlockDatetime(Date userUnlockDatetime) {
		this.userUnlockDatetime = userUnlockDatetime;
	}

	public String getUserUserID() {
		return userUserID;
	}

	public void setUserUserID(String userUserID) {
		this.userUserID = userUserID;
	}

}