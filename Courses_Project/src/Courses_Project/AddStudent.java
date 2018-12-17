package Courses_Project;

import Config.CClass;
import Config.Student;
import static Courses_Project.Koneksi.con;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddStudent extends javax.swing.JFrame {

//    Koneksi adaw = new Koneksi();
    public AddStudent() {
        initComponents();
//        adaw.Koneksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAddStudent = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Add Student");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 70, 250, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 160, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 210, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Student Class");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 260, 190, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(320, 160, 230, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(320, 210, 230, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(320, 260, 230, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(390, 470, 150, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(320, 310, 230, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Student Contact");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 310, 210, 30);

        btnAddStudent.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddStudent);
        btnAddStudent.setBounds(220, 400, 210, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 470, 150, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/BakcStudent.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-110, -10, 910, 600);

        setSize(new java.awt.Dimension(668, 622));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuStudent().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        
        Student ISt = new Student();
        ISt.setStudent_id(jTextField1.getText());
        ISt.setStudent_name(jTextField2.getText());
        ISt.setStudent_class(jTextField3.getText());
        ISt.setStudent_contact(jTextField4.getText());
        ISt.Insert_Student();
        
        
        
//        String a = jTextField1.getText();
//        String b = jTextField2.getText();
//        String c = jTextField3.getText();
//        String d = jTextField4.getText();
//        if(a.equals("")){
//            JOptionPane.showMessageDialog(this, "Please Insert Student ID");
//        }else{
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(this, "Please Insert Student Name");
//            }else{
//                if(c.equals("")){
//                    JOptionPane.showMessageDialog(this, "Please Insert Student Class");
//                }else{
//                    if(d.equals("")){
//                        JOptionPane.showMessageDialog(this, "Please Insert Student Contact");
//                    }else{
//                        if(d.matches("[0-9]+")){
//                            try{    
//                                String ins = "INSERT INTO student (Student_ID, Student_Name, Student_Class,"
//                                            + " Student_Contact) VALUES (?,?,?,?)";
//                                PreparedStatement ps = con.prepareStatement(ins);
//                                ps.setString(1, ""+a);
//                                ps.setString(2, ""+b);
//                                ps.setString(3, ""+c);
//                                ps.setString(4, ""+d);
//                                int rt = ps.executeUpdate();
//                                JOptionPane.showMessageDialog(this, "Student Has Been Saved");
//                            }catch(SQLException e){
//                                JOptionPane.showMessageDialog(this, "Failed To Saved Student");
//                            }
//                        }else{
//                            JOptionPane.showMessageDialog(null, "Please Insert Contact Correctly");
//                        }
//                    }
//                }
//            }
//        }
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
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
