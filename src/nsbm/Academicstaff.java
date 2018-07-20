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
public class Academicstaff {
    
    String staff_id ;
    String sName;
    String address;
    String nic;
    String email;
    String subject;

    public Academicstaff(String staff_id, String sName, String address, String nic, String email, String subject) {
        this.staff_id = staff_id;
        this.sName = sName;
        this.address = address;
        this.nic = nic;
        this.email = email;
        this.subject = subject;
    }
    
    
        void lectureSave() {

String sql="INSERT INTO ROOT.LECTURE (LECTURE_ID, LECTURE_NAME, ADDRESS, NIC, LECTURE_EMAIL, SUBJECT) \n" +
"	VALUES (?, ?, ?, ?, ?,?)";

try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1,staff_id);
pst.setString(2, sName);
pst.setString(3, address);
pst.setString(4, nic);
pst.setString(5, email);
pst.setString(6,subject);




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
        
                void instructorSave() {

String sql="INSERT INTO ROOT.INSTRUCTOR (INSTRUCTOR_ID, INSTRUCTOR_NAME, ADDRESS, NIC, INSTRUCTOR_EMAIL, SUBJECT) \n" +
"	VALUES (?, ?, ?, ?, ?,?)";

try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1,staff_id);
pst.setString(2, sName);
pst.setString(3, address);
pst.setString(4, nic);
pst.setString(5, email);
pst.setString(6,subject);




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
