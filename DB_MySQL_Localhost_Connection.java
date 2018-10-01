/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_mysql_localhost_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Marisol Hernandez
 */
public class DB_MySQL_Localhost_Connection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try
        {  
          Class.forName("com.mysql.jdbc.Driver"); //MySQL database connection
          Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testing?" + "user=root & password=");  
          PreparedStatement pst = (PreparedStatement) conn.prepareStatement("Select * from alumnos");  
          ResultSet rs =(ResultSet)pst.executeQuery();  
          if(rs.next())  
              System.out.println("si se logro la conexion");  
          else
              System.out.println("no se logro la conexion");       
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
}  
    }
    
