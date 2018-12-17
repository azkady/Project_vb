package Courses_Project;



import Config.Teacher;
import static Courses_Project.Koneksi.con;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchUpdateTeacher extends javax.swing.JFrame {

    Koneksi adaw = new Koneksi();
    private DefaultTableModel model;
    
    public SearchUpdateTeacher() {
        initComponents();
        
        jComboBox1.removeItem("Item 1");
        jComboBox1.removeItem("Item 2");
        jComboBox1.removeItem("Item 3");
        jComboBox1.removeItem("Item 4");
        jComboBox1.addItem("Teacher_ID");
        jComboBox1.addItem("Teacher_Name");
        jComboBox1.addItem("Teacher_Lesson");
        jComboBox1.addItem("Teacher_Contact");

        adaw.Koneksi();
        
        showDataTeacher();
    }  
    
    private void showDataTeacher(){
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Teacher_ID");
        model.addColumn("Teacher_Name");
        model.addColumn("Teacher_Lesson");
        model.addColumn("Teacher_Contact");
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            String str = "SELECT * FROM teacher";
            PreparedStatement prps = con.prepareStatement(str);
            ResultSet rs = prps.executeQuery();
            while(rs.next()){
                Object[] obj = new Object[4];
                obj[0] = rs.getString("Teacher_ID"); 
                obj[1] = rs.getString("Teacher_Name");
                obj[2] = rs.getString("Teacher_Lesson");
                obj[3] = rs.getString("Teacher_Contact");

                model.addRow(obj);
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(this, "Can't Show Table Teacher");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Search Teacher");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 50, 280, 44);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(50, 190, 220, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Kriteria");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 140, 150, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(370, 190, 220, 40);

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(50, 260, 220, 50);

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
        jScrollPane1.setBounds(50, 330, 540, 308);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Based Column");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 140, 200, 30);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(830, 590, 220, 50);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(370, 260, 220, 50);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(660, 520, 220, 50);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(950, 310, 270, 50);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(950, 170, 270, 50);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(950, 240, 270, 50);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(950, 380, 270, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Teacher Contact");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(660, 390, 195, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Teacher ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(660, 180, 132, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Teacher Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(660, 250, 172, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Teacher Lesson");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(660, 320, 184, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Select and Update Data Teacher");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(660, 90, 590, 44);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(990, 520, 220, 50);

        setSize(new java.awt.Dimension(1318, 747));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuTeacher().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jComboBox1.setSelectedItem("Teacher_ID");
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField4.setText(null);
        jTextField3.setText(null);
        jTextField5.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    
    
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
                String str = "SELECT * FROM teacher WHERE "+ a +" = '"+ b +"'";
                PreparedStatement ps = con.prepareStatement(str);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Object[] obj = new Object[4];
                    obj[0] = rs.getString("Teacher_ID"); 
                    obj[1] = rs.getString("Teacher_Name");
                    obj[2] = rs.getString("Teacher_Lesson");
                    obj[3] = rs.getString("Teacher_Contact");

                    model.addRow(obj);

                }
                i = 1;
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(this, "Can't Show Table Teacher");
        }
        
        return i;
    
    
    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

 Search();
            
//        try{
//            model.getDataVector().removeAllElements();
//            model.fireTableDataChanged();
//            String a = (String) jComboBox1.getSelectedItem();
//            String b = jTextField1.getText();
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update Or Delete");
//            }else{
//                String str = "SELECT * FROM teacher WHERE "+ a +" = '"+ b +"'";
//                PreparedStatement ps = con.prepareStatement(str);
//                ResultSet rs = ps.executeQuery();
//                while(rs.next()){
//                    Object[] obj = new Object[4];
//                    obj[0] = rs.getString("Teacher_ID"); 
//                    obj[1] = rs.getString("Teacher_Name");
//                    obj[2] = rs.getString("Teacher_Lesson");
//                    obj[3] = rs.getString("Teacher_Contact");
//
//                    model.addRow(obj);
//                }
//            }    
//        }catch(SQLException qwef){
//            JOptionPane.showMessageDialog(this, "Can't Show Table Teacher");
//        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      Teacher UT = new Teacher();
        UT.setCombo_column((String) jComboBox1.getSelectedItem());
        UT.setKriteria(jTextField1.getText());
        UT.setTeacher_id(jTextField2.getText());
        UT.setTeacher_name(jTextField3.getText());
        UT.setTeacher_lesson(jTextField4.getText());
        UT.setTeacher_contact(jTextField5.getText());
        
        int i = UT.Update_Teacher();
        showDataTeacher();
        
        
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
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update Or Delate");
//            }else{
//                if(c.equals("")|d.equals("")|e.equals("")|f.equals("")){
//                    JOptionPane.showMessageDialog(null, "Please Insert All Data");
//                }else{
//                    if(f.matches("[0-9]+")){
//                        String str = "UPDATE teacher SET "
//                                + "Teacher_ID ='"+c+"',"
//                                + "Teacher_Name ='"+d+"',"
//                                + "Teacher_Lesson ='"+e+"',"
//                                + "Teacher_Contact ='"+f+"'"
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
//            JOptionPane.showMessageDialog(this, "Failed Update Data Teacher");
//        }
//        
//        showDataTeacher();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
         
        Teacher DC = new Teacher();
        DC.setTeacher_id(jTextField1.getText());
        int i = DC.Delete_Teacher();
        showDataTeacher();
//        try{
//            model.getDataVector().removeAllElements();
//            model.fireTableDataChanged();
//            String a = (String) jComboBox1.getSelectedItem();
//            String b = jTextField1.getText();
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update Or Delete");
//            }else{
//                String str = "DELETE FROM teacher WHERE "+ a +" = '"+ b +"'";
//                PreparedStatement ps = con.prepareStatement(str);
//                int rs = ps.executeUpdate();
//                JOptionPane.showMessageDialog(this, "Delete Data Succses");
//            }
//        }catch(SQLException qwef){
//            JOptionPane.showMessageDialog(this, "Can't Show Table Teacher");
//        }
//        
//        showDataTeacher();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jComboBox1.setSelectedItem("Teacher_ID");
        int tabelklik = jTable1.getSelectedRow();
        String Kriteria = jTable1.getValueAt(tabelklik, 0).toString();
        jTextField1.setText(Kriteria);
        jTextField2.setText(Kriteria);
        String TeacherName = jTable1.getValueAt(tabelklik, 1).toString();
        jTextField3.setText(TeacherName);
        String TeacherClass = jTable1.getValueAt(tabelklik, 2).toString();
        jTextField4.setText(TeacherClass);
        String TeacherContact = jTable1.getValueAt(tabelklik, 3).toString();
        jTextField5.setText(TeacherContact);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
