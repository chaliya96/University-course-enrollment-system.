package nsbm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Student {
    
    
    int std_id ;
    String fName;
    String lName;
    String address;
    String gender;
    String nic;
    String email;
    int cNumber;

    public Student(int std_id, String fName, String lName, String address, String gender, String nic, String email, int cNumber) {
        this.std_id = std_id;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.gender = gender;
        this.nic = nic;
        this.email = email;
        this.cNumber = cNumber;
    }

    public int getStd_id() {
        return std_id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getNic() {
        return nic;
    }

    public String getEmail() {
        return email;
    }

    public int getcNumber() {
        return cNumber;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setcNumber(int cNumber) {
        this.cNumber = cNumber;
    }
    
    
   
    
}