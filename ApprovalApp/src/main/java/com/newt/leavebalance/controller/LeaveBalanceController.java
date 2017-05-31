package com.newt.leavebalance.controller;

import java.util.Date;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newt.leavebalance.model.LeaveBalance;
import com.newt.leavebalance.model.LeaveType;
import com.newt.leavebalance.service.LeaveBalanceService;


@RestController
@RequestMapping("/leavebalance")
public class LeaveBalanceController {
	@Autowired
	LeaveBalanceService leaveBalanceService;
	//public final Logger logger=org.slf4j.LoggerFactory.getLogger(LeaveBalanceController.class);
	@RequestMapping(method= RequestMethod.GET,value="/get",produces = "application/json")
	public List<LeaveBalance> getAllLeaveBalance(){
		List<LeaveBalance> leavelist=leaveBalanceService.getAllLeaveBalance();
		
		return leavelist;
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/add",produces = "application/json")
	public LeaveBalance addLeaveBalance(@RequestBody LeaveBalance leaveBalance){
		
		return leaveBalanceService.addLeaveBalance(leaveBalance);
		
	}
	@RequestMapping(method=RequestMethod.GET, value="/get/leavebalId/{leaveBalId}",produces = "application/json")
	public  LeaveBalance getLeaveBalanceByLeaveBalId(@PathVariable("leaveBalId")int id){
		
		return leaveBalanceService.getLeaveBalanceByLeaveBalId(id);
		
	}
	
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/update",produces = "application/json" ,consumes="application/json")
	public LeaveBalance updateleaveBalance(@RequestBody LeaveBalance leaveBalance){
		
		return leaveBalanceService.updateLeaveBalance(leaveBalance);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{leaveBalId}",produces = "application/json")
	public String deleteLeaveBalance(@PathVariable("leaveBalId")int leaveBalId){
		
		leaveBalanceService.deleteLeaveBalance(leaveBalId);
		return "deleted successfully";
	}
	@RequestMapping(method=RequestMethod.GET, value="/get/byempId/{empId}",produces = "application/json")
	public  List<LeaveBalance> getLeaveBalanceByEmpId(@PathVariable("empId")String id){
		
		List<LeaveBalance> leaveb= leaveBalanceService.getLeaveBalanceByEmpId(id);
		
		return leaveb;
		
	}
	@RequestMapping(method=RequestMethod.GET, value="/get/leavebalancebyempIdandLeavetypeId/{empId}/{leaveTypeId}/{noOfDays}",produces = "application/json")
	public  LeaveBalance getLeaveBalanceCount(@PathVariable("empId")String empId,@PathVariable("leaveTypeId")int leaveTypeId,@PathVariable("noOfDays")int noOfDays){
		
		LeaveBalance leaveb= leaveBalanceService.getLeaveBalanceByEmpIdAndLeaveTypeId(empId,leaveTypeId);
		int leavecount =leaveb.getLeaveCount();
		if(noOfDays<=leavecount){
			return leaveb;
		}
			else{
				return null;
			}
			
			
			
			
		
		
		
	}
     /*@RequestMapping(method=RequestMethod.GET, value="/get/leavetype/{leaveTypeId}",produces = "application/json")
		public  LeaveType getLeaveTypeByLeaveTypeId(@PathVariable("leaveTypeId")int id){
			
			return leaveBalanceService.getLeaveTypeByLeaveTypeId(id);
			
		}*/
		

	@RequestMapping(method=RequestMethod.PUT,value="/updateleavebalancebyempid/{empId}/{leaveTypeId}",produces = "application/json" ,consumes="application/json")
	public String updateleaveBalanceByEmpId(@RequestBody LeaveBalance leaveBalance,@PathVariable("empId")String empId,@PathVariable("leaveTypeId")int leaveTypeId ){
		
	
			 leaveBalanceService.updateLeaveBalanceByEmpId(leaveBalance,empId,leaveTypeId);
			return "updated successfully";
		
		
	}
	@RequestMapping(method=RequestMethod.GET, value="/get/validateleavebalance/{empId}/{leaveTypeId}",produces = "application/json")
	public  LeaveBalance getLeaveBalanceByEmpIdAndLeaveTypeId(@PathVariable("empId")String empId,@PathVariable("leaveTypeId")int leaveTypeId ){
		
		LeaveBalance leaveb= leaveBalanceService.getLeaveBalanceByEmpIdAndLeaveTypeId(empId,leaveTypeId);
		
		return leaveb;
	}
}



