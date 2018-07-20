package nsbm;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
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
public class Labassign {
    
    String sub_id ;
    String intake;
    String    lab;
    String day;
    String instructor_id;

  
  

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setInstructor_id(String instructor_id) {
        this.instructor_id = instructor_id;
    }
    
   
    
    
   
    public List checkLab(String s1, String s2){
        
                    
                       setLab(s1);
                       setDay(s2);
                    Connection connection2;
                    PreparedStatement pst2;
                    ResultSet result2;
                    String sql="SELECT TIME_SLOT FROM ROOT.LABS WHERE LAB_ID = ? AND LAB_DAY = ?";
                    List<String> labtime = new ArrayList<>(Arrays.asList("8.00AM - 10.00AM","10.00AM - 12.00PM","1.00PM - 3.00PM","3.00PM - 5.00AM"));
try{
connection2 = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
pst2=(PreparedStatement) connection2.prepareStatement(sql);
pst2.setString(1, s1);
pst2.setString(2, s2);
result2=pst2.executeQuery();

if(result2.next())
{
JOptionPane.showMessageDialog(null,"Logged In Successfully");
        

    do{
        
        if (labtime.contains(result2.getString("TIME_SLOT"))){
            labtime.remove(result2.getString("TIME_SLOT"));
        
        }
        
        
        
        
    }while((result2!=null) && (result2.next()));
    
    result2.close();
    return labtime;
 
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
    
    
    return labtime;
  
    }


public void save (String lab1, String day1,String timeslot, String subid, String insid,  String intake ){

String sql="INSERT INTO ROOT.LABS (LAB_ID, LAB_DAY, TIME_SLOT, SUBJECT_ID, INSTRUCTOR_ID, INTAKE) \n" +
"	VALUES (?, ?, ?, ?, ?, ?)";
try{
Connection connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
PreparedStatement pst=(PreparedStatement) connection.prepareStatement(sql);
pst.setString(1,lab1);
pst.setString(2, day1);
pst.setString(3, timeslot);
pst.setString(4,subid);
pst.setString(5,insid);
pst.setString(6,intake);



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



