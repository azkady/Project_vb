package Courses_Project;

import Config.CClass;
import static Courses_Project.Koneksi.con;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddClass extends javax.swing.JFrame {

//    Koneksi adaw = new Koneksi();
    public AddClass() {
        initComponents();
//        adaw.Koneksi();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddClass = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAddClass.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddClass.setText("Add Class");
        btnAddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClassActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddClass);
        btnAddClass.setBounds(220, 290, 190, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Class");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 60, 200, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Student Class");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 150, 162, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Class Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 200, 138, 29);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 150, 220, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 200, 220, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(410, 360, 130, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 360, 130, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/BackClass.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-230, -130, 1010, 630);

        setSize(new java.awt.Dimension(668, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuClass().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClassActionPerformed
        
        CClass IC = new CClass();
        IC.setStudent_class(jTextField1.getText());
        IC.setClass_name(jTextField2.getText());
        IC.Insert_Class();
        
//        String a = jTextField1.getText();
//        String b = jTextField2.getText();
//        if(a.equals("")){
//            JOptionPane.showMessageDialog(this, "Please Insert Student Class");
//        }else{
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(this, "Please Insert Class Name");
//            }else{
//                try{    
//                    String ins = "INSERT INTO class (Student_Class, Class_Name) VALUES (?,?)";
//                    PreparedStatement ps = con.prepareStatement(ins);
//                    ps.setString(1, a);
//                    ps.setString(2, b);
//                    int rt = ps.executeUpdate();
//                    JOptionPane.showMessageDialog(this, "Class Has Been Saved");
//                }catch(SQLException e){
//                    JOptionPane.showMessageDialog(this, "Failed To Saved Class");
//                }
//            }
//        }
    }//GEN-LAST:event_btnAddClassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText(null);
        jTextField2.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClass;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
