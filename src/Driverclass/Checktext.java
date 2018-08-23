package Driverclass;


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
public class Checktext {
    
    String[] check;

    public Checktext(String[] check) {
        this.check = check;
    }
    
    public boolean fill (){
    
        for (String check1 : check) {
            if (check1.equals("")) {
                JOptionPane.showMessageDialog(null,"Please fill all the fields");
                return false;
                
            }
        }
        return true;
    
    }
    
    
 
    
}
