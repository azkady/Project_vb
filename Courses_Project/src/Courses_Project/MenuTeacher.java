package Courses_Project;

public class MenuTeacher extends javax.swing.JFrame {

    public MenuTeacher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAddTeacher = new javax.swing.JButton();
        btnUpdateTeacher = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Teacher");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(214, 33, 180, 44);

        btnAddTeacher.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddTeacher.setText("Add Teacher");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddTeacher);
        btnAddTeacher.setBounds(150, 110, 260, 40);

        btnUpdateTeacher.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdateTeacher.setText("Update Teacher");
        btnUpdateTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTeacherActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateTeacher);
        btnUpdateTeacher.setBounds(150, 170, 260, 40);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back to Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(150, 230, 260, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/Menu.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, -10, 620, 390);

        setSize(new java.awt.Dimension(568, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        this.setVisible(false);
        new AddTeacher().setVisible(true);
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnUpdateTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTeacherActionPerformed
        this.setVisible(false);
        new SearchUpdateTeacher().setVisible(true);
    }//GEN-LAST:event_btnUpdateTeacherActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateTeacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
