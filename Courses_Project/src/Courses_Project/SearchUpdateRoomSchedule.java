package Courses_Project;

import Config.Schedule;
import static Courses_Project.Koneksi.con;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchUpdateRoomSchedule extends javax.swing.JFrame {

    Koneksi adaw = new Koneksi();
    private DefaultTableModel model;
    
    public SearchUpdateRoomSchedule() {
        initComponents();
        
        jComboBox1.removeItem("Item 1");
        jComboBox1.removeItem("Item 2");
        jComboBox1.removeItem("Item 3");
        jComboBox1.removeItem("Item 4");
        jComboBox1.addItem("Room_Schedule");
        jComboBox1.addItem("Room_ID");
        jComboBox1.addItem("Teacher_ID");
        jComboBox1.addItem("Student_Class");
        jComboBox1.addItem("Start_Time");
        jComboBox1.addItem("End_Time");
        jComboBox1.addItem("Date");
        jComboBox0002.removeItem("Item 1");
        jComboBox0002.removeItem("Item 2");
        jComboBox0002.removeItem("Item 3");
        jComboBox0002.removeItem("Item 4");
        jComboBox0002.addItem("R01");
        jComboBox0002.addItem("R02");
        jComboBox0002.addItem("R03");
        jComboBox0002.addItem("R04");
        jComboBox0002.addItem("R05");
        
        adaw.Koneksi();
        
        ShowDataRoomSchedule();
    }
    
    private void ShowDataRoomSchedule(){
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Room_Schedule");
        model.addColumn("Room_ID");
        model.addColumn("Teacher_ID");
        model.addColumn("Student_Class");
        model.addColumn("Start_Time");
        model.addColumn("End_Time");
        model.addColumn("Date");
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            String str = "SELECT * FROM room_schedule";
            PreparedStatement prps = con.prepareStatement(str);
            ResultSet rs = prps.executeQuery();
            while(rs.next()){
                Object[] obj = new Object[7];
                obj[0] = rs.getString("Room_Schedule"); 
                obj[1] = rs.getString("Room_ID");
                obj[2] = rs.getString("Teacher_ID");
                obj[3] = rs.getString("Student_Class");
                obj[4] = rs.getString("Start_Time");
                obj[5] = rs.getString("End_Time");
                obj[6] = rs.getString("Date");

                model.addRow(obj);
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(this, "Can't Show Table Room Schedule");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jComboBox0002 = new javax.swing.JComboBox();
        tfStart = new javax.swing.JTextField();
        tfEnd = new javax.swing.JTextField();
        tfStudentClass = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        tfRS = new javax.swing.JTextField();
        tfTeacherID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Search Room Schedule");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 30, 430, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Based Column");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 130, 190, 29);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(50, 190, 190, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Kriteria");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 130, 140, 29);

        tfSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfSearch);
        tfSearch.setBounds(400, 190, 190, 40);

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(50, 260, 190, 50);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(830, 620, 190, 50);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(400, 260, 190, 50);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(650, 560, 190, 50);

        jComboBox0002.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox0002.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox0002);
        jComboBox0002.setBounds(930, 190, 270, 50);

        tfStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfStart);
        tfStart.setBounds(930, 370, 270, 50);

        tfEnd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfEnd);
        tfEnd.setBounds(930, 430, 270, 50);

        tfStudentClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfStudentClass);
        tfStudentClass.setBounds(930, 310, 270, 50);

        tfDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfDate);
        tfDate.setBounds(930, 490, 270, 50);

        tfRS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfRS);
        tfRS.setBounds(930, 130, 270, 50);

        tfTeacherID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tfTeacherID);
        tfTeacherID.setBounds(930, 250, 270, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Start Time");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(650, 380, 200, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("End Time");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(650, 440, 190, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Date");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(650, 500, 160, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Room ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(650, 200, 180, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Teacher ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(650, 260, 200, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Room Schedule");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(650, 140, 230, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Student Class");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(650, 320, 220, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("Select and Update Data Room Schedule");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(570, 80, 800, 29);

        btnUpdate1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate1.setText("Clear");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate1);
        btnUpdate1.setBounds(1010, 560, 190, 50);

        setSize(new java.awt.Dimension(1318, 747));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuRoomSchedule().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        jComboBox1.setSelectedItem("Student_ID");
        jComboBox0002.setSelectedItem("R01");
        tfSearch.setText(null);
        tfTeacherID.setText(null);
        tfStudentClass.setText(null);
        tfStart.setText(null);
        tfStart.setText(null);
        tfEnd.setText(null);
        tfDate.setText(null);
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    
    public int Search(){
    int i = 0;
    try{
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            String a = (String) jComboBox1.getSelectedItem();
            String b = tfSearch.getText();
            if(b.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update or Delete");
            }else{
                String str = "SELECT * FROM room_schedule WHERE "+ a +" = '"+ b +"'";
                PreparedStatement ps = con.prepareStatement(str);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                Object[] obj = new Object[7];
                obj[0] = rs.getString("Room_Schedule"); 
                obj[1] = rs.getString("Room_ID");
                obj[2] = rs.getString("Teacher_ID");
                obj[3] = rs.getString("Student_Class");
                obj[4] = rs.getString("Start_Time");
                obj[5] = rs.getString("End_Time");
                obj[6] = rs.getString("Date");

                model.addRow(obj);

                
                }
                i = 1;
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(this, "Can't Show Table Room Schedule");
        }
        
        return i;
}
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Schedule DS = new Schedule();
        DS.setTable_column((String) jComboBox1.getSelectedItem());
        DS.setKriteria(tfSearch.getText());
        int i = DS.Delete_Schedule();
        ShowDataRoomSchedule();
        
//        try{
//            model.getDataVector().removeAllElements();
//            model.fireTableDataChanged();
//            String a = (String) jComboBox1.getSelectedItem();
//            String b = tfSearch.getText();
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update or Delete");
//            }else{
//                String str = "DELETE FROM room_schedule WHERE "+ a +" = '"+ b +"'";
//                PreparedStatement ps = con.prepareStatement(str);
//                int rs = ps.executeUpdate();
//                JOptionPane.showMessageDialog(this, "Delete Data Succses");
//            }
//        }catch(SQLException qwef){
//            JOptionPane.showMessageDialog(this, "Can't Show Table Room Schedule");
//        }
//        
//        ShowDataRoomSchedule();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Schedule US = new Schedule();
        US.setTable_column((String) jComboBox1.getSelectedItem());
        US.setKriteria(tfSearch.getText());
        US.setRoom_schedule(tfRS.getText());
        US.setTeacher_id(tfTeacherID.getText());
        US.setStudent_class(tfStudentClass.getText());
        US.setStart_time(tfStart.getText());
        US.setEnd_time(tfEnd.getText());
        US.setDate(tfDate.getText());
        US.setRoom_id((String) jComboBox0002.getSelectedItem());
        int i = US.Update_Schedule();
        ShowDataRoomSchedule();
        
//        try{
//            model.getDataVector().removeAllElements();
//            model.fireTableDataChanged();
//            String a = (String) jComboBox1.getSelectedItem();
//            String b = tfSearch.getText();
//            String c = tfRS.getText();
//            String d = tfTeacherID.getText();
//            String e = tfStudentClass.getText();
//            String f = tfStart.getText();
//            String g = tfEnd.getText();
//            String h = tfDate.getText();
//            String i = (String) jComboBox0002.getSelectedItem();
//            if(b.equals("")){
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update or Delete");
//            }else{
//                if(c.equals("")|d.equals("")|e.equals("")|f.equals("")|g.equals("")|h.equals("")){
//                    JOptionPane.showMessageDialog(null, "Please Insert All Data");
//                }else{
//                    String str = "UPDATE room_schedule SET "
//                    + "Room_Schedule ='"+c+"',"
//                    + "Room_ID ='"+i+"',"
//                    + "Teacher_ID ='"+d+"',"
//                    + "Student_Class ='"+e+"',"
//                    + "Start_Time ='"+f+"',"
//                    + "End_Time ='"+g+"',"
//                    + "Date ='"+h+"'"
//                    + "WHERE "+ a +" = '"+ b +"'";
//                    PreparedStatement ps = con.prepareStatement(str);
//                    int rs = ps.executeUpdate();
//                    JOptionPane.showMessageDialog(this, "Update Data Succses");
//                }
//            }
//        }catch(SQLException qwef){
//            JOptionPane.showMessageDialog(this, "Failed Update Data Room Schedule");
//        }
//        
//        ShowDataRoomSchedule();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int tabelklik = jTable1.getSelectedRow();
        jComboBox1.setSelectedItem("Room_Schedule");
        String Kriteria = jTable1.getValueAt(tabelklik, 0).toString();
        tfSearch.setText(Kriteria);
        tfRS.setText(Kriteria);
        String StudentName = jTable1.getValueAt(tabelklik, 1).toString();
        jComboBox0002.setSelectedItem(StudentName);
        String StudentClass = jTable1.getValueAt(tabelklik, 2).toString();
        tfTeacherID.setText(StudentClass);
        String StudentContact = jTable1.getValueAt(tabelklik, 3).toString();
        tfStudentClass.setText(StudentContact);
        String asd = jTable1.getValueAt(tabelklik, 4).toString();
        tfStart.setText(asd);
        String Endss = jTable1.getValueAt(tabelklik, 5).toString();
        tfEnd.setText(Endss);
        String Datess = jTable1.getValueAt(tabelklik, 6).toString();
        tfDate.setText(Datess);
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JComboBox jComboBox0002;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfEnd;
    private javax.swing.JTextField tfRS;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfStart;
    private javax.swing.JTextField tfStudentClass;
    private javax.swing.JTextField tfTeacherID;
    // End of variables declaration//GEN-END:variables
}
