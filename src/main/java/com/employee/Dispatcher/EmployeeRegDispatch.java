package com.employee.Dispatcher;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class EmployeeRegDispatch extends Action {
		@Override
		public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			
			String  id = request.getParameter("empid");
			int empid;
			empid = Integer.parseInt(id);
			
			String empname = request.getParameter("empname");
			String empaddress = request.getParameter("empaddress");
			String empgender = request.getParameter("empgender");

			
			request.setAttribute("id",empid);
			request.setAttribute("name",empname);
			request.setAttribute("address",empaddress);
			request.setAttribute("gender",empgender);
			

			
			ArrayList<Object>nameArray = new ArrayList<>();
			nameArray.add(empid);
			nameArray.add(empname);
			nameArray.add(empaddress);
			nameArray.add(empgender);
			request.setAttribute("nameArray",nameArray);

			
			
			return mapping.findForward("success");
		}
}
