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
    
     void save() {

String sql="INSERT INTO ROOT.ENROLLMENT_ (STUDENT_ID, COURSE_ID, SEMESTER_NUMBER, ACADEMIC_YEAR, SUBJECT_01, SUBJECT_02, SUBJECT_03, SUBJECT_04) \n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1,std_id);
pst.setString(2, course_id);
pst.setString(3, semester);
pst.setString(4, year);
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
