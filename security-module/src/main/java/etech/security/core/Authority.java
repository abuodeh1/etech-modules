package etech.security.core;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author mabuodeh-pc
 * @version 1.0
 * @created 23-Apr-2018 9:20:37 AM
 */

@NamedQueries({
	@NamedQuery(name="Authority.findByAuthorityNameIgnoreLocale", 
			query="select a from Authority a where a.authorityNameEn like ?1 or a.authorityNameAr like ?1")
})
@Entity
public class Authority implements GrantedAuthority{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorityID;
	
	@Column(nullable = false)
	private String authorityCode;
	
	private boolean authorityActivityStatus = true;
	
	private String authorityDescAr;
	private String authorityDescEn;
	
	@Column(nullable = false)
	private String authorityNameEn;
	private String authorityNameAr;
	
/*	@ManyToMany(cascade = CascadeType.DETACH, mappedBy="authorities")
	private List<User> users;
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}*/
	public boolean isAuthorityActivityStatus() {
		return authorityActivityStatus;
	}
	public void setAuthorityActivityStatus(boolean authorityActivityStatus) {
		this.authorityActivityStatus = authorityActivityStatus;
	}
	public void setAuthorityDescAr(String authorityDescAr) {
		this.authorityDescAr = authorityDescAr;
	}
	public void setAuthorityDescEn(String authorityDescEn) {
		this.authorityDescEn = authorityDescEn;
	}
	public Authority setAuthorityNameAr(String authorityNameAr) {
		this.authorityNameAr = authorityNameAr;
		return this;
	}
	public void setAuthorityNameEn(String authorityNameEn) {
		this.authorityNameEn = authorityNameEn;
	}
	public String getAuthorityCode() {
		return authorityCode;
	}
	public void setAuthorityCode(String authorityCode) {
		this.authorityCode = authorityCode;
	}
	public String getAuthorityDescAr() {
		return authorityDescAr;
	}
	public String getAuthorityDescEn() {
		return authorityDescEn;
	}
	public int getAuthorityID() {
		return authorityID;
	}
	public String getAuthorityNameAr() {
		return authorityNameAr;
	}
	public String getAuthorityNameEn() {
		return authorityNameEn;
	}
	
	@Override
	public String toString() {
		return "Authority [authorityID=" + authorityID + ", authorityCode=" + authorityCode + ", authorityActivityStatus=" + authorityActivityStatus
				+ ", authorityDescAr=" + authorityDescAr + ", authorityDescEn=" + authorityDescEn + ", authorityNameAr="
				+ authorityNameAr + ", authorityNameEn=" + authorityNameEn + "]";
	}
	@Override
	public String getAuthority() {
		return authorityCode;
	}

	
}