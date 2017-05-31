package com.newt.leavebalance.repository;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;








import com.newt.leavebalance.model.LeaveBalance;
import com.newt.leavebalance.model.LeaveType;

@Repository("LeaveBalanceRepository")
public interface LeaveBalanceRepository extends JpaRepository<LeaveBalance, Integer>{
	public long count() ;
	 public List<LeaveBalance> findAll() ;
	 @Transactional
	 public void deleteByLeaveBalId(Integer leaveBalId);
	 public LeaveBalance findOne(Integer leaveBalId);
	 public <S extends LeaveBalance> List<S> save(List<S> leavebalance) ;
	 
	 public List<LeaveBalance> findByEmpId (String empId);
	// public List<LeaveBalance> findByLeaveBalId(int leaveBalId);
	 
	 @Query(value="select l.LEAVE_TYPE  from TBL_LEAVE_TYPE l where l.LEAVE_TYPE_ID=?1",nativeQuery=true)
	 public String findByLeaveTypeId(int leaveTypeId);
	 public LeaveBalance findByEmpIdAndLeaveTypeId(String empId,int leaveTypeId); 
	@Modifying
	@Transactional
	@Query(value="update tbl_leavebalance l set l.leaveBal_Id = ?1,"
	        + "l.leave_Count=?3 , l.create_Date=?4, l.modified_Date=?5,"
		    + "l.modified_By=?6, "
	        +" l.leave_Type=?7 where l.emp_Id=?8 and l.leave_Type_Id=?2",nativeQuery=true)
	public void updateLeaveBalanceByEmpId(int leaveBalId,
			int leaveTypeId, int leaveCount, Date createDate,
			Date modifiedDate, String modifiedBy, String leaveType, String empId);
}

