/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Danula
 */
public class SchoolTableModel extends AbstractTableModel{
    private int colnum=10;
    private int rownum;
    private String[] colNames={
                  "id", 
                   "contactname", 
                   "email", 
                   "name", 
                   "password", 
                   "schoolAddr", 
                   "phone", 
                   "preferredCentre",
                   "payment", 
                   "verified"
    };
    private  ArrayList<String[]> ResultSets;
    public SchoolTableModel(ResultSet rs) {
        ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
      
              String[] row={
                  rs.getString("id"), 
                  rs.getString("contactname"), 
                  rs.getString("email"), 
                  rs.getString("name"), 
                  rs.getString("password"), 
                  rs.getString("schoolAddr"), 
                  rs.getString("phone"), 
                  rs.getString("preferredCentre"),
                  rs.getString("payment"), 
                  rs.getString("verified")    
            };
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in CarTableModel");
            }
    
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         String[] row=ResultSets.get(rowIndex);
        return row[columnIndex];    
    }

    @Override
    public int getRowCount() {
        return ResultSets.size();
    }

    @Override
    public int getColumnCount() {
        return colnum;
    }
    public String getColumnName(int index) {

       return colNames[index];
    }
}
