/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpst.yc.client.ui;

/**
 *
 * @author Pavan Poudel
 */
public class AddTime extends javax.swing.JFrame {

    /**
     * Creates new form AddTime
     */
    public AddTime() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        spin_addtime = new javax.swing.JSpinner();
        lbl_user = new javax.swing.JLabel();
        btn_ten = new javax.swing.JButton();
        btn_twenty = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_sixty = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lbl_prepaid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_currBalance = new javax.swing.JLabel();
        btn_thirty = new javax.swing.JButton();
        btn_ok = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_time = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setTitle("Add Time");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(395, 410));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 310, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pre-paid:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 370, 10));

        spin_addtime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        spin_addtime.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(5)));
        getContentPane().add(spin_addtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, -1));

        lbl_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_user.setText("User");
        getContentPane().add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_ten.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_ten.setText("+ 10 mins.");
        btn_ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        btn_twenty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_twenty.setText("+ 20 mins.");
        btn_twenty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_twentyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_twenty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 90, 30));

        btn_sixty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_sixty.setText("+ 60 mins.");
        btn_sixty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sixtyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sixty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 370, 10));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 10, 210));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Add Time:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lbl_prepaid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_prepaid.setText("Rs. 0.00");
        getContentPane().add(lbl_prepaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Current Balance:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        lbl_currBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_currBalance.setForeground(new java.awt.Color(0, 0, 204));
        lbl_currBalance.setText("Rs. 0.00");
        getContentPane().add(lbl_currBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 70, -1));

        btn_thirty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_thirty.setText("+ 30 mins.");
        btn_thirty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thirtyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_thirty, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btn_ok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_ok.setText("Ok");
        getContentPane().add(btn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 90, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 370, 10));

        lbl_time.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_time.setText("Unlimited");
        getContentPane().add(lbl_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Time : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tenActionPerformed
        spin_addtime.setValue(10);
    }//GEN-LAST:event_btn_tenActionPerformed

    private void btn_twentyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_twentyActionPerformed
        spin_addtime.setValue(20);
    }//GEN-LAST:event_btn_twentyActionPerformed

    private void btn_thirtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thirtyActionPerformed
        spin_addtime.setValue(30);
    }//GEN-LAST:event_btn_thirtyActionPerformed

    private void btn_sixtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sixtyActionPerformed
        spin_addtime.setValue(60);
    }//GEN-LAST:event_btn_sixtyActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTime().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_sixty;
    private javax.swing.JButton btn_ten;
    private javax.swing.JButton btn_thirty;
    private javax.swing.JButton btn_twenty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_currBalance;
    private javax.swing.JLabel lbl_prepaid;
    private javax.swing.JLabel lbl_time;
    protected javax.swing.JLabel lbl_user;
    private javax.swing.JSpinner spin_addtime;
    // End of variables declaration//GEN-END:variables
}
