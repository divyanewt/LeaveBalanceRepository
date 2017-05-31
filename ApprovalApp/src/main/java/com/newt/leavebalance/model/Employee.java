package com.newt.leavebalance.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TBL_EMPLOYEE")
public class Employee {
 @Id
 @Column(name="ID")
 
 String id;
 
 @NotNull
 @Column(name="FIRST_NAME")
 String firstName;
 
 @NotNull
 @Column(name="LAST_NAME")
 String lastName;
 
 @Column(name="EMAILID")
 String emailId;
 
 @Column(name="PASSWORD")
 @NotNull
 String password;
 
 @Column(name="SUPERVISOR_ID")
 int supervisorID;
 
 
 @Column(name="TITLE")
 @NotNull
 String title;
 @Column(name="FLAG")
 String flag;
 
 @Column(name="ONSHORE_RESOURCE")
 @NotNull
 String onShoreResource;
 
 @Column(name="JOINED_DATE")
 @NotNull
 Date joinedDate;
 
 @Column(name="RESIGNED_DATE")
 Date resginedDate;
 
 @Column(name="CREATE_DATE")
 @NotNull
 Date createDate;
 
 @Column(name="MODIFIED_DATE")
 @NotNull
 Date modifiedDate;
 
 @Column(name="MODIFIED_BY")
 @NotNull
 long modifiedBy;
 
 public Employee(){
  
 }

public Employee(String id, String firstName, String lastName, String emailId,
		String password, int supervisorID, String title, String flag,
		String onShoreResource, Date joinedDate, Date resginedDate,
		Date createDate, Date modifiedDate, long modifiedBy) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.password = password;
	this.supervisorID = supervisorID;
	this.title = title;
	this.flag = flag;
	this.onShoreResource = onShoreResource;
	this.joinedDate = joinedDate;
	this.resginedDate = resginedDate;
	this.createDate = createDate;
	this.modifiedDate = modifiedDate;
	this.modifiedBy = modifiedBy;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getSupervisorID() {
	return supervisorID;
}

public void setSupervisorID(int supervisorID) {
	this.supervisorID = supervisorID;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getFlag() {
	return flag;
}

public void setFlag(String flag) {
	this.flag = flag;
}

public String getOnShoreResource() {
	return onShoreResource;
}

public void setOnShoreResource(String onShoreResource) {
	this.onShoreResource = onShoreResource;
}

public Date getJoinedDate() {
	return joinedDate;
}

public void setJoinedDate(Date joinedDate) {
	this.joinedDate = joinedDate;
}

public Date getResginedDate() {
	return resginedDate;
}

public void setResginedDate(Date resginedDate) {
	this.resginedDate = resginedDate;
}

public Date getCreateDate() {
	return createDate;
}

public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}

public Date getModifiedDate() {
	return modifiedDate;
}

public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
}

public long getModifiedBy() {
	return modifiedBy;
}

public void setModifiedBy(long modifiedBy) {
	this.modifiedBy = modifiedBy;
}
 
 

}