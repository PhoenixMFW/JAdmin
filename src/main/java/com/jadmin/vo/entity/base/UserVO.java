package com.jadmin.vo.entity.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.jadmin.vo.entity.ref.OrgRefVO;
import com.jadmin.vo.fundation.base.AbstractValueObject;

import lombok.Getter;
import lombok.Setter;

/**
 * @Title:web框架
 * @Description:UserVO
 * @Copyright:JAdmin (c) 2018年11月13日
 * 
 * @author:-jiujiya
 * @version:1.0
 */
@Entity
@Table(name = "sys_user")
@Getter
@Setter
public class UserVO extends AbstractValueObject {

	/** 序列号 */
	private static final long serialVersionUID = 1l;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 32)
	private String userId;

	@ManyToOne @JoinColumn(name = "orgId")
	private OrgRefVO org;

	@ManyToOne @JoinColumn(name = "roleId")
	@NotFound(action=NotFoundAction.IGNORE)
	private RoleVO role;

	@Column(length = 128)
	private String account;

	@Column(length = 128)
	private String name;

	@Column(length = 128)
	private String password;

	@Column(length = 128)
	private String sex;

	@Column(length = 15)
	private String lastLoginIp;

	@Column(length = 19)
	private String lastLoginTime;

	@Column(length = 10)
	private Integer loginCount;

	@Column(length = 19)
	private String psChangeTime;

	@Column(length = 1)
	private String isDelete;

	@Column(length = 19)
	private String operateTime;

	@Column(length = 32)
	private String operatorId;

	@Column(length = 1)
	private String billStatus;

	@Column(length = 512)
	private String memo;

	@Override
	public String getPrimaryKey() {
		return userId;
	}

	@Override
	public void setPrimaryKey(String key) {
		this.userId = key;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public OrgRefVO getOrg() {
		return org;
	}

	public void setOrg(OrgRefVO org) {
		this.org = org;
	}

	public RoleVO getRole() {
		return role;
	}

	public void setRole(RoleVO role) {
		this.role = role;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	public String getPsChangeTime() {
		return psChangeTime;
	}

	public void setPsChangeTime(String psChangeTime) {
		this.psChangeTime = psChangeTime;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}