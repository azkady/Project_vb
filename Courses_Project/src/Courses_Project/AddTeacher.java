package Courses_Project;

import Config.Student;
import Config.Teacher;
import static Courses_Project.Koneksi.con;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddTeacher extends javax.swing.JFrame {

//    Koneksi adaw = new Koneksi();
    public AddTeacher() {
        initComponents();
//        adaw.Koneksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        btnAddTeacher = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(310, 220, 240, 30);

        btnAddTeacher.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddTeacher.setText("Add Teacher");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddTeacher);
        btnAddTeacher.setBounds(220, 360, 200, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Teacher");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 50, 230, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Teacher ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 120, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Teacher Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 170, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Teacher Lesson");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 220, 210, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(310, 120, 240, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(310, 170, 240, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(310, 270, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Teacher Contact");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 270, 220, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(380, 420, 130, 40);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(140, 420, 130, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/BackTeacher.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-360, -10, 1350, 1040);

        setSize(new java.awt.Dimension(668, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuTeacher().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        
        Teacher IT = new Teacher();
        IT.setTeacher_id(jTextField1.getText());
        IT.setTeacher_name(jTextField2.getText());
        IT.setTeacher_lesson(jTextField3.getText());
        IT.setTeacher_contact(jTextField4.getText());
        IT.Insert_Teacher();
        
//        String a = jTextField1.getText();
//        String b = jTextField2.getText();
//        String c = jTextField3.getText();
//        String d = jTextField4.getText();
//        if(a.equals("")){
//            JOptionPane.showMessageDialog(this, "Please Insert Teacher ID");
//        }else{
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(this, "Please Insert Teacher Name");
//            }else{
//                if(c.equals("")){
//                    JOptionPane.showMessageDialog(this, "Please Insert Teacher Lesson");
//                }else{
//                    if(d.equals("")){
//                        JOptionPane.showMessageDialog(this, "Please Insert Teacher Contact");
//                    }else{
//                        if(d.matches("[0-9]+")){
//                            try{    
//                                String ins = "INSERT INTO teacher (Teacher_ID, Teacher_Name, Teacher_Lesson,"
//                                        + " Teacher_Contact) VALUES (?,?,?,?)";
//                                PreparedStatement ps = con.prepareStatement(ins);
//                                ps.setString(1, ""+a);
//                                ps.setString(2, ""+b);
//                                ps.setString(3, ""+c);
//                                ps.setString(4, ""+d);
//                                int rt = ps.executeUpdate();
//                                JOptionPane.showMessageDialog(this, "Teacher Has Been Saved");
//                            }catch(SQLException e){
//                                JOptionPane.showMessageDialog(this, "Failed To Saved Teacher");
//                            }
//                        }else{
//                            JOptionPane.showMessageDialog(null, "Please Insert Contact Correctly");
//                        }
//                    }
//                }
//            }
//        }
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
