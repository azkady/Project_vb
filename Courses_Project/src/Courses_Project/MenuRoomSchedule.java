package Courses_Project;

public class MenuRoomSchedule extends javax.swing.JFrame {

    public MenuRoomSchedule() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddSchedule = new javax.swing.JButton();
        btnUpdateSchedule = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAddSchedule.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddSchedule.setText("Add Schedule");
        btnAddSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddScheduleActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddSchedule);
        btnAddSchedule.setBounds(130, 110, 290, 40);

        btnUpdateSchedule.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdateSchedule.setText("Update Schedule");
        btnUpdateSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateScheduleActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateSchedule);
        btnUpdateSchedule.setBounds(130, 170, 290, 40);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back to Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(130, 230, 290, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Room Schedule");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 30, 310, 44);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/Menu.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, -10, 620, 400);

        setSize(new java.awt.Dimension(568, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddScheduleActionPerformed
        this.setVisible(false);
        new AddRoomSchedule().setVisible(true);
    }//GEN-LAST:event_btnAddScheduleActionPerformed

    private void btnUpdateScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateScheduleActionPerformed
        this.setVisible(false);
        new SearchUpdateRoomSchedule().setVisible(true);
    }//GEN-LAST:event_btnUpdateScheduleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSchedule;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateSchedule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
