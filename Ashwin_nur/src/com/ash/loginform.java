package com.ash;

import org.apache.struts.action.ActionForm;

public class loginform extends ActionForm
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username,password;

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
}
