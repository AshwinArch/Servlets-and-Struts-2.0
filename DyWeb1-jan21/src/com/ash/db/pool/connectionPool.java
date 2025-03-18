/**
 * 
 */
package com.ash.db.pool;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
public class connectionPool
{
		private Vector<Connection> pool=null;
		private String classname;
		private String url;
		private String user;
		private String password;
		private int poolsize;
		
		public connectionPool(String classname, String url, String user, String password, int polsize)
		{
			this.classname =classname;
			this.url =url;
			this.user =user;
			this.password =password;
			this.poolsize =polsize;
			pool=new Vector<Connection>(poolsize);
		}
		public void init()
		{
			try
			{
				Class.forName(classname);
			} 
			catch (ClassNotFoundException e)
			{
				System.out.println(e);// TODO: handle exception
			}
			Connection con=null;
			for(int i=0;i<poolsize;i++)
			{
				con=getConnection();
				pool.add(con);
			}
			System.out.println("pool initialized with "+poolsize+" connections");
		}
		private Connection getConnection()
		{
			Connection con=null;
			try
			{
				con=DriverManager.getConnection(url, user, password);
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			return con;
		}
		public Connection checkOut()
		{
			Connection con=null;
			if(pool.size()>0)
			{
				con=pool.remove(0);
			}
			else
			{
				con=getConnection();
			}
			return con;
		}
		public void checkIn(Connection con)
		{
			if(con instanceof Connection)
			{
				if(pool.size()<poolsize)
				{
					pool.add(con);
				}
				else
				{
					closeConnection(con);
				}
			}
		}
		private void closeConnection(Connection con)
		{
			try
			{
				con.close();
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		@SuppressWarnings("unused")
		public void release()
		{
			Connection con=null;
			for (int i = 0; i < pool.size();)
			{
				con=pool.remove(0);
				closeConnection(con);
			}
		System.out.println("pool released");
		pool=null;
		}
}
