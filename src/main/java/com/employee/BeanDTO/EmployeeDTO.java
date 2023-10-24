package com.employee.BeanDTO;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class EmployeeDTO extends ActionForm{

	private int empid;
	private String empname;
	private String empaddress;
	private String empgender;
	private String [] emphobbies;
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getEmpname() {
		return empname;
	}
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public String getEmpaddress() {
		return empaddress;
	}
	
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	
	public String getEmpgender() {
		return empgender;
	}
	
	public void setEmpgender(String empgender) {
		this.empgender = empgender;
	}
	
	public String[] getEmphobbies() {
		return emphobbies;
	}
	
	public void setEmphobbies(String[] emphobbies) {
		this.emphobbies = emphobbies;
	}
	
	//validate
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
	
		ActionErrors ae = new ActionErrors();
		
		if(empid==0) {
			ae.add("empid_e",new ActionMessage("msg1"));
		}
		if(empname.equals("")) {
			ae.add("empname_e", new ActionMessage("msg2"));
		}
		
		if(empaddress.equals("")) {
			ae.add("empaddress_e",new ActionMessage("msg3"));
		}

		if(empgender ==null ){
			ae.add("empgender_e", new ActionMessage("msg4"));
		}
		
		if(emphobbies ==null) {
			ae.add("emphobbies_e",new ActionMessage("msg5"));
		}
		
		return ae;
	}
}
