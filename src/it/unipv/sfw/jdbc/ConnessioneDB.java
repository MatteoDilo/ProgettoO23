package it.unipv.sfw.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnessioneDB {
	
	private static final String PROPERTYDBDRIVER = "DBDRIVER";
	private static final String PROPERTYDBURL = "DBURL";
	private static final String PROPERTYNAME = "db_usn"; 
	private static final String PROPERTYPSW = "db_psw"; 
	private static String username;
	private static String password;
	private static String dbDriver;
	private static String dbURL;

	//private static ConnessioneDB conn;
	
	private static void init() {
		Properties prop = new Properties(System.getProperties());
		try {
			prop.load(new FileInputStream("properties/properties"));
			username=prop.getProperty(PROPERTYNAME);
			password=prop.getProperty(PROPERTYPSW);
			dbDriver =prop.getProperty(PROPERTYDBDRIVER);
			dbURL =prop.getProperty(PROPERTYDBURL);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection startConnection(Connection conn, String schema)
	{
		init();
		System.out.println(dbURL);
		
		
		
		if ( isOpen(conn) )
			closeConnection(conn);
	
		try 
		{
			
			dbURL=String.format(dbURL,schema); 
			System.out.println(dbURL);
			Class.forName(dbDriver);
			
			conn = DriverManager.getConnection(dbURL, username, password);// Apertura connessione
			conn.setAutoCommit(true);

		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return conn;
	}

	public static boolean isOpen(Connection conn)
	{
		if (conn == null)
			return false;
		else
			return true;
	}

	public static Connection closeConnection(Connection conn)
	{
		if ( !isOpen(conn) )
			return null;
		try 
		{

			conn.close();
			conn = null;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			return null;
		}
		return conn;
	}
}
