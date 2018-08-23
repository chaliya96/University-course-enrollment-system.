package Driverclass;

import UIpackage.Editpostgraduate_ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Editpostgraduate1 {
    
        String std_id;
        String fname1;
        String lname ;
        String addr ;
        String gen ;
        String nic ;
        String email; 
        String cnum ;
        String type;
        String institute;
        String cyear;

    public Editpostgraduate1(String std_id, String fname1, String lname, String addr, String gen, String nic, String email, String cnum, String type, String institute, String cyear) {
        this.std_id = std_id;
        this.fname1 = fname1;
        this.lname = lname;
        this.addr = addr;
        this.gen = gen;
        this.nic = nic;
        this.email = email;
        this.cnum = cnum;
        this.type = type;
        this.institute = institute;
        this.cyear = cyear;
    }
        
        public void setvalus (){
            
        Editpostgraduate_ui und = new Editpostgraduate_ui();
        und.setVisible(true);
        und.setSize(1024,825);
        und.setext(std_id, fname1, lname, addr, gen, nic, email, cnum,type,institute,cyear);
        
            
        }
   
}
