package Courses_Project;

import Config.Student;
import static Courses_Project.Koneksi.con;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchUpdateStudent extends javax.swing.JFrame {

    Koneksi adaw = new Koneksi();
    private DefaultTableModel model;
    
    public SearchUpdateStudent() {
        initComponents();
        
        jComboBox1.removeItem("Item 1");
        jComboBox1.removeItem("Item 2");
        jComboBox1.removeItem("Item 3");
        jComboBox1.removeItem("Item 4");
        jComboBox1.addItem("Student_ID");
        jComboBox1.addItem("Student_Name");
        jComboBox1.addItem("Student_Class");
        jComboBox1.addItem("Student_Contact");
        
        adaw.Koneksi();
        
        showDataStudent();
    }
    
    private void showDataStudent(){
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Student_ID");
        model.addColumn("Student_Name");
        model.addColumn("Student_Class");
        model.addColumn("Student_Contact");
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            String str = "SELECT * FROM student";
            PreparedStatement prps = con.prepareStatement(str);
            ResultSet rs = prps.executeQuery();
            while(rs.next()){
                Object[] obj = new Object[4];
                obj[0] = rs.getString("Student_ID"); 
                obj[1] = rs.getString("Student_Name");
                obj[2] = rs.getString("Student_Class");
                obj[3] = rs.getString("Student_Contact");

                model.addRow(obj);
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(this, "Can't Show Table Student");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 350, 540, 308);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Based Column");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 150, 210, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Search Student");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 50, 280, 44);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(50, 210, 200, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Kriteria");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 150, 160, 29);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(390, 210, 200, 40);

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(50, 270, 200, 50);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(840, 580, 200, 50);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(390, 270, 200, 50);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(670, 510, 200, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Student Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(670, 250, 210, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Student Class");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(670, 320, 210, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Student Contact");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(670, 390, 230, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Student ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(670, 180, 190, 29);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(930, 170, 290, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(930, 240, 290, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(930, 310, 290, 40);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(930, 380, 290, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Select And Update Data Student");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(650, 90, 590, 44);

        btnUpdate1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate1.setText("Clear");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate1);
        btnUpdate1.setBounds(1010, 510, 200, 50);

        setSize(new java.awt.Dimension(1318, 747));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuStudent().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        jComboBox1.setSelectedItem("Student_ID");
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    public int Search (){
        int i = 0;
        
        try{
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            String a = (String) jComboBox1.getSelectedItem();
            String b = jTextField1.getText();
            if(b.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria to Search, Update Or Delete");
            }else{
                String str = "SELECT * FROM student WHERE "+ a +" = '"+ b +"'";
                PreparedStatement ps = con.prepareStatement(str);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Object[] obj = new Object[4];
                    obj[0] = rs.getString("Student_ID"); 
                    obj[1] = rs.getString("Student_Name");
                    obj[2] = rs.getString("Student_Class");
                    obj[3] = rs.getString("Student_Contact");

                    model.addRow(obj);

                }
                i = 1;
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(this, "Can't Show Table Student");
        }
        
        return i;
    
    
    }
    
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        Student DS = new Student();
        DS.setTable_column((String) jComboBox1.getSelectedItem());
        DS.setKriteria(jTextField1.getText());
        int i = DS.Delete_Student();
        showDataStudent();
        
//        try{
//            model.getDataVector().removeAllElements();
//            model.fireTableDataChanged();
//            String a = (String) jComboBox1.getSelectedItem();
//            String b = jTextField1.getText();
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria to Search, Update Or Delete");
//            }else{
//                String str = "DELETE FROM student WHERE "+ a +" = '"+ b +"'";
//                PreparedStatement ps = con.prepareStatement(str);
//                int rs = ps.executeUpdate();
//                JOptionPane.showMessageDialog(this, "Delete Data Succses");
//            }
//        }catch(SQLException qwef){
//            JOptionPane.showMessageDialog(this, "Can't Show Table Student");
//        }
//        
//        showDataStudent();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        Student US = new Student();
        US.setTable_column((String) jComboBox1.getSelectedItem());
        US.setKriteria(jTextField1.getText());
        US.setStudent_id(jTextField2.getText());
        US.setStudent_name(jTextField3.getText());
        US.setStudent_class(jTextField4.getText());
        US.setStudent_contact(jTextField5.getText());
        
        int i = US.Update_Student();
        showDataStudent();
        
//        try{
//            model.getDataVector().removeAllElements();
//            model.fireTableDataChanged();
//            String a = (String) jComboBox1.getSelectedItem();
//            String b = jTextField1.getText();
//            String c = jTextField2.getText();
//            String d = jTextField3.getText();
//            String e = jTextField4.getText();
//            String f = jTextField5.getText();
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update Or Delete");
//            }else{
//                if(c.equals("")|d.equals("")|e.equals("")|f.equals("")){
//                    JOptionPane.showMessageDialog(null, "Please Insert All Data");
//                }else{
//                    if(f.matches("[0-9]+")){
//                        String str = "UPDATE student SET "
//                                + "Student_ID ='"+c+"',"
//                                + "Student_Name ='"+d+"',"
//                                + "Student_Class ='"+e+"',"
//                                + "Student_Contact ='"+f+"'"
//                                + "WHERE "+ a +" = '"+ b +"'";
//                        PreparedStatement ps = con.prepareStatement(str);
//                        int rs = ps.executeUpdate();
//                        JOptionPane.showMessageDialog(this, "Update Data Succses");
//                    }else{
//                        JOptionPane.showMessageDialog(null, "Please Update Contact Correctly");
//                    }
//                }
//            }
//        }catch(SQLException qwef){
//            JOptionPane.showMessageDialog(this, "Failed Update Data Student");
//        }
//        
//        showDataStudent();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jComboBox1.setSelectedItem("Student_ID");
        int tabelklik = jTable1.getSelectedRow();
        String Kriteria = jTable1.getValueAt(tabelklik, 0).toString();
        jTextField1.setText(Kriteria);
        jTextField2.setText(Kriteria);
        String StudentName = jTable1.getValueAt(tabelklik, 1).toString();
        jTextField3.setText(StudentName);
        String StudentClass = jTable1.getValueAt(tabelklik, 2).toString();
        jTextField4.setText(StudentClass);
        String StudentContact = jTable1.getValueAt(tabelklik, 3).toString();
        jTextField5.setText(StudentContact);
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
