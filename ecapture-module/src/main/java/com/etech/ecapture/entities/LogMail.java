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
@Table(name = "ECAPTURE_LOG_MAIL", schema="MOH")
public class LogMail {

	@Id
    @Column(name="LOG_MAIL_ID", nullable = false)
    private int logMailID;
    
	@Column(name="LOG_MAIL_ATTACH_COUNT")
    private int logMailAttachCount;
    @Column(name="LOG_MAIL_ATTACH_NAMES")
    private int logMailAttachNames;
    @Column(name="LOG_MAIL_BODY", length = 25)
    private String logMailBody;
    @Column(name="LOG_MAIL_CC", length = 25)
    private String logMailCC;
    @Column(name="LOG_MAIL_SENDER", nullable = false)
    private int logMailSender;
    @Column(name="LOG_MAIL_SUBJECT", nullable = false, length = 25)
    private String logMailSubject;
    @Column(name="LOG_MAIL_TO", nullable = false, length = 25)
    private String logMailTo;
    
    @ManyToOne
    @JoinColumn(name = "LOG_ID")
    private Log log;

	public int getLogMailID() {
		return logMailID;
	}

	public void setLogMailID(int logMailID) {
		this.logMailID = logMailID;
	}

	public int getLogMailAttachCount() {
		return logMailAttachCount;
	}

	public void setLogMailAttachCount(int logMailAttachCount) {
		this.logMailAttachCount = logMailAttachCount;
	}

	public int getLogMailAttachNames() {
		return logMailAttachNames;
	}

	public void setLogMailAttachNames(int logMailAttachNames) {
		this.logMailAttachNames = logMailAttachNames;
	}

	public String getLogMailBody() {
		return logMailBody;
	}

	public void setLogMailBody(String logMailBody) {
		this.logMailBody = logMailBody;
	}

	public String getLogMailCC() {
		return logMailCC;
	}

	public void setLogMailCC(String logMailCC) {
		this.logMailCC = logMailCC;
	}

	public int getLogMailSender() {
		return logMailSender;
	}

	public void setLogMailSender(int logMailSender) {
		this.logMailSender = logMailSender;
	}

	public String getLogMailSubject() {
		return logMailSubject;
	}

	public void setLogMailSubject(String logMailSubject) {
		this.logMailSubject = logMailSubject;
	}

	public String getLogMailTo() {
		return logMailTo;
	}

	public void setLogMailTo(String logMailTo) {
		this.logMailTo = logMailTo;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

}