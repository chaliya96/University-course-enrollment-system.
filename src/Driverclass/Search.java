/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driverclass;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Search {
    
    String name;
    String item;
    String field;

    public Search(String item, String field, String name) {
        this.item = item;
        this.field = field;
        this.name = name;
    }
    
    public ResultSet getVal(){
    Connection connection;
    PreparedStatement pst ;
    ResultSet result = null;
     String sql="SELECT * FROM ROOT.UNDERGRADUATE_STUDENT WHERE FIST_NAME LIKE ? ";
try{
connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
pst=(PreparedStatement) connection.prepareStatement(sql);

pst.setString(1,"%" + item + "%");
result=pst.executeQuery();
if(result.next())
{
        result=pst.executeQuery();
        return result;
 
}
else
{
JOptionPane.showMessageDialog(null, "No such a name");
return result;
}
}
catch(SQLException | HeadlessException ex)
{
JOptionPane.showMessageDialog(null,ex);
return result;
}
    
    
    
    }
    
}
