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
public class Editundergraduate_UI extends javax.swing.JFrame {

    /**
     * Creates new form Undergraduate_UI
     */
    public Editundergraduate_UI() {
        initComponents();
        stdId.setBackground(new Color(0,0,0,0));
        fname.setBackground(new Color(0,0,0,0));
        lname.setBackground(new Color(0,0,0,0));
        addr.setBackground(new Color(0,0,0,0));
        alstream.setBackground(new Color(0,0,0,0));
        disrank.setBackground(new Color(0,0,0,0));
        email.setBackground(new Color(0,0,0,0));
        sub1.setBackground(new Color(0,0,0,0));
        sub2.setBackground(new Color(0,0,0,0));
        sub3.setBackground(new Color(0,0,0,0));
        nic.setBackground(new Color(0,0,0,0));
        isrank.setBackground(new Color(0,0,0,0));
        cnum.setBackground(new Color(0,0,0,0));
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
        isrank = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        gen = new javax.swing.JComboBox<>();
        fname = new javax.swing.JTextField();
        stdId = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        cnum = new javax.swing.JTextField();
        grade3 = new javax.swing.JComboBox<>();
        grade2 = new javax.swing.JComboBox<>();
        grade1 = new javax.swing.JComboBox<>();
        sub1 = new javax.swing.JTextField();
        alstream = new javax.swing.JTextField();
        disrank = new javax.swing.JTextField();
        sub3 = new javax.swing.JTextField();
        sub2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        addr = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lname.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setBorder(null);
        getContentPane().add(lname);
        lname.setBounds(320, 220, 400, 20);

        isrank.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        isrank.setForeground(new java.awt.Color(255, 255, 255));
        isrank.setBorder(null);
        isrank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isrankActionPerformed(evt);
            }
        });
        getContentPane().add(isrank);
        isrank.setBounds(530, 660, 150, 30);

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
        stdId.setBounds(320, 141, 210, 19);

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
        cnum.setBounds(720, 400, 210, 40);

        grade3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Pass", "B Pass", "C Pass", "S Pass" }));
        grade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade3ActionPerformed(evt);
            }
        });
        getContentPane().add(grade3);
        grade3.setBounds(530, 580, 140, 22);

        grade2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Pass", "B Pass", "C Pass", "S Pass" }));
        getContentPane().add(grade2);
        grade2.setBounds(530, 550, 140, 22);

        grade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Pass", "B Pass", "C Pass", "S Pass" }));
        getContentPane().add(grade1);
        grade1.setBounds(530, 510, 140, 22);

        sub1.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        sub1.setForeground(new java.awt.Color(255, 255, 255));
        sub1.setBorder(null);
        getContentPane().add(sub1);
        sub1.setBounds(350, 510, 150, 20);

        alstream.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        alstream.setForeground(new java.awt.Color(255, 255, 255));
        alstream.setBorder(null);
        alstream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alstreamActionPerformed(evt);
            }
        });
        getContentPane().add(alstream);
        alstream.setBounds(320, 440, 210, 30);

        disrank.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        disrank.setForeground(new java.awt.Color(255, 255, 255));
        disrank.setBorder(null);
        getContentPane().add(disrank);
        disrank.setBounds(350, 660, 150, 30);

        sub3.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        sub3.setForeground(new java.awt.Color(255, 255, 255));
        sub3.setBorder(null);
        getContentPane().add(sub3);
        sub3.setBounds(350, 580, 150, 20);

        sub2.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        sub2.setForeground(new java.awt.Color(255, 255, 255));
        sub2.setBorder(null);
        sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub2ActionPerformed(evt);
            }
        });
        getContentPane().add(sub2);
        sub2.setBounds(350, 540, 150, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(770, 690, 130, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 690, 130, 30);

        addr.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        addr.setForeground(new java.awt.Color(255, 255, 255));
        addr.setBorder(null);
        getContentPane().add(addr);
        addr.setBounds(320, 260, 400, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Take home Assignment\\New folder\\nsbm\\under_stdreg.png")); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(1024, 775));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1024, 775);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          Studentmenu und = new Studentmenu();
        und.setVisible(true);
        und.setSize(1044,825);
        this.dispose();
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String stdId1 = stdId.getText();
        String fname1 = fname.getText();
        String lname1 = lname.getText();
        String addr1 = addr.getText();
        String email1 = email.getText();
        String gender = gen.getSelectedItem().toString();
        String nic1 = nic.getText();
        String cnum1 = cnum.getText();
        String alsteam1 = alstream.getText();
        String sub_1 = sub1.getText();
        String sub_2 = sub2.getText();
        String sub_3 = sub3.getText();
        String grade_1 = grade1.getSelectedItem().toString();
        String grade_2 = grade2.getSelectedItem().toString();
        String grade_3 = grade3.getSelectedItem().toString();
        String disrank1 = disrank.getText();
        String isrank1 = isrank.getText();
        
        String[] check = {stdId1,fname1,lname1,addr1,email1,gender,nic1,cnum1,alsteam1,sub_1,sub_2,sub_3,grade_1,grade_2,grade_3,disrank1,isrank1}; 
        
        Checktext page = new Checktext(check);
        
        if (page.fill()){
        
        
        Undergraduate student1 = new Undergraduate(Integer.parseInt(stdId1),fname1,lname1,addr1,gender,nic1,email1,Integer.parseInt(cnum1),alsteam1,disrank1,isrank1);
        student1.update();
        //student1.addSubject(sub_1, sub_2, sub_3, grade_1,grade_2,grade_3);
        
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void  setext(String std_id4, String fname4, String lname4, String addr4, String gen4, String nic4, String email4, String cnum4,String stream,String disrank1,String isrank1){
        stdId.setText(std_id4);
        fname.setText(fname4);
        lname.setText(lname4);
        addr.setText(addr4);
        email.setText(email4);
        gen.setSelectedItem(gen4);
        nic.setText(nic4);
        cnum.setText(cnum4);
        alstream.setText(stream);
        disrank.setText(disrank1);
        isrank.setText(isrank1);
        

    }
    private void grade3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grade3ActionPerformed

    private void cnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnumActionPerformed

    private void cnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnumKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE)){
        evt.consume();
    }        
    }//GEN-LAST:event_cnumKeyTyped

    private void alstreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alstreamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alstreamActionPerformed

    private void sub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub2ActionPerformed

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void isrankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isrankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isrankActionPerformed

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
                new Undergraduate_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addr;
    private javax.swing.JTextField alstream;
    private javax.swing.JTextField cnum;
    private javax.swing.JTextField disrank;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JComboBox<String> grade1;
    private javax.swing.JComboBox<String> grade2;
    private javax.swing.JComboBox<String> grade3;
    private javax.swing.JTextField isrank;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField stdId;
    private javax.swing.JTextField sub1;
    private javax.swing.JTextField sub2;
    private javax.swing.JTextField sub3;
    // End of variables declaration//GEN-END:variables
}
