package com.rpst.yc.server.ui;


import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.imageio.*;
import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pavan Poudel
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jPanel2 = new javax.swing.JPanel();
        btn_comp2 = new javax.swing.JButton();
        btn_comp1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_busy = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_unpaid = new javax.swing.JButton();
        lbl_payment = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_about = new javax.swing.JButton();
        btn_setup = new javax.swing.JButton();
        btn_statistics = new javax.swing.JButton();
        btn_users = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btn_timecode = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_start = new javax.swing.JButton();
        btn_stop = new javax.swing.JButton();
        btn_addtime = new javax.swing.JButton();
        btn_communicate = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(48, 9, 50));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocationByPlatform(true);
        setName("Yello Cafe"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_comp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/desktopon.png"))); // NOI18N
        btn_comp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comp2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_comp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, 70));

        btn_comp1.setBackground(new java.awt.Color(204, 204, 204));
        btn_comp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/desktopoff.png"))); // NOI18N
        btn_comp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comp1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_comp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 640, 590));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_busy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_busy.setText("                Click on the busy terminal ...");
        jPanel4.add(lbl_busy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 270, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 230));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 220));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 270, 310));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 270, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 270, 10));

        btn_unpaid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_unpaid.setText("Unpaid");
        btn_unpaid.setEnabled(false);
        jPanel1.add(btn_unpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 263, 80, 30));

        lbl_payment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_payment.setForeground(new java.awt.Color(255, 0, 0));
        lbl_payment.setText("Get Payment");
        lbl_payment.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        lbl_payment.setEnabled(false);
        jPanel1.add(lbl_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 290, 630));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_about.setBackground(new java.awt.Color(153, 153, 255));
        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/About.jpg"))); // NOI18N
        jPanel3.add(btn_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 70));

        btn_setup.setBackground(new java.awt.Color(153, 153, 255));
        btn_setup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/setting-icon.png"))); // NOI18N
        btn_setup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setupActionPerformed(evt);
            }
        });
        jPanel3.add(btn_setup, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, 70));

        btn_statistics.setBackground(new java.awt.Color(153, 153, 255));
        btn_statistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/statistics.jpg"))); // NOI18N
        jPanel3.add(btn_statistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, 70));

        btn_users.setBackground(new java.awt.Color(153, 153, 255));
        btn_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/users.jpg"))); // NOI18N
        btn_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usersActionPerformed(evt);
            }
        });
        jPanel3.add(btn_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 80, 70));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 51));
        jLabel17.setText("STATISTICS");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        btn_timecode.setBackground(new java.awt.Color(153, 153, 255));
        btn_timecode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/timecode.jpg"))); // NOI18N
        jPanel3.add(btn_timecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 80, 70));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 51));
        jLabel21.setText("ABOUT");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 51));
        jLabel22.setText("SETUP");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 51));
        jLabel23.setText("USERS");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 51));
        jLabel19.setText("TIMECODE");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        btn_logout.setBackground(new java.awt.Color(153, 153, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/logout.jpg"))); // NOI18N
        btn_logout.setAlignmentX(0.5F);
        btn_logout.setAlignmentY(0.0F);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel3.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 80, 70));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 51));
        jLabel20.setText("LOGOUT");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 630));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 620, 10));

        btn_start.setBackground(new java.awt.Color(255, 255, 255));
        btn_start.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/Start.png"))); // NOI18N
        btn_start.setText("START");
        btn_start.setEnabled(false);
        btn_start.setMargin(new java.awt.Insets(2, 2, 2, 10));
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        getContentPane().add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        btn_stop.setBackground(new java.awt.Color(255, 255, 255));
        btn_stop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/Stop.png"))); // NOI18N
        btn_stop.setText("STOP");
        btn_stop.setEnabled(false);
        btn_stop.setMargin(new java.awt.Insets(2, 2, 2, 10));
        btn_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stopActionPerformed(evt);
            }
        });
        getContentPane().add(btn_stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        btn_addtime.setBackground(new java.awt.Color(255, 255, 255));
        btn_addtime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_addtime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/Add-icon.png"))); // NOI18N
        btn_addtime.setText("ADD TIME");
        btn_addtime.setEnabled(false);
        btn_addtime.setMargin(new java.awt.Insets(2, 2, 2, 10));
        btn_addtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addtimeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        btn_communicate.setBackground(new java.awt.Color(255, 255, 255));
        btn_communicate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_communicate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/Add-icon.png"))); // NOI18N
        btn_communicate.setText("Communicate");
        btn_communicate.setEnabled(false);
        btn_communicate.setMargin(new java.awt.Insets(2, 2, 2, 10));
        btn_communicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_communicateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_communicate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jMenuBar1.setBorder(null);
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setText("About");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(70, 20));
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Setup");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(70, 20));
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Statistics");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(80, 20));
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Users");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(70, 20));
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Timecode");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(90, 20));
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Log out");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(70, 20));
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1156, 749));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usersActionPerformed
        Frm_User usr = new Frm_User();
        usr.setVisible(true);
    }//GEN-LAST:event_btn_usersActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_setupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setupActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Setup st=new Setup();
               st.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
               st.setVisible(true);
            }
        });
    }//GEN-LAST:event_btn_setupActionPerformed

    private void btn_comp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comp2ActionPerformed
        JPanel_BusyTerminal bt = new JPanel_BusyTerminal();
        btn_addtime.setEnabled(true);
        btn_stop.setEnabled(true);
        btn_communicate.setEnabled(true);
        btn_start.setEnabled(false);
        
        jPanel4.removeAll();
        jPanel4.setLayout(new BorderLayout());
        jPanel4.add(bt);
        jPanel4.validate();
        jPanel4.setVisible(true);
    }//GEN-LAST:event_btn_comp2ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        Create_Session cs = new Create_Session();
        cs.setVisible(true);
        
        JPanel_BusyTerminal bt = new JPanel_BusyTerminal();
        jPanel4.removeAll();
        jPanel4.setLayout(new BorderLayout());
        jPanel4.add(bt);
        jPanel4.validate();
        
        btn_addtime.setEnabled(true);
        btn_stop.setEnabled(true);
        btn_communicate.setEnabled(true);
        btn_start.setEnabled(false);
        btn_comp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rpst/yc/images/desktopon.png")));
        
        
        
       
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stopActionPerformed
        btn_start.setEnabled(false);
        btn_stop.setEnabled(false);
        btn_addtime.setEnabled(false);
        btn_communicate.setEnabled(false);
        
        Payment pm = new Payment();
        pm.setVisible(true);        
    }//GEN-LAST:event_btn_stopActionPerformed

    private void btn_addtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addtimeActionPerformed
        AddTime adt = new AddTime();
        adt.setVisible(true);
    }//GEN-LAST:event_btn_addtimeActionPerformed

    private void btn_comp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comp1ActionPerformed
        int active = 0;
        if(active==0){
            btn_start.setEnabled(true);
            btn_stop.setEnabled(false);
            btn_addtime.setEnabled(false);
            btn_communicate.setEnabled(false);
            active++;
            
            jPanel4.removeAll();
            jPanel4.setLayout(new BorderLayout());
            jPanel4.add(lbl_busy);
            jPanel4.validate();
        }
        else
        {
            btn_start.setEnabled(false);
            btn_stop.setEnabled(true);
            btn_addtime.setEnabled(true);
            btn_communicate.setEnabled(true);
            jPanel4.removeAll();
            jPanel4.setLayout(new BorderLayout());
            jPanel4.add(lbl_busy);
            jPanel4.validate();
        }
        
    }//GEN-LAST:event_btn_comp1ActionPerformed

    private void btn_communicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_communicateActionPerformed
        Details dt = new Details();
        dt.setVisible(true);
    }//GEN-LAST:event_btn_communicateActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        btn_start.setEnabled(false);
        btn_stop.setEnabled(false);
        btn_addtime.setEnabled(false);
        btn_communicate.setEnabled(false);
        
        jPanel4.removeAll();
        jPanel4.setLayout(new BorderLayout());
        jPanel4.add(lbl_busy);
        jPanel4.validate();
        jPanel4.setVisible(true);
    }//GEN-LAST:event_jPanel2MouseClicked
//cursor setting method
    public static void btn_set_cursor(Main main) {
        main.btn_about.setCursor(new Cursor(Cursor.HAND_CURSOR));
        main.btn_setup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        main.btn_statistics.setCursor(new Cursor(Cursor.HAND_CURSOR));
        main.btn_users.setCursor(new Cursor(Cursor.HAND_CURSOR));
        main.btn_timecode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        main.btn_logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        main.btn_comp1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    //end of cursor setting method
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main main=new Main();
                btn_set_cursor(main);
                 main.setVisible(true);
                }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_addtime;
    private javax.swing.JButton btn_communicate;
    private javax.swing.JButton btn_comp1;
    private javax.swing.JButton btn_comp2;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_setup;
    private javax.swing.JButton btn_start;
    private javax.swing.JButton btn_statistics;
    private javax.swing.JButton btn_stop;
    private javax.swing.JButton btn_timecode;
    private javax.swing.JButton btn_unpaid;
    private javax.swing.JButton btn_users;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_busy;
    private javax.swing.JLabel lbl_payment;
    // End of variables declaration//GEN-END:variables
}
