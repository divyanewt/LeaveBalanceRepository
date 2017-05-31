package com.newt.leavebalance.model;


import java.util.Date;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TBL_LEAVEBALANCE")
public class LeaveBalance {
	
	@Id
	@Column(name="LEAVEBAL_ID")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int leaveBalId;
	
	@Column(name="LEAVE_TYPE_ID")
	private int leaveTypeId;
	@Column(name="LEAVE_COUNT")
	private int leaveCount;
	@Column(name="CREATE_DATE")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="GMT")
	private Date createDate;
	
	@Column(name="MODIFIED_DATE")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="GMT")
	private Date modifiedDate;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	@Column(name="EMP_ID")
	private String empId;
	
	private String leaveType;
	 
	
	 public LeaveBalance(){}

	

	public String getLeaveType() {
		return leaveType;
	}



	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}



	public LeaveBalance(int leaveBalId, int leaveTypeId, int leaveCount,
			Date createDate, Date modifiedDate, String modifiedBy, String empId) {
		super();
		this.leaveBalId = leaveBalId;
		this.leaveTypeId = leaveTypeId;
		this.leaveCount = leaveCount;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
		this.empId = empId;
	}

	public int getLeaveBalId() {
		return leaveBalId;
	}

	public void setLeaveBalId(int leaveBalId) {
		this.leaveBalId = leaveBalId;
	}

	public int getLeaveTypeId() {
		return leaveTypeId;
	}

	public void setLeaveTypeId(int leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}

	public int getLeaveCount() {
		return leaveCount;
	}

	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
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

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	

	

	
	

	 
}