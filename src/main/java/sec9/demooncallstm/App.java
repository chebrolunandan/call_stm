package sec9.demooncallstm;

import java.sql.*;
public class App
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","Nandu@1112");
			CallableStatement st = conn.prepareCall("{Call getFacultyDetails()}");
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));	
			}
		}
		catch(Exception e)
		{                                    
			
		}
	}
}
