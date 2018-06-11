package by.htp.Taxi.SQL;

import java.sql.*;

import by.htp.Taxi.entity.Transport;
import by.htp.Taxi.entity.TransportPark;

public class SQL {
	   private static final String url = "jdbc:mysql://db4free.net:3306/bladesv_mytest?useSSL=false";
	    private static final String user = "bladesv";
	    private static final String password = "12345678";

	  
	    private static Connection con;
	    private static Statement stmt;
	    private static ResultSet rs;
	   

	    public  void sqlRead(TransportPark transportPark) {
	        String query = "select * from transport";

	        try {
	         
	            con = DriverManager.getConnection(url, user, password);
	      
	            stmt = con.createStatement();	     
	            rs = stmt.executeQuery(query);	    
	            
	            while (rs.next()) {
	            	 Transport trans=new Transport();
	            	
	
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
	                transportPark.addTranport(trans);
	        
	            }     
	        } 
	            catch (SQLException sqlEx) {
	            sqlEx.printStackTrace();
	        } finally {
	          
	            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
	        }
	        
	      
	        System.out.println();
	       
	        
	        
	    }
	    
	    
	    
	    
	    

	}
	

