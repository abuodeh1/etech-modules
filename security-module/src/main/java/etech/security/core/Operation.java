package etech.security.core;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:20:37 AM
 */

@NamedQueries({
	@NamedQuery(name="Operation.findByOperationNameIgnoreLocale", 
			query="select o from Operation o where o.operationNameEn like ?1 or o.operationNameAr like ?1")
})
@Entity
public class Operation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int operationID;
	
	private String operationDescAr;
	private String operationDescEn;
	
	private String operationNameAr;
	private String operationNameEn;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "OPERATIONID", nullable = true)
	private List<Authority> authorities;
	
	@ManyToOne
	@JoinColumn(name = "OPERATIONPARENTID")
	private Operation parentOperation;
	
	public String getOperationDescAr() {
		return operationDescAr;
	}
	public Operation setOperationDescAr(String operationDescAr) {
		this.operationDescAr = operationDescAr;
		return this;
	}
	public Operation setOperationDescEn(String operationDescEn) {
		this.operationDescEn = operationDescEn;
		return this;
	}
	public Operation setOperationNameAr(String operationNameAr) {
		this.operationNameAr = operationNameAr;
		return this;
	}
	public Operation setOperationNameEn(String operationNameEn) {
		this.operationNameEn = operationNameEn;
		return this;
	}
	public Operation setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
		return this;
	}
	public Operation setParentOperation(Operation parentOperation) {
		this.parentOperation = parentOperation;
		return this;
	}
	public String getOperationDescEn() {
		return operationDescEn;
	}
	public int getOperationID() {
		return operationID;
	}
	public String getOperationNameAr() {
		return operationNameAr;
	}
	public String getOperationNameEn() {
		return operationNameEn;
	}
	public List<Authority> getAuthorities() {
		return authorities;
	}
	public Operation getParentOperation() {
		return parentOperation;
	}
	@Override
	public String toString() {
		return "Operation [operationID=" + operationID + ", operationDescAr=" + operationDescAr + ", operationDescEn="
				+ operationDescEn + ", operationNameAr=" + operationNameAr + ", operationNameEn=" + operationNameEn
				+ ", authorities=" + authorities + ", parentOperation=" + parentOperation + "]";
	}

}