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
public class Enrollment {
    
    String std_id ;
    String course_id;
    String sub1;
    String sub2;
    String sub3;
    String sub4;
    String semester;
    String year;

    public Enrollment(String std_id, String course_id, String sub1, String sub2, String sub3, String sub4, String semester, String year) {
        this.std_id = std_id;
        this.course_id = course_id;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.semester = semester;
        this.year = year;
    }
    
    public boolean check(){
        Connection connection = null;
    PreparedStatement pst = null;
    ResultSet result = null;
        
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
    
     public void save() {
         if (check() == true) {

String sql="INSERT INTO ROOT.ENROLLMENT_ (STUDENT_ID, COURSE_ID, SEMESTER_NUMBER, ACADEMIC_YEAR, SUBJECT_01, SUBJECT_02, SUBJECT_03, SUBJECT_04) \n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setInt(1,Integer.parseInt(std_id));
pst.setString(2, course_id);
pst.setInt(3, Integer.parseInt(semester));
pst.setInt(4, Integer.parseInt(year));
pst.setString(5, sub1);
pst.setString(6, sub2);
pst.setString(7, sub3);
pst.setString(8, sub4);





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
    
}
