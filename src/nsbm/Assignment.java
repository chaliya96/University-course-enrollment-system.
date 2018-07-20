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
public class Assignment {
    
    String std_id ;
    String sub_id ;
    String assignment_type;
    int assignment_num;
    int marks;

    public Assignment(String std_id, String sub_id, String assignment_type, int assignment_num, int marks) {
        this.std_id = std_id;
        this.sub_id = sub_id;
        this.assignment_type = assignment_type;
        this.assignment_num = assignment_num;
        this.marks = marks;
    }
    
    
    void save(){
            String sql="INSERT INTO ROOT.\"ASSIGNMENT\" (STUDENT_ID, SUBJECT_ID, ASSIGNMENT_TYPE, ASSIGNMENT_NUMBER, MARKS) \n" +
"	VALUES (?,?,?,?,?)";
try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1,String.valueOf(std_id));
pst.setString(2, sub_id);
pst.setString(3, assignment_type);
pst.setInt(4,assignment_num);
pst.setInt(5,marks);



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
