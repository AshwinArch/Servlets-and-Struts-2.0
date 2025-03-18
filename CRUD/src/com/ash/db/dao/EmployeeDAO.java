package com.ash.db.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.ash.db.DBUtil;
public class EmployeeDAO
{
	public static int insertEmp(Connection con, Map<String, String[]> params)
	{
		String firstName =((String[])params.get("fn"))[0];
		String lastName =((String[])params.get("ln"))[0];
		String age =((String[])params.get("age"))[0];
		String sql="insert into emp values(emp_seq.nextval, '"+firstName+"' , '"+lastName+"' , "+age+")";
		System.out.println(sql);
		Statement stmt=null;
		int status=0;
		try
		{
			stmt=con.createStatement();
			status=stmt.executeUpdate(sql);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.closeDBResources(null, stmt);
		}
		return status;
	}
	public static ArrayList<HashMap<String, String>> searchRecords(Connection con, Map<String, String[]> params)
	{
		String criteria=((String[])params.get("criteria"))[0];
		String text=((String[])params.get("text"))[0];
		String sql=null;
		if ("first_name".equals(criteria) || "last_name".equals(criteria))
		{
			sql="select * from emp where "+criteria+" like '%"+text+"%'";
		}
		else if ("age".equals(criteria)) 
		{
			sql="select * from emp where "+criteria+"="+text;
		}
		else 
		{
			try
			{
				@SuppressWarnings("unused")
				
				int i=Integer.parseInt(text);
				sql="select * from emp where first_name like '%"+text+"%' or last_name like '%"+text+"%' or age = "+text;
			}
			catch(NumberFormatException e)
			{
				sql="select * from emp where first_name like '%"+text+"%' or last_name like '%"+text+"%'";
			}
		}
		System.out.println(sql);
		ArrayList<HashMap<String, String>> records=new ArrayList<HashMap<String, String>>();
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			stmt=con.createStatement();
			rs = stmt.executeQuery(sql);
			HashMap<String, String> record=null;
			while(rs.next())
			{
				record=new HashMap<String, String>();
				record.put("id", rs.getString("id"));
				record.put("firstName", rs.getString("first_name"));
				record.put("lastName", rs.getString("last_name"));
				record.put("age", rs.getString("age"));
				records.add(record);
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.closeDBResources(rs, stmt);
		}
		return records;
	}
	@SuppressWarnings("unchecked")
	
	public static HashMap readRecord(Connection con, String id)
	{
		String sql="select * from emp where id="+id;
		Statement stmt=null;
		ResultSet rs=null;
		HashMap<String, String> record=new HashMap<String, String>();
		try
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next())
			{
				record.put("id", rs.getString("id"));
				record.put("firstName", rs.getString("first_name"));
				record.put("lastName", rs.getString("last_name"));
				record.put("age", rs.getString("age"));
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.closeDBResources(rs, stmt);
		}
		return record;
	}
	public static int deleteRecord(Connection con, String id)
	{
		String sql="delete from emp where id = "+id;
		Statement stmt=null;
		int status=0;
		try
		{
			stmt=con.createStatement();
			status=stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.closeDBResources(null, stmt);
		}
		return status;
	} 
	public static int saveEmp(Connection con, Map<String, String[]> params)
	{
		String id=((String[])params.get("id"))[0];
		String firstName=((String[])params.get("firstName"))[0];
		String lastName=((String[])params.get("lastName"))[0];
		String age=((String[])params.get("age"))[0];
		StringBuffer sql=new StringBuffer();
		sql.append("update emp set ");
		sql.append(" first_Name = '"+firstName+"',");
		sql.append(" last_Name = '"+lastName+"',");
		sql.append(" age="+age);
		sql.append(" where id="+id);
		Statement stmt=null;
		int status=0;
		try
		{
			stmt=con.createStatement();
			status=stmt.executeUpdate(sql.toString());
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.closeDBResources(null, stmt);
		}
		return status;
	}
}
