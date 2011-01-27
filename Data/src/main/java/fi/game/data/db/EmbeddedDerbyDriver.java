package fi.game.data.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class EmbeddedDerbyDriver {

	public final static String DRIVERNAME = 
		"org.apache.derby.jdbc.EmbeddedDriver"; 
	
	public final static String PROTOCOL = 
		"jdbc:derby:"; 
	
	public final static String DBNAME = 
		"DungeonDB";
	
	private static EmbeddedDerbyDriver instance;
		
	public synchronized static EmbeddedDerbyDriver getInstance() {
		if (instance == null) {
			instance = new EmbeddedDerbyDriver();	
		} 
		return instance;	
	}
	
	public void create() throws SQLException {
		Connection connection = null;
		Properties properties = new Properties();
		try {
			connection = DriverManager.getConnection(PROTOCOL + 
					DBNAME + ";create=true", properties); 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}
	
	public void stop() {
		try {
			DriverManager.getConnection(PROTOCOL + DBNAME + ";shutdown=true;");	
		} catch (SQLException se) {
			// derby driver always throws exception code 08006 Shutdown.
			System.out.println("Database " + DBNAME + " shutdown succesfully.");
		}	
	}
	
	private EmbeddedDerbyDriver() {
		init();
	}
	
	private void init() {
		try {
			Class.forName(DRIVERNAME).newInstance();	
		} catch (Exception e) {
			// shit hits the fan!
			e.printStackTrace();
		}  	
	}
}
