package nsbm;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class Payment {
    
    String std_id;
    String semester;
    String year;
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    Connection connection2 = null;
    PreparedStatement pst2 = null;
    ResultSet result2 = null;
    ArrayList subName = new ArrayList();
    ArrayList fees = new ArrayList();
    int tot;
         
    

    public Payment(String std_id, String semester, String year) {
        this.std_id = std_id;
        this.semester = semester;
        this.year = year;
    }

  
    
    
     public void save(){
         int seme = Integer.parseInt(semester);
         int yea = Integer.parseInt(year);
         ArrayList subjects = new ArrayList();
             String sql="SELECT * FROM ROOT.ENROLLMENT_ WHERE Student_ID = ? AND Semester_Number = ? AND Academic_Year = ? ";
try{
connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1, "3006");
pst.setInt(2, seme);
pst.setInt(3, yea);

System.out.println(seme + " " + yea);
result=pst.executeQuery();
if(result.next())
{
JOptionPane.showMessageDialog(null,"Logged In Successfully");

 
 subjects.add(result.getString("Subject_01"));
 subjects.add(result.getString("Subject_02"));
 subjects.add(result.getString("Subject_03"));
 subjects.add(result.getString("Subject_04"));
 

        this.fee(subjects);
 
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
     
     public void fee(ArrayList lis){
     
       
         
         for (int i = 0; i<lis.size(); i++){
             
             
             
         String sql="SELECT Fee,Subject_Name FROM ROOT.SUBJECT WHERE SUBJECT_ID = ?";
try{
connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1, lis.get(i).toString());

result=pst.executeQuery();
if(result.next())
{
JOptionPane.showMessageDialog(null,"Logged In Successfully");
    fees.add(result.getInt("Fee"));
    subName.add(result.getString("Subject_Name"));

    tot = tot + result.getInt("Fee");

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
         
         System.out.println(fees);
         
     
     }
    
}
