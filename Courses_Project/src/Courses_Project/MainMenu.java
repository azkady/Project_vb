package Courses_Project;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblClass = new javax.swing.JLabel();
        lblStudent = new javax.swing.JLabel();
        lblTeacher = new javax.swing.JLabel();
        lblSchedule = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Application for The Courses Room Schedule");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 790, 44);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(350, 670, 200, 50);

        lblClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/Class.png"))); // NOI18N
        lblClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClassMouseClicked(evt);
            }
        });
        getContentPane().add(lblClass);
        lblClass.setBounds(160, 390, 260, 260);

        lblStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/Student.jpg"))); // NOI18N
        lblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStudentMouseClicked(evt);
            }
        });
        getContentPane().add(lblStudent);
        lblStudent.setBounds(480, 100, 260, 260);

        lblTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/Teacher.jpg"))); // NOI18N
        lblTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherMouseClicked(evt);
            }
        });
        getContentPane().add(lblTeacher);
        lblTeacher.setBounds(160, 100, 260, 260);

        lblSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/Schedule.jpg"))); // NOI18N
        lblSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblScheduleMouseClicked(evt);
            }
        });
        getContentPane().add(lblSchedule);
        lblSchedule.setBounds(480, 390, 260, 260);

        setSize(new java.awt.Dimension(918, 797));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void lblClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClassMouseClicked
        this.setVisible(false);
        new MenuClass().setVisible(true);
    }//GEN-LAST:event_lblClassMouseClicked

    private void lblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudentMouseClicked
        this.setVisible(false);
        new MenuStudent().setVisible(true);
    }//GEN-LAST:event_lblStudentMouseClicked

    private void lblTeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherMouseClicked
        this.setVisible(false);
        new MenuTeacher().setVisible(true);
    }//GEN-LAST:event_lblTeacherMouseClicked

    private void lblScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblScheduleMouseClicked
        this.setVisible(false);
        new MenuRoomSchedule().setVisible(true);
    }//GEN-LAST:event_lblScheduleMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblSchedule;
    private javax.swing.JLabel lblStudent;
    private javax.swing.JLabel lblTeacher;
    // End of variables declaration//GEN-END:variables
}
