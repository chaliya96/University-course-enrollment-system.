package UIpackage;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import Driverclass.Assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Assignment_UI extends javax.swing.JFrame {
    
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    Connection connection2 = null;
    PreparedStatement pst2 = null;
    ResultSet result2 = null;
    String std_id ;
    String subject_id;

    /**
     * Creates new form Enrollment_UI
     */
    public Assignment_UI() {
        initComponents();

        view();
        view2();
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }
    
    
    

   public void view(){
             String sql="SELECT Student_id,Fist_Name,Last_name FROM ROOT.UNDERGRADUATE_STUDENT";
try{
connection = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm2","root","root");
pst=(PreparedStatement) connection.prepareStatement(sql);
result=pst.executeQuery();
if(result.next())
{
JOptionPane.showMessageDialog(null,"Logged In Successfully");
        jTable1.setModel(DbUtils.resultSetToTableModel(result));
 
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
   
      public void view2(){
          
             String sql="SELECT * FROM ROOT.SUBJECT";
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
        
        model.addElement(result2.getString("SUBJECT_NAME"));
        jList1.setModel(model);
        
        
        
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
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        marks = new javax.swing.JTextField();
        aNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jList1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(680, 180, 210, 280);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setAlignmentX(0.75F);
        jTable1.setAlignmentY(0.75F);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(18);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(130, 180, 452, 280);

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
        jButton5.setBounds(170, 670, 130, 40);

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

        jLabel2.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a Subject");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(680, 140, 420, 20);

        jLabel3.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Assignment Number ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 560, 180, 40);

        jLabel4.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select a Student ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 130, 420, 30);

        jLabel5.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marks");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 610, 190, 40);

        jLabel6.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Assignment Type ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 510, 180, 30);

        type.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General assignment", "Report ", "In-class assignment", "Lab assignment ", "Practical demonstration ", "Project" }));
        getContentPane().add(type);
        type.setBounds(400, 510, 160, 30);

        marks.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getContentPane().add(marks);
        marks.setBounds(410, 610, 150, 40);

        aNum.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        getContentPane().add(aNum);
        aNum.setBounds(410, 562, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Take home Assignment\\New folder\\nsbm\\assignment2.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Assignment assg = new Assignment(std_id,subject_id,type.getSelectedItem().toString(),Integer.parseInt(aNum.getText()),Integer.parseInt(marks.getText()));
        assg.save();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int r = jTable1.getSelectedRow();
       setStd_id (jTable1.getValueAt(r, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        setSubject_id  (jList1.getSelectedValue());

    }//GEN-LAST:event_jList1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ExaminationMenu und = new ExaminationMenu();
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
                new Assignment_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField marks;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
