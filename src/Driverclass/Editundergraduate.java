package Driverclass;

import UIpackage.Editundergraduate_UI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Editundergraduate {
    
        String std_id;
        String fname1;
        String lname ;
        String addr ;
        String gen ;
        String nic ;
        String email; 
        String cnum ;
        String stream;
        String disrank;
        String isrank;

    public Editundergraduate(String std_id, String fname1, String lname, String addr, String gen, String nic, String email, String cnum, String stream, String disrank, String isrank) {
        this.std_id = std_id;
        this.fname1 = fname1;
        this.lname = lname;
        this.addr = addr;
        this.gen = gen;
        this.nic = nic;
        this.email = email;
        this.cnum = cnum;
        this.stream = stream;
        this.isrank = isrank;
        this.disrank = disrank;
    }
        
        public void setvalus (){
            
        Editundergraduate_UI und = new Editundergraduate_UI();
        und.setVisible(true);
        und.setSize(1024,825);
        und.setext(std_id, fname1, lname, addr, gen, nic, email, cnum,stream,disrank,isrank);
        
            
        }
   
}
