package nsbm;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Course {
    
    String cour_id ;
    String courName;
    String duration;
    String creditLim;
    String fac_id;

    public Course(String cour_id, String courName, String duration, String creditLim, String fac_id) {
        this.cour_id = cour_id;
        this.courName = courName;
        this.duration = duration;
        this.creditLim = creditLim;
        this.fac_id = fac_id;
    }
    
    
    
    void save() {

String sql="INSERT INTO ROOT.COURSE (COURSE_ID, COURSE_NAME, DURATION, CREDIT_LIMIT, FACULTY) \n" +
"	VALUES (?,?,?,?,?)";
try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1,cour_id);
pst.setString(2, courName);
pst.setString(3, duration);
pst.setString(4, creditLim);
pst.setString(5, fac_id);




if(pst.execute())
{
JOptionPane.showMessageDialog(null,"Logged In Successfully");
         
 
}
else
{
JOptionPane.showMessageDialog(null, "erroe");
}
}
catch(SQLException | HeadlessException ex)
{
JOptionPane.showMessageDialog(null,ex);
}
  



}
    
}
