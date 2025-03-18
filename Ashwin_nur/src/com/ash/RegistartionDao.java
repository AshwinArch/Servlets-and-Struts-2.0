package com.ash;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.db.NewDbUtil;

public class RegistartionDao 
{
	public static boolean insertUser(RegForm reg)throws SQLException, IOException
	{
		Connection con=null;
		boolean status=false;
		CallableStatement cstmt=null;
		try 
		{
			con=NewDbUtil.getConnection();
			cstmt=con.prepareCall("{call p1( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
		
			cstmt.setString(1, reg.getT1());
			cstmt.setString(2, reg.getFirstname());
			cstmt.setString(3, reg.getLastname());
			cstmt.setString(4, reg.getUsername());
			cstmt.setString(5, reg.getEmail());
			cstmt.setString(6, reg.getPassword());
			cstmt.setInt(7, reg.getContact());
			cstmt.setString(8, reg.getSubs());
			cstmt.setString(9, reg.getInterest());
			cstmt.setString(10, reg.getAddress());
			cstmt.setString(11, reg.getCity());
			cstmt.setString(12, reg.getState());
			cstmt.setInt(13, reg.getPincode());
			cstmt.setInt(14, reg.getCoun_id());
			
			status=cstmt.execute();
			
		}
		finally
		{
			try
			{
				NewDbUtil.closeAllResources(null, cstmt, con);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return status; 
	}
}