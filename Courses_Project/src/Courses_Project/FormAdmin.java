package Courses_Project;

import Config.CClass;
import Config.Login;
import static Courses_Project.Koneksi.con;
import java.sql.*;
import javax.swing.JOptionPane;

public class FormAdmin extends javax.swing.JFrame {

    Koneksi adaw = new Koneksi();
    public Statement stat;
    public FormAdmin() {
        initComponents();
        adaw.Koneksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Sign in Administrator");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 280, 400, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 350, 160, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 390, 140, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(290, 350, 190, 30);

        btnSignIn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        btnSignIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSignInKeyPressed(evt);
            }
        });
        getContentPane().add(btnSignIn);
        btnSignIn.setBounds(220, 450, 160, 50);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(290, 390, 190, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/Admin.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 0, 260, 280);

        setSize(new java.awt.Dimension(618, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        Login Log = new Login();
        Log.setUsername(jTextField1.getText());
        Log.setPassword(jPasswordField1.getText());
        Log.Input_Login();
        this.setVisible(false);
    }//GEN-LAST:event_btnSignInActionPerformed

//    public int login(){
//        int i=0;   
//        if(jTextField1.getText().equals("")){
//            JOptionPane.showMessageDialog(this, "Please Insert Username");
//        }else{
//            if(jPasswordField1.getText().equals("")){
//                JOptionPane.showMessageDialog(this, "Please Insert Password");
//            }else{
//                try{   
//                    String a = jTextField1.getText();
//                    String b = jPasswordField1.getText();
//                    String ins = "SELECT * FROM admin WHERE Username ='"+ a +"' AND Password = '"+ b +"'";
//                    stat = con.createStatement();
//                    ResultSet res = stat.executeQuery(ins);
//                    if(res.next()){
//                        JOptionPane.showMessageDialog(this, "Login Succses");
//                        this.setVisible(false);
//                        new MainMenu().setVisible(true);
//                    }else{
//                        JOptionPane.showMessageDialog(this, "Username or Password Wrong");
//                    }
//                    i =1;
//                }catch(SQLException sqlex){
//                    JOptionPane.showMessageDialog(this, "SQL Syntax Error");
//                }
//            }
//        }
//        return i;
//    }
    
    private void btnSignInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSignInKeyPressed
//        if(jTextField1.getText().equals("")){
//            JOptionPane.showMessageDialog(this, "Please Insert Username");
//        }else{
//            if(jPasswordField1.getText().equals("")){
//                JOptionPane.showMessageDialog(this, "Please Insert Password");
//            }else{
//                try{   
//                    String a = jTextField1.getText();
//                    String b = jPasswordField1.getText();
//                    String ins = "SELECT * FROM admin WHERE Username ='"+ a +"' AND Password = '"+ b +"'";
//                    stat = con.createStatement();
//                    ResultSet res = stat.executeQuery(ins);
//                    if(res.next()){
//                        this.setVisible(false);
//                        new MainMenu().setVisible(true);
//                    }else{
//                        JOptionPane.showMessageDialog(this, "Username or Password Wrong");
//                    }
//                }catch(SQLException sqlex){
//                    JOptionPane.showMessageDialog(this, "SQL Syntax Error");
//                }
//            }
//        }
    }//GEN-LAST:event_btnSignInKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
