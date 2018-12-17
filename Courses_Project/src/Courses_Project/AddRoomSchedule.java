package Courses_Project;

import Config.CClass;
import Config.Schedule;
import static Courses_Project.Koneksi.con;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddRoomSchedule extends javax.swing.JFrame {

//    Koneksi adaw = new Koneksi();
    public AddRoomSchedule() {
        initComponents();
        jComboBox1.removeItem("Item 1");
        jComboBox1.removeItem("Item 2");
        jComboBox1.removeItem("Item 3");
        jComboBox1.removeItem("Item 4");
        jComboBox1.addItem("R01");
        jComboBox1.addItem("R02");
        jComboBox1.addItem("R03");
        jComboBox1.addItem("R04");
        jComboBox1.addItem("R05");
//        adaw.Koneksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddSchedule = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jTextFieldRoomSchedule = new javax.swing.JTextField();
        jTextFieldTeacherID = new javax.swing.JTextField();
        jTextFieldStudentClass = new javax.swing.JTextField();
        jTextFieldStartTime = new javax.swing.JTextField();
        jTextFieldEndTime = new javax.swing.JTextField();
        jTextFieldDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Student Class");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        AddSchedule.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AddSchedule.setText("Add Schedule");
        AddSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddScheduleActionPerformed(evt);
            }
        });
        getContentPane().add(AddSchedule);
        AddSchedule.setBounds(80, 460, 220, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Room Schedule");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 30, 390, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Room ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 150, 170, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Teacher ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 200, 180, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Student Class");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 250, 200, 29);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(340, 140, 260, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Start Time");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 300, 180, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("End Time");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 350, 170, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Date");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 400, 150, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Room Schedule");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 100, 210, 29);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(460, 460, 140, 40);

        jTextFieldRoomSchedule.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldRoomSchedule);
        jTextFieldRoomSchedule.setBounds(340, 90, 260, 40);

        jTextFieldTeacherID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldTeacherID);
        jTextFieldTeacherID.setBounds(340, 190, 260, 40);

        jTextFieldStudentClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldStudentClass);
        jTextFieldStudentClass.setBounds(340, 240, 260, 40);

        jTextFieldStartTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldStartTime);
        jTextFieldStartTime.setBounds(340, 290, 260, 40);

        jTextFieldEndTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldEndTime);
        jTextFieldEndTime.setBounds(340, 340, 260, 40);

        jTextFieldDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldDate);
        jTextFieldDate.setBounds(340, 390, 260, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 460, 140, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/BackSchedule.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-100, -70, 1050, 670);

        setSize(new java.awt.Dimension(718, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuRoomSchedule().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void AddScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddScheduleActionPerformed
        
        Schedule IS = new Schedule();
        IS.setRoom_schedule(jTextFieldRoomSchedule.getText());
        IS.setRoom_id(jComboBox1.getSelectedItem().toString());
        IS.setTeacher_id(jTextFieldTeacherID.getText());
        IS.setStudent_class(jTextFieldStudentClass.getText());
        IS.setStart_time(jTextFieldStartTime.getText());
        IS.setEnd_time(jTextFieldEndTime.getText());
        IS.setDate(jTextFieldDate.getText());
        IS.Insert_Schedule();
        
//        String a = jTextFieldRoomSchedule.getText();
//        String b = jComboBox1.getSelectedItem().toString();
//        String c = jTextFieldTeacherID.getText();
//        String d = jTextFieldStudentClass.getText();
//        String e = jTextFieldStartTime.getText();
//        String f = jTextFieldEndTime.getText();
//        String g = jTextFieldDate.getText();
//        if(a.equals("")){
//            JOptionPane.showMessageDialog(this, "Please Insert Room Schedule");
//        }else{
//            if(c.equals("")){
//              JOptionPane.showMessageDialog(this, "Please Insert Teacher ID");  
//            }else{
//                if(d.equals("")){
//                    JOptionPane.showMessageDialog(this, "Please Insert Student Class");
//                }else{
//                    if(e.equals("")){
//                        JOptionPane.showMessageDialog(this, "Please Insert Start Time");
//                    }else{
//                        if(f.equals("")){
//                            JOptionPane.showMessageDialog(this, "Please Insert End Time");
//                        }else{
//                            if(g.equals("")){
//                                JOptionPane.showMessageDialog(this, "Please Insert Date");
//                            }else{
//                                try{    
//                                    String ins = "INSERT INTO room_schedule (Room_Schedule, Room_ID, Teacher_ID, "
//                                            + "Student_Class, Start_Time, End_Time, Date) VALUES (?,?,?,?,?,?,?)";
//                                    PreparedStatement ps = con.prepareStatement(ins);
//                                    ps.setString(1, ""+a);
//                                    ps.setString(2, ""+b);
//                                    ps.setString(3, ""+c);
//                                    ps.setString(4, ""+d);
//                                    ps.setString(5, ""+e);
//                                    ps.setString(6, ""+f);
//                                    ps.setString(7, ""+g);
//                                    int rt = ps.executeUpdate();
//                                    JOptionPane.showMessageDialog(this, "Room Schedule Has Been Saved");
//                                }catch(SQLException sqlex){
//                                    JOptionPane.showMessageDialog(this, "Failed To Saved Room Schedule");
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
    }//GEN-LAST:event_AddScheduleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextFieldRoomSchedule.setText(null);
        jComboBox1.setSelectedItem("R01");
        jTextFieldTeacherID.setText(null);
        jTextFieldStudentClass.setText(null);
        jTextFieldStartTime.setText(null);
        jTextFieldEndTime.setText(null);
        jTextFieldDate.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSchedule;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldEndTime;
    private javax.swing.JTextField jTextFieldRoomSchedule;
    private javax.swing.JTextField jTextFieldStartTime;
    private javax.swing.JTextField jTextFieldStudentClass;
    private javax.swing.JTextField jTextFieldTeacherID;
    // End of variables declaration//GEN-END:variables
}
