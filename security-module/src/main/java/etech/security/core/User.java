package etech.security.core;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author mabuodeh-pc
 * @version 1.0
 * @created 23-Apr-2018 9:20:37 AM
 */

@NamedQueries({
	@NamedQuery(name="User.findByUserNameIgnoreLocale", 
			query="select u from User u where u.userNameEn like ?1 or u.userNameAr like ?1")
})
@Entity
@NamedEntityGraph(name = "graph.User.authorities", attributeNodes = @NamedAttributeNode("authorities"))
@Audited
public class User implements UserDetails{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userID;
	
	private boolean userActivityStatus = true;
	private String userAliasCode;
	private BigInteger userContactNumber;
	
	@Column(nullable = false)
	private Date userExpiryDate;
	private Date userCreatedDate;
	private Date userLastAccessedDate;
	
	private boolean userLocked;
	private Date userLockEndDate;
	
	private int userLoginFailedCount;
	private String userMailID;
	
	private String userNameAr;
	private String userNameEn;
	
	@Column(nullable = false, unique = true)
	private String userNickname;
	@Column(nullable = false)
	private String userPassword;
	
	@Column(nullable = false)
	private Date userPasswordExpiryDate;
	
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	private byte[] userSignatureImage;
	private String userSignaturePasword;
	
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	@OneToOne
    @JoinColumn(name = "SCHEDULEID")
	public Schedule schedule;
	
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	@ManyToOne
	@JoinColumn(name = "USERMANAGERID")
	private User manager;
	
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	@OneToOne
    @JoinColumn(name = "PROVIDERID")
	public Provider provider;
	
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinTable(name="USERAUTHORITIES", 
				 joinColumns = @JoinColumn(name = "USERID"),
					inverseJoinColumns = @JoinColumn(name = "AUTHORITYID"))
	private List<Authority> authorities;
	
	@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	@ManyToMany(cascade = CascadeType.DETACH, mappedBy="users")
	private List<Group> groups;
	
