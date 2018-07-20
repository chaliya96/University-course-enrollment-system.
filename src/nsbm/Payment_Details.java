package nsbm;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
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
public class Payment_Details extends javax.swing.JFrame {
    
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    
    String std_id ;
    String year1;
    String sem1;

    public void setSemText(String semText) {
        this.semText.setText(semText);
    }

    public void setStdText(String stdText) {
        this.stdText.setText(stdText);
    }

    public void setYearText(String yearText) {
        this.yearText.setText(yearText); 
    }

    
    /**
     * Creates new form Enrollment_UI
     */
    public Payment_Details() {
        initComponents();

        
       
    }

    
  
    
    
    
    

 
   
    public void setTag(String sid,String s1,String s2,String s3){
    
        setStdText(s1);
        setSemText(s2);
        setYearText(s3);
        std_id = sid;
        year1 = s3;
        sem1  = s2;
        
    } 
      public void subFee(){
          Payment pay = new Payment(std_id,sem1,year1);
          pay.save();
          sub1Text.setText(pay.subName.get(0).toString());
          sub2Text.setText(pay.subName.get(1).toString());
          sub3Text.setText(pay.subName.get(2).toString());
          sub4Text.setText(pay.subName.get(3).toString());
          fee1Text.setText(pay.fees.get(0).toString());
          fee2Text.setText(pay.fees.get(1).toString());
          fee3Text.setText(pay.fees.get(2).toString());
          fee4Text.setText(pay.fees.get(3).toString());
          totText.setText(String.valueOf(pay.tot));
      }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        fee1Text = new javax.swing.JLabel();
        yearText = new javax.swing.JLabel();
        stdText = new javax.swing.JLabel();
        sub2Text = new javax.swing.JLabel();
        sub3Text = new javax.swing.JLabel();
        totText = new javax.swing.JLabel();
        semText = new javax.swing.JLabel();
        fee2Text = new javax.swing.JLabel();
        fee3Text = new javax.swing.JLabel();
        fee4Text = new javax.swing.JLabel();
        sub1Text = new javax.swing.JLabel();
        sub4Text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(740, 670, 140, 40);

        fee1Text.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        fee1Text.setForeground(new java.awt.Color(255, 255, 255));
        fee1Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fee1Text.setText("Select Semester ");
        getContentPane().add(fee1Text);
        fee1Text.setBounds(670, 350, 170, 50);

        yearText.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        yearText.setForeground(new java.awt.Color(255, 255, 255));
        yearText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearText.setText("Select Semester ");
        getContentPane().add(yearText);
        yearText.setBounds(540, 200, 170, 50);

        stdText.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        stdText.setForeground(new java.awt.Color(255, 255, 255));
        stdText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stdText.setText("Select Semester ");
        getContentPane().add(stdText);
        stdText.setBounds(310, 120, 400, 50);

        sub2Text.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        sub2Text.setForeground(new java.awt.Color(255, 255, 255));
        sub2Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub2Text.setText("Select Semester ");
        getContentPane().add(sub2Text);
        sub2Text.setBounds(150, 390, 170, 50);

        sub3Text.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        sub3Text.setForeground(new java.awt.Color(255, 255, 255));
        sub3Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub3Text.setText("Select Semester ");
        getContentPane().add(sub3Text);
        sub3Text.setBounds(150, 430, 170, 50);

        totText.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        totText.setForeground(new java.awt.Color(255, 255, 255));
        totText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totText.setText("Select Semester ");
        getContentPane().add(totText);
        totText.setBounds(670, 570, 170, 40);

        semText.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        semText.setForeground(new java.awt.Color(255, 255, 255));
        semText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semText.setText("Select Semester ");
        getContentPane().add(semText);
        semText.setBounds(310, 200, 170, 50);

        fee2Text.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        fee2Text.setForeground(new java.awt.Color(255, 255, 255));
        fee2Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fee2Text.setText("Select Semester ");
        getContentPane().add(fee2Text);
        fee2Text.setBounds(670, 390, 170, 50);

        fee3Text.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        fee3Text.setForeground(new java.awt.Color(255, 255, 255));
        fee3Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fee3Text.setText("Select Semester ");
        getContentPane().add(fee3Text);
        fee3Text.setBounds(670, 430, 170, 50);

        fee4Text.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        fee4Text.setForeground(new java.awt.Color(255, 255, 255));
        fee4Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fee4Text.setText("Select Semester ");
        getContentPane().add(fee4Text);
        fee4Text.setBounds(670, 470, 170, 50);

        sub1Text.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        sub1Text.setForeground(new java.awt.Color(255, 255, 255));
        sub1Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub1Text.setText("Select Semester ");
        getContentPane().add(sub1Text);
        sub1Text.setBounds(150, 350, 170, 50);

        sub4Text.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        sub4Text.setForeground(new java.awt.Color(255, 255, 255));
        sub4Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub4Text.setText("Select Semester ");
        getContentPane().add(sub4Text);
        sub4Text.setBounds(150, 470, 170, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Take home Assignment\\New folder\\nsbm\\payment details.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Enrollment_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enrollment_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enrollment_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enrollment_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fee1Text;
    private javax.swing.JLabel fee2Text;
    private javax.swing.JLabel fee3Text;
    private javax.swing.JLabel fee4Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel semText;
    private javax.swing.JLabel stdText;
    private javax.swing.JLabel sub1Text;
    private javax.swing.JLabel sub2Text;
    private javax.swing.JLabel sub3Text;
    private javax.swing.JLabel sub4Text;
    private javax.swing.JLabel totText;
    private javax.swing.JLabel yearText;
    // End of variables declaration//GEN-END:variables
}
