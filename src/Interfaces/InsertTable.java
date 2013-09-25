/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Database.DatabaseConnectionHandler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Danula
 */
public class InsertTable {
        
    Statement stmt;
    public InsertTable() throws  Exception{
        
         Connection conn= DatabaseConnectionHandler.getConnection();
         stmt= conn.createStatement();
        
      //  initComponents();
    }
    public ResultSet getResultFromCars() {
        
        ResultSet rs=null;
        
        try{
            rs=stmt.executeQuery("Select * from cars");
        
        }
        catch(SQLException e){}
        
        return rs;
        
    }
}