	public boolean isUserActivityStatus() {
		return userActivityStatus;
	}
	public User setUserActivityStatus(boolean userActivityStatus) {
		this.userActivityStatus = userActivityStatus;
		return this;
	}
	public User setUserAliasCode(String userAliasCode) {
		this.userAliasCode = userAliasCode;
		return this;
	}
	public User setUserContactNumber(BigInteger userContactNumber) {
		this.userContactNumber = userContactNumber;
		return this;
	}
	public User setUserCreatedDate(Date userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
		return this;
	}
	public User setUserExpiryDate(Date userExpiryDate) {
		this.userExpiryDate = userExpiryDate;
		return this;
	}
	public User setUserLastAccessedDate(Date userLastAccessedDate) {
		this.userLastAccessedDate = userLastAccessedDate;
		return this;
	}
	public User setUserLocked(boolean userLocked) {
		this.userLocked = userLocked;
		return this;
	}
	public User setUserLockEndDate(Date userLockEndDate) {
		this.userLockEndDate = userLockEndDate;
		return this;
	}
	public User setUserLoginFailedCount(int userLoginFailedCount) {
		this.userLoginFailedCount = userLoginFailedCount;
		return this;
	}
	public User setUserMailID(String userMailID) {
		this.userMailID = userMailID;
		return this;
	}
	public User setUserNameAr(String userNameAr) {
		this.userNameAr = userNameAr;
		return this;
	}
	public User setUserNameEn(String userNameEn) {
		this.userNameEn = userNameEn;
		return this;
	}
	public User setUserNickname(String userNickname) {
		this.userNickname = userNickname;
		return this;
	}
	public User setUserPassword(String userPassword) {
		this.userPassword = userPassword;
		return this;
	}
	public User setUserPasswordExpiryDate(Date userPasswordExpiryDate) {
		this.userPasswordExpiryDate = userPasswordExpiryDate;
		return this;
	}
	public User setUserSignatureImage(byte[] userSignatureImage) {
		this.userSignatureImage = userSignatureImage;
		return this;
	}
	public User setUserSignaturePasword(String userSignaturePasword) {
		this.userSignaturePasword = userSignaturePasword;
		return this;
	}
	public User setSchedule(Schedule schedule) {
		this.schedule = schedule;
		return this;
	}
	public void setManager(User manager) {
		this.manager = manager;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	public String getUserAliasCode() {
		return userAliasCode;
	}
	public BigInteger getUserContactNumber() {
		return userContactNumber;
	}
	public Date getUserCreatedDate() {
		return userCreatedDate;
	}
	public Date getUserExpiryDate() {
		return userExpiryDate;
	}
	public int getUserID() {
		return userID;
	}
	public Date getUserLastAccessedDate() {
		return userLastAccessedDate;
	}
	public boolean isUserLocked() {
		return userLocked;
	}
	public Date getUserLockEndDate() {
		return userLockEndDate;
	}
	public int getUserLoginFailedCount() {
		return userLoginFailedCount;
	}
	public String getUserMailID() {
		return userMailID;
	}
	public String getUserNameAr() {
		return userNameAr;
	}
	public String getUserNameEn() {
		return userNameEn;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public Date getUserPasswordExpiryDate() {
		return userPasswordExpiryDate;
	}
	public byte[] getUserSignatureImage() {
		return userSignatureImage;
	}
	public String getUserSignaturePasword() {
		return userSignaturePasword;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public User getManager() {
		return manager;
	}
	public Provider getProvider() {
		return provider;
	}
	
	public List<Group> getGroups() {
		return groups;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userActivityStatus=" + userActivityStatus + ", userAliasCode="
				+ userAliasCode + ", userContactNumber=" + userContactNumber + ", userCreatedDate=" + userCreatedDate
				+ ", userExpiryDate=" + userExpiryDate + ", userLastAccessedDate=" + userLastAccessedDate
				+ ", userLocked=" + userLocked + ", userLockEndDate=" + userLockEndDate + ", userLoginFailedCount="
				+ userLoginFailedCount + ", userMailID=" + userMailID + ", userNameAr=" + userNameAr + ", userNameEn="
				+ userNameEn + ", userNickname=" + userNickname + ", userPassword=" + userPassword
				+ ", userPasswordExpiryDate=" + userPasswordExpiryDate + ", userSignaturePasword=" + userSignaturePasword + "]";
		
		/*String info = "";
        JSONObject jsonInfo = new JSONObject();
        jsonInfo.put("user",this.userNickname);
        
        JSONArray authorityArray = new JSONArray();
        if(this.authorities != null){
            this.authorities.forEach(authority->{
                JSONObject subJson = new JSONObject();
                subJson.put("name", authority.getAuthorityCode());
                authorityArray.put(subJson);
            });
        }
        jsonInfo.put("authorities", authorityArray);
        info = jsonInfo.toString();*/
//		JsonToStringBuilder builder = new JsonToStringBuilder(this);
//		builder.append("userID", userID);
//		builder.append("userActivityStatus", userActivityStatus);
//		builder.append("userAliasCode", userAliasCode);
//		builder.append("userContactNumber", userContactNumber);
//		builder.append("userCreatedDate", userCreatedDate);
//		builder.append("userExpiryDate", userExpiryDate);
//		builder.append("userLastAccessedDate", userLastAccessedDate);
//		builder.append("userLocked", userLocked);
//		builder.append("userLockEndDate", userLockEndDate);
//		builder.append("userLoginFailedCount", userLoginFailedCount);
//		builder.append("userMailID", userMailID);
//		builder.append("userNameAr", userNameAr);
//		builder.append("userNameEn", userNameEn);
//		builder.append("userNickname", userNickname);
//		builder.append("userPassword", userPassword);
//		builder.append("userPasswordExpiryDate", userPasswordExpiryDate);
//		builder.append("userSignaturePasword", userSignaturePasword);
//		
//        return builder.build();

	}
	
	@Override
	public String getPassword() {
		return userPassword;
	}
	@Override
	public String getUsername() {
		return userNickname;
	}
	@Override
	public boolean isAccountNonExpired() {
		return ( userExpiryDate.getTime() - new Date().getTime() > 0);
	}
	@Override
	public boolean isAccountNonLocked() {
		return !userLocked;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return ( userPasswordExpiryDate.getTime() - new Date().getTime() > 0);
	}
	@Override
	public boolean isEnabled() {
		return userActivityStatus;
	}
	@Override
	public List<Authority> getAuthorities() {
		return authorities;
	}

}