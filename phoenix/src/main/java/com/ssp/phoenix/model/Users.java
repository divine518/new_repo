package com.ssp.phoenix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NamedNativeQuery(name = "Users.findByUser_id", query = "SELECT * FROM USERS WHERE USER_ID = ?", resultClass = Users.class)
//@NamedNativeQuery(name = "Users.deleteByUser_id", query = "DELETE FROM USERS WHERE USER_ID = ?", resultClass = Users.class)
public class Users {
	
	private String user_id;
	private String name;
	private String emailId;
	private String address;
	private String mobileNumber;
	private String age;
	private String isAdmin;
	private String password;
	private String bloodGroup;

	public Users() {

	}

	public Users(String user_id, String name, String emailId, String address, String mobileNumber, String age,
			String isAdmin,String bloodGroup, String password) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.emailId = emailId;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.isAdmin = isAdmin;
		this.bloodGroup = bloodGroup;
		this.password = password;
	}

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Column(name = "name", nullable = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address", nullable = true)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone_number", nullable = true)
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name = "age", nullable = true)
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column(name = "is_admin", nullable = true)
	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Column(name = "password", nullable = true)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email", nullable = true)
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "blood_group", nullable = true)
	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", name=" + name + ", emailId=" + emailId + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + ", age=" + age + ", isAdmin=" + isAdmin + ", password=" + password
				+ ", bloodGroup=" + bloodGroup + "]";
	}

	

}
