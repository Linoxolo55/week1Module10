import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Creatingdatabase {

	public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	ResultSet resultset=null;
	
	try {
		Class.forName("sun.jdbc.obdc.JdbcOdbcDriver");
	}
catch(ClassNotFoundException cnfex) {
	System.out.println("Problem in loading" + "MS Access JDBC driver");
	cnfex.printStackTrace();
}
	try {
		String msAccessDBName=" "';
		String dbURL="jdbc:odbc:Driver=" +"{Microsoft Access Driver(*.mdb,*accdb)};"+
		"DBQ=" + msAccessDBName+ ";DriverID=22;READONLY=true";
		
		connection= DriverManager.getConnection(dbURL);
		statement=connection.createStatement();
		
		
		
	}
	}

}
