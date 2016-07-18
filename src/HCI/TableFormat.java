
package HCI;

import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * @author Joynal Abedin
 * 25-Jun-2013
 */


public class TableFormat {
       
         
         public TableFormat(){
             
         }
             
          final   String[][] data = { {"",""}, {"a", "Test"} };
	final String[] headers = {"First Name", "Last name"};
                   
    
         TableModel tm = new DefaultTableModel(data, headers){

         @Override
         public int getRowCount()
         {
             return data.length;
         }

         @Override
         public int getColumnCount()
         {
             return headers.length;
         }

         @Override
         public String getColumnName(int i)
         {
            return headers[i];
         }

         @Override
         public Class<?> getColumnClass(int i)
         {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public boolean isCellEditable(int i, int i1)
         {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public Object getValueAt(int i, int i1)
         {
           return data[i][i1];
         }

         @Override
         public void setValueAt(Object o, int i, int i1)
         {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void addTableModelListener(TableModelListener tl)
         {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void removeTableModelListener(TableModelListener tl)
         {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
         public void insertRow(int row, Object[] rowData){
             
         }
         public void setNumRows(int size){
             
         }
            
           
             };
         }
         



