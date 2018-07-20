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
public class Subject {
    
    String sub_id ;
    String subName;
    String    fee;
    String credits;
    String course1_id;
    String compulsory;

    public Subject(String sub_id, String subName, String fee, String credits, String compulsory, String course_id) {
        this.sub_id = sub_id;
        this.subName = subName;
        this.fee = fee;
        this.credits = credits;
        this.course1_id = course_id;
        this.compulsory = compulsory;
    }
    
  
    
    
    void save() {

String sql="INSERT INTO ROOT.SUBJECT (SUBJECT_ID, SUBJECT_NAME, FEE, CREDITS, COMPULSORY, COURSE_ID) \n" +
"	VALUES (?, ?, ?, ?, ?, ?)";
try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1,sub_id);
pst.setString(2, subName);
pst.setString(3, fee);
pst.setString(4, credits);
pst.setString(5, compulsory);
pst.setString(6, course1_id);




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
