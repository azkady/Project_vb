package Courses_Project;

import Config.CClass;
import static Courses_Project.Koneksi.con;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchUpdateClass extends javax.swing.JFrame {

    
    Koneksi adaw = new Koneksi();
    private DefaultTableModel model;
    
    public SearchUpdateClass() {
        initComponents();
        jComboBox1.removeItem("Item 1");
        jComboBox1.removeItem("Item 2");
        jComboBox1.removeItem("Item 3");
        jComboBox1.removeItem("Item 4");
        jComboBox1.addItem("Student_Class");
        jComboBox1.addItem("Class_Name");
        
        adaw.Koneksi();
        
        showDataClass();
    }
    
    public int showDataClass(){
        int i = 0;
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Student_Class");
        model.addColumn("Class_Name");
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            String str = "SELECT * FROM class";
            PreparedStatement prps = con.prepareStatement(str);
            ResultSet rs = prps.executeQuery();
            while(rs.next()){
                Object[] obj = new Object[2];
                obj[0] = rs.getString("Student_Class"); 
                obj[1] = rs.getString("Class_Name");

                model.addRow(obj);
                
               
            }
            i = 1;
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(this, "Can't Show Table Class");
        }
        
        return i;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(50, 230, 190, 40);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(820, 430, 190, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Select And Update Data Class");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(650, 80, 540, 44);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(430, 230, 190, 40);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(700, 360, 190, 40);

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
        jScrollPane1.setBounds(50, 300, 570, 350);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Class Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(700, 250, 138, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Based Column");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 169, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Search Class");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 30, 270, 44);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Student Class");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(700, 190, 162, 29);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(50, 170, 190, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(930, 180, 210, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Kriteria");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 120, 89, 29);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(930, 240, 210, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(430, 170, 190, 40);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(950, 360, 190, 40);

        setSize(new java.awt.Dimension(1268, 747));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuClass().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Search();
    }//GEN-LAST:event_btnSearchActionPerformed


    
    public int Search (){
        int i = 0;
        
        try{
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
             String a = (String) jComboBox1.getSelectedItem();
             String b = jTextField1.getText();
            if(b.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update Or Delete");
            }else{
                String str = "SELECT * FROM class WHERE "+ a +" = '"+ b +"'";
                PreparedStatement ps = con.prepareStatement(str);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Object[] obj = new Object[2];
                    obj[0] = rs.getString("Student_Class"); 
                    obj[1] = rs.getString("Class_Name");

                    model.addRow(obj);
                  
                }
                i = 1 ;
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(this, "Can't Show Table Class");
        }
        
        return i;
    
    
    }


    
    
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jComboBox1.setSelectedItem("Student_Class");
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        CClass DC = new CClass();
        DC.setStudent_class(jTextField1.getText());
        int i = DC.Delete_Class();
        showDataClass();
        
//        try{
//            model.getDataVector().removeAllElements();
//            model.fireTableDataChanged();
//            String a = (String) jComboBox1.getSelectedItem();
//            String b = jTextField1.getText();
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria TO Search, Update Or Delete");
//            }else{
//                String str = "DELETE FROM class WHERE "+ a +" = '"+ b +"'";
//                PreparedStatement ps = con.prepareStatement(str);
//                int rs = ps.executeUpdate();
//                JOptionPane.showMessageDialog(this, "Delete Data Succses");
//            }
//        }catch(SQLException qwef){
//            JOptionPane.showMessageDialog(this, "Can't Show Table Class");
//        }
        
//        showDataClass();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        CClass UC = new CClass();
        UC.setCombo_column((String) jComboBox1.getSelectedItem());
        UC.setKriteria(jTextField1.getText());
        UC.setStudent_class(jTextField2.getText());
        UC.setClass_name(jTextField3.getText());
        int i = UC.Update_Class();
        showDataClass();
        
//        try{
//            model.getDataVector().removeAllElements();
//            model.fireTableDataChanged();
//            String a = (String) jComboBox1.getSelectedItem();
//            String b = jTextField1.getText();
//            String c = jTextField2.getText();
//            String d = jTextField3.getText();
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Serach, Update Or Delete");
//            }else{
//                if(c.equals("")|d.equals("")){
//                    JOptionPane.showMessageDialog(null, "Please Insert All Data");
//                }else{
//                    String str = "UPDATE class SET "
//                    + "Student_Class ='"+c+"',"
//                    + "Class_Name ='"+d+"'"
//                    + "WHERE "+ a +" = '"+ b +"'";
//                    PreparedStatement ps = con.prepareStatement(str);
//                    int rs = ps.executeUpdate();
//                    JOptionPane.showMessageDialog(this, "Update Data Succses");
//                }
//            }
//        }catch(SQLException qwef){
//            JOptionPane.showMessageDialog(this, "Failed Update Data Class");
//        }
//        
//        showDataClass();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jComboBox1.setSelectedItem("Student_Class");
        int tabelklik = jTable1.getSelectedRow();
        String Kriteria = jTable1.getValueAt(tabelklik, 0).toString();
        jTextField1.setText(Kriteria);
        jTextField2.setText(Kriteria);
        String Class = jTable1.getValueAt(tabelklik, 1).toString();
        jTextField3.setText(Class);
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
