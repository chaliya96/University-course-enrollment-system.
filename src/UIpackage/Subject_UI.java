package UIpackage;


import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Driverclass.Subject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Subject_UI extends javax.swing.JFrame {
    
    Connection connection2;
    PreparedStatement pst2;
    ResultSet result2;

    /**
     * Creates new form Subject_UI
     */
    public Subject_UI() {
        initComponents();
         course_id.setBackground(new Color(0,0,0,0));
        cName.setBackground(new Color(0,0,0,0));
        duration.setBackground(new Color(0,0,0,0));
        Climit.setBackground(new Color(0,0,0,0));
        view2();
    }
    
    public void setTag(String s1, String s2){
    
        
    
    }
    
      public void view2(){
          
             String sql="SELECT * FROM ROOT.COURSE";
try{
connection2 = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
pst2=(PreparedStatement) connection2.prepareStatement(sql);
result2=pst2.executeQuery();
DefaultListModel model = new DefaultListModel();
if(result2.next())
{
JOptionPane.showMessageDialog(null,"Logged In Successfully");
        int row = 0;

    while((result2!=null) && (result2.next())){
        
        course.addItem(result2.getString("COURSE_NAME"));
        
        
        
        
    }
    
    result2.close();
 
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        course_id = new javax.swing.JTextField();
        course = new javax.swing.JComboBox<>();
        Climit = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        cName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        faculty1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(180, 620, 160, 40);

        course_id.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        course_id.setForeground(new java.awt.Color(255, 255, 255));
        course_id.setBorder(null);
        getContentPane().add(course_id);
        course_id.setBounds(340, 140, 400, 30);

        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });
        getContentPane().add(course);
        course.setBounds(330, 510, 140, 30);

        Climit.setForeground(new java.awt.Color(255, 255, 255));
        Climit.setBorder(null);
        getContentPane().add(Climit);
        Climit.setBounds(340, 360, 140, 30);

        duration.setForeground(new java.awt.Color(255, 255, 255));
        duration.setBorder(null);
        getContentPane().add(duration);
        duration.setBounds(340, 290, 160, 30);

        cName.setForeground(new java.awt.Color(255, 255, 255));
        cName.setBorder(null);
        getContentPane().add(cName);
        cName.setBounds(340, 210, 400, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(700, 620, 150, 40);

        faculty1.setBackground(new java.awt.Color(0, 0, 0));
        faculty1.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        faculty1.setForeground(new java.awt.Color(255, 255, 255));
        faculty1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes " }));
        faculty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faculty1ActionPerformed(evt);
            }
        });
        getContentPane().add(faculty1);
        faculty1.setBounds(330, 440, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Take home Assignment\\New folder\\nsbm\\newsubject.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_courseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String subject_id = course_id.getText();
        String subname = cName.getText();
        String fee = duration.getText();
        String credits = Climit.getText();
        String compulsory = faculty1.getSelectedItem().toString();
        String c_id = course.getSelectedItem().toString();

        Subject subject1 = new Subject(subject_id,subname,fee,credits,compulsory,c_id);
       
        subject1.save();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void faculty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faculty1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faculty1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        CourseMenu und = new CourseMenu();
        und.setVisible(true);
        und.setSize(1044,825);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Subject_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subject_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subject_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subject_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subject_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Climit;
    private javax.swing.JTextField cName;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JTextField course_id;
    private javax.swing.JTextField duration;
    private javax.swing.JComboBox<String> faculty1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
