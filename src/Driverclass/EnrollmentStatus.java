package Driverclass;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class EnrollmentStatus {
    
    String std_id ;
    String course_id;
   

    public EnrollmentStatus(String std_id, String course_id) {
        this.std_id = std_id;
        this.course_id = course_id;
      
    }
    
    public boolean check(){
        Connection connection ;
    PreparedStatement pst ;
    ResultSet result ;
        
        String sql="SELECT * FROM ROOT.ENROLLMENT_ WHERE STUDENT_ID = ?";
try{
connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1,String.valueOf(std_id));
result=pst.executeQuery();
if(result.next())
{
JOptionPane.showMessageDialog(null,"This Student has already registered");
        return false;
 
}
else
{
return true;
}
}
catch(SQLException | HeadlessException ex)
{
JOptionPane.showMessageDialog(null,ex);
return false;
}
    
    
    }
    
    
    
}
