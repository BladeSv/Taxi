package by.htp.Taxi.SQL;

import java.sql.*;

import by.htp.Taxi.entity.Transport;

public class SQL {
	   private static final String url = "jdbc:mysql://localhost:3306/mytest";
	    private static final String user = "root";
	    private static final String password = "3158_Mitr";

	    // JDBC variables for opening and managing connection
	    private static Connection con;
	    private static Statement stmt;
	    private static ResultSet rs;
	    Transport trans=new Transport();

	    public  void sql() {
	        String query = "select * from transport";

	        try {
	            // opening database connection to MySQL server
	            con = DriverManager.getConnection(url, user, password);

	            // getting Statement object to execute query
	            stmt = con.createStatement();

	            // executing SELECT query
	            rs = stmt.executeQuery(query);
	        
	            while (rs.next()) {
	            	int id =rs.getInt(1);
	                String name = rs.getString(2);
	                int speed =rs.getInt(3);
	                int fuel =rs.getInt(4);
	                double rate =rs.getDouble(5);
	                double pricekm =rs.getDouble(6);
	                trans.setName(name);
	                trans.setSpeed(speed);	        
	                trans.setFuel(fuel);
	                trans.setRate(rate);
	                trans.setPriceKm(pricekm);
	            }     
	        } 
	            catch (SQLException sqlEx) {
	            sqlEx.printStackTrace();
	        } finally {
	            //close connection ,stmt and resultset here
	            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
	        }
	        
	        System.out.println(trans);
	        System.out.println();
	        System.out.println(rs);
	        
	        
	    }

	}
	

