package nsbm;


import java.awt.Color;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Postgraduate_UI1 extends javax.swing.JFrame {

    /**
     * Creates new form Undergraduate_UI
     */
    public Postgraduate_UI1() {
        initComponents();
        stdId.setBackground(new Color(0,0,0,0));
        fname.setBackground(new Color(0,0,0,0));
        lname.setBackground(new Color(0,0,0,0));
        addr.setBackground(new Color(0,0,0,0));
      
        
        email.setBackground(new Color(0,0,0,0));
        type.setBackground(new Color(0,0,0,0));
        year.setBackground(new Color(0,0,0,0));
    
        nic.setBackground(new Color(0,0,0,0));
    
        addr1.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        gen = new javax.swing.JComboBox<>();
        fname = new javax.swing.JTextField();
        stdId = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        addr1 = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        addr = new javax.swing.JTextField();
        cnum = new javax.swing.JTextField();
        institute = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lname.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setBorder(null);
        getContentPane().add(lname);
        lname.setBounds(320, 220, 400, 20);

        email.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(null);
        getContentPane().add(email);
        email.setBounds(320, 370, 400, 19);

        gen.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(gen);
        gen.setBounds(320, 330, 90, 30);

        fname.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setBorder(null);
        getContentPane().add(fname);
        fname.setBounds(320, 180, 400, 20);

        stdId.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        stdId.setForeground(new java.awt.Color(255, 255, 255));
        stdId.setBorder(null);
        stdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdIdActionPerformed(evt);
            }
        });
        getContentPane().add(stdId);
        stdId.setBounds(320, 141, 390, 19);

        nic.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        nic.setForeground(new java.awt.Color(255, 255, 255));
        nic.setBorder(null);
        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });
        getContentPane().add(nic);
        nic.setBounds(320, 410, 210, 20);

        addr1.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        addr1.setForeground(new java.awt.Color(255, 255, 255));
        addr1.setBorder(null);
        addr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addr1ActionPerformed(evt);
            }
        });
        addr1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addr1KeyTyped(evt);
            }
        });
        getContentPane().add(addr1);
        addr1.setBounds(320, 260, 390, 30);

        type.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setBorder(null);
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type);
        type.setBounds(370, 480, 310, 20);

        year.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setBorder(null);
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(370, 560, 150, 20);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(770, 690, 130, 30);

        addr.setForeground(new java.awt.Color(255, 255, 255));
        addr.setBorder(null);
        addr.setOpaque(false);
        getContentPane().add(addr);
        addr.setBounds(320, 260, 400, 30);

        cnum.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        cnum.setForeground(new java.awt.Color(255, 255, 255));
        cnum.setBorder(null);
        cnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnumActionPerformed(evt);
            }
        });
        cnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnumKeyTyped(evt);
            }
        });
        getContentPane().add(cnum);
        cnum.setBounds(720, 410, 210, 20);

        institute.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        institute.setForeground(new java.awt.Color(255, 255, 255));
        institute.setBorder(null);
        institute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instituteActionPerformed(evt);
            }
        });
        getContentPane().add(institute);
        institute.setBounds(370, 520, 310, 20);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(210, 690, 130, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Take home Assignment\\New folder\\nsbm\\post graduation copy.png")); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(1024, 775));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1024, 775);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String stdId1 = stdId.getText();
        String fname1 = fname.getText();
        String lname1 = lname.getText();
        String addr11 = addr1.getText();
        String email1 = email.getText();
        String gender = gen.getSelectedItem().toString();
        String nic1 = nic.getText();
        String cnum1 = cnum.getText();
        String type1 = type.getText();
        String institute1 = institute.getText();
        String year1 = year.getText();
        
        String[] check = {stdId1,fname1,lname1,addr11,gender,nic1,email1,cnum1,type1,institute1,year1};
        
        Checktext page = new Checktext(check);
        
        if (page.fill()){
        
        Postgraduate student1 = new Postgraduate(Integer.parseInt(stdId1),fname1,lname1,addr11,gender,nic1,email1,Integer.parseInt(cnum1),type1,institute1,year1);
        student1.save();
        
        }

        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void  setext(String std_id4, String fname4, String lname4, String addr4, String gen4, String nic4, String email4, String cnum4){
        stdId.setText(std_id4);
        fname.setText(fname4);
        lname.setText(lname4);
        addr.setText(addr4);
        email.setText(email4);
        gen.setSelectedItem(gen4);
        nic.setText(nic4);
        addr1.setText(cnum4);

    }
    private void addr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addr1ActionPerformed

    private void addr1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addr1KeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE)){
        evt.consume();
    }        
    }//GEN-LAST:event_addr1KeyTyped

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void cnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnumActionPerformed

    private void cnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnumKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cnumKeyTyped

    private void instituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instituteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instituteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Studentmenu und = new Studentmenu();
        und.setVisible(true);
        und.setSize(1044,825);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Undergraduate_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Undergraduate_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Undergraduate_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Undergraduate_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Postgraduate_UI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addr;
    private javax.swing.JTextField addr1;
    private javax.swing.JTextField cnum;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JTextField institute;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField stdId;
    private javax.swing.JTextField type;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
