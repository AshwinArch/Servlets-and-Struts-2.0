package com.ash;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

 public class login extends Action 
 {
   public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
			loginform log=(loginform)form;
			String un=log.getUsername();
			String pw=log.getPassword();
			System.out.println(un);
			System.out.println(pw);
		
		 if(un.equals("admin")&& pw.equals("admin"))
		 {
			 return mapping.findForward("success");
		 }
		 else
		 {
			 return mapping.findForward("failure");
		 }	
	 }   	  	    
}