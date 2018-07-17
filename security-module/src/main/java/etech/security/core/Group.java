package etech.security.core;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:20:38 AM
 */

@NamedQueries({
	@NamedQuery(name="Group.findByGroupNameIgnoreLocale", 
			query="select g from Groups g where g.groupNameEn like ?1 or g.groupNameAr like ?1")
})
@Entity(name = "Groups")
public class Group {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int groupID;
	
	private boolean groupActivityStatus = true;
	
	private String groupDescAr;
	private String groupDescEn;
	
	@Column(nullable= false)
	private String groupNameEn;
	private String groupNameAr;
		
	@ManyToOne
    @JoinColumn(name = "GROUPPARENTID", nullable = true)
	private Group parentGroup;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name="GROUPAUTHORITIES", 
				 joinColumns = @JoinColumn(name = "GROUPID"),
					inverseJoinColumns = @JoinColumn(name = "AUTHORITYID"))
	private List<Authority> authorities;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name="MEMBERS", 
				 joinColumns = @JoinColumn(name = "GROUPID"),
					inverseJoinColumns = @JoinColumn(name = "USERID"))
	private List<User> users;
	
	public boolean isGroupActivityStatus() {
		return groupActivityStatus;
	}
	public Group setGroupActivityStatus(boolean groupActivityStatus) {
		this.groupActivityStatus = groupActivityStatus;
		return this;
	}
	public Group setGroupDescAr(String groupDescAr) {
		this.groupDescAr = groupDescAr;
		return this;
	}
//	public Group setGroupDescEn(String groupDescEn) {
//		this.groupDescEn = groupDescEn;
//		return this;
//	}
	
	public void setGroupDescEn(String groupDescEn) {
		this.groupDescEn = groupDescEn;
	}
	
	public Group setGroupNameAr(String groupNameAr) {
		this.groupNameAr = groupNameAr;
		return this;
	}
//	public Group setGroupNameEn(String groupNameEn) {
//		this.groupNameEn = groupNameEn;
//		return this;
//	}
	public void setGroupNameEn(String groupNameEn) {
		this.groupNameEn = groupNameEn;
	}
	public Group setParentGroup(Group parentGroup) {
		this.parentGroup = parentGroup;
		return this;
	}
	public Group setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
		return this;
	}
	public Group setUsers(List<User> users) {
		this.users = users;
		return this;
	}
	public String getGroupDescAr() {
		return groupDescAr;
	}
	public String getGroupDescEn() {
		return groupDescEn;
	}
	public int getGroupID() {
		return groupID;
	}
	public String getGroupNameAr() {
		return groupNameAr;
	}
	public String getGroupNameEn() {
		return groupNameEn;
	}
	public Group getParentGroup() {
		return parentGroup;
	}
	public List<Authority> getAuthorities() {
		return authorities;
	}
	public List<User> getUsers() {
		return users;
	}
	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupActivityStatus=" + groupActivityStatus + ", groupDescAr="
				+ groupDescAr + ", groupDescEn=" + groupDescEn + ", groupNameAr=" + groupNameAr + ", groupNameEn="
				+ groupNameEn + ", parentGroup=" + parentGroup + "]";
	}


}