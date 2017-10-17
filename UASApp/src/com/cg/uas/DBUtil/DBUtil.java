package com.cg.uas.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.cg.uas.exception.UniversityException;

public class DBUtil {
	private static Connection conn;

	public static Connection getConnection() throws UniversityException {
		if (conn == null) {
			try {
				InitialContext ic=new InitialContext();
				DataSource ds=(DataSource)ic.lookup("java:/jdbc/OracleDS");
				conn=ds.getConnection();
			}catch(SQLException e)
			{
				throw new UniversityException("Problem in obtaining connection");
			}catch(NamingException e)
			{
				throw new UniversityException("DataSource not found..");
			}
		}
		return conn;
	}
}
