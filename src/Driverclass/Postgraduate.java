package Driverclass;


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
public class Postgraduate extends Student {
    
   String type;
   String institute;
   String comp_year;

    public Postgraduate( int std_id, String fName, String lName, String address, String gender, String nic, String email, int cNumber,String type, String institute, String comp_year) {
        super(std_id, fName, lName, address, gender, nic, email, cNumber);
        this.type = type;
        this.institute = institute;
        this.comp_year = comp_year;
    }

  
    public void save(){
            String sql="INSERT INTO ROOT.POSTGRADUATE_STUDENT (STUDENT_ID, FIRST_NAME, LAST_NAME, ADDRESS, GENDER, EMAIL, NIC, CONTACT_NUMBER, QUALIFICATION_TYPE, INSTITUTE, YEAR_COMPLETION) \n" +
"	VALUES (?,?,?,?,?,?,?,?,?,?,?)";
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
pst.setString(9, type);
pst.setString(10, institute);
pst.setString(11, comp_year);



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
   public void update(){
            String sql="UPDATE ROOT.POSTGRADUATE_STUDENT SET (FIST_NAME = ?, LAST_NAME = ?, ADDRESS = ?, GENDER = ?, NIC = ?, EMAIL = ?, CONTACT_NUM = ?, QUALIFICATION_TYPE = ?, INSTITUTE = ?, YEAR_COMPLETION = ?) \n" +
"	WHERE STUDENT_ID = ? ";
try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1, fName);
pst.setString(2, lName);
pst.setString(3, address);
pst.setString(4, gender);
pst.setString(5, nic);
pst.setString(6, email);
pst.setString(7, String.valueOf(cNumber));
pst.setString(8, type);
pst.setString(9, institute);
pst.setString(10, comp_year);



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

   
   
    

