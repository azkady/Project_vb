package Courses_Project;

public class MenuClass extends javax.swing.JFrame {

    public MenuClass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAddClass = new javax.swing.JButton();
        btnUpdateClass = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Class");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(228, 33, 170, 44);

        btnAddClass.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddClass.setText("Add Class");
        btnAddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClassActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddClass);
        btnAddClass.setBounds(160, 110, 240, 50);

        btnUpdateClass.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdateClass.setText("Update Class");
        btnUpdateClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateClassActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateClass);
        btnUpdateClass.setBounds(160, 180, 240, 50);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back to Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(160, 250, 240, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Courses_Project/Menu.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 0, 680, 380);

        setSize(new java.awt.Dimension(568, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClassActionPerformed
        this.setVisible(false);
        new AddClass().setVisible(true);
    }//GEN-LAST:event_btnAddClassActionPerformed

    private void btnUpdateClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateClassActionPerformed
        this.setVisible(false);
        new SearchUpdateClass().setVisible(true);
    }//GEN-LAST:event_btnUpdateClassActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClass;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
