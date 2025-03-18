/**
 * 
 */
package class2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import ash.com.Util;

/**
 * @author Ashwin
 *
 */
public class A10
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		try
		{
			con=Util.getConnection();
			stmt=con.createStatement();
			int records=saveIntoDb(stmt);
			System.out.println(records+"records saved in the db.");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			Util.closedDbResources(null, stmt, con);
		}
	}
		private static int saveIntoDb (Statement stmt)
		{
			File file = new File("emp.txt");
			FileReader reader=null;
			BufferedReader bReader=null;
			String s1,name, age, salary, sql;
			int records=0;
			int sno=0;
			try
			{
				reader =new FileReader(file);
				bReader=new BufferedReader(reader);
				s1=bReader.readLine();
				while(s1!=null)
				{
					name=s1.substring(0, s1.indexOf(';'));
					age=s1.substring(s1.indexOf(';')+1, s1.lastIndexOf(';'));
					salary=s1.substring(s1.lastIndexOf(';')+1);
					sql="insert into test2 values ("+(++sno)+",' " +name+" '," +age+","+salary+")";
					records +=stmt.executeUpdate(sql);
					s1=bReader.readLine();
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
				// TODO: handle exception
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
			finally
			{
				try
				{
					if(bReader!=null)
					{
						
						bReader.close();
						bReader=null;
					}
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				try
				{
					if(reader!=null)
					{
						reader.close();
						reader=null;
					}
				} 
				catch (IOException e2)
				{
					e2.printStackTrace();
					// TODO: handle exception
				}
			}
			return records;
		}
	}

