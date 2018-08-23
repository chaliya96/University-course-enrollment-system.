package Driverclass;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
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
public class Undergraduate extends Student {
    
    ArrayList results;
    String alstream;
    String disrank ;
    String islandrank;
    

    public Undergraduate(int std_id, String fName, String lName, String address, String gender, String nic, String email, int cNumber, String alstream, String disrank, String islandrank) {
        super(std_id, fName, lName, address, gender, nic, email, cNumber);
        this.alstream = alstream;
        this.disrank = disrank;
        this.islandrank = islandrank;
    }
    
    public void addSubject(String s1, String r1, String s2, String r2, String s3, String r3){
        
        String sql="INSERT INTO ROOT.STUDENT_RESULTS (STUDENT_ID, SUBJECT_01, SUBJECT_2, SUBJECT_03, RESULTS_01, RESULTS_02, RESULTS_03) \n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?)";
try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);

pst.setString(1, String.valueOf(std_id));
pst.setString(2, s1);
pst.setString(3, s2);
pst.setString(4, s3);
pst.setString(5, r1);
pst.setString(6, r2);
pst.setString(7, r3);




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
    
    public void save(){
            String sql="INSERT INTO ROOT.UNDERGRADUATE_STUDENT (STUDENT_ID, FIST_NAME, LAST_NAME, ADDRESS, GENDER, NIC, EMAIL, CONTACT_NUM, AL_STREAM, DIS_RANK, ISLAND_RANK) \n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1,String.valueOf(std_id));
pst.setString(2, fName);
pst.setString(3, lName);
pst.setString(4, address);
pst.setString(5, gender);
pst.setString(6, nic);
pst.setString(7, email);
pst.setString(8, String.valueOf(cNumber));
pst.setString(9, alstream);
pst.setString(10, disrank);
pst.setString(11, islandrank); 



if(pst.execute())
{
JOptionPane.showMessageDialog(null,"Logged In Successfully");
         
 
}
else
{
JOptionPane.showMessageDialog(null, "Student has registred successfully ");
}
}
catch(SQLException | HeadlessException ex)
{
JOptionPane.showMessageDialog(null,ex);
}
   
        
        
        
    }

    public void update(){
            String sql="UPDATE ROOT.UNDERGRADUATE_STUDENT SET (FIST_NAME = ?, LAST_NAME = ?, ADDRESS = ?, GENDER = ?, NIC = ?, EMAIL = ?, CONTACT_NUM = ?, AL_STREAM = ?, DIS_RANK = ?, ISLAND_RANK = ?) \n" +
"	WHERE STUDENT_ID = ? ";
try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(11,String.valueOf(std_id));
pst.setString(1, fName);
pst.setString(2, lName);
pst.setString(3, address);
pst.setString(4, gender);
pst.setString(5, nic);
pst.setString(6, email);
pst.setString(7, String.valueOf(cNumber));
pst.setString(8, alstream);
pst.setString(9, disrank);
pst.setString(10, islandrank);



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
    
    
    

