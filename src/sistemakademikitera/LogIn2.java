/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemakademikitera;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alle
 */
public class LogIn2 extends javax.swing.JFrame {
    
    Connection con=null;
    /**
     * Creates new form LogIn2
     */
    public LogIn2() {
        initComponents();
        con=new KonekDB().getConnection();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uname = new javax.swing.JLabel();
        uname1 = new javax.swing.JLabel();
        Keterangan = new javax.swing.JLabel();
        Unamee = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        DAUNKANAN = new javax.swing.JLabel();
        DAUNKIRI = new javax.swing.JLabel();
        DAUNBACK = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uname.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uname.setForeground(new java.awt.Color(255, 255, 255));
        uname.setText("Password         ");
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        uname1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uname1.setForeground(new java.awt.Color(255, 255, 255));
        uname1.setText("Username        ");
        getContentPane().add(uname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        Keterangan.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        Keterangan.setForeground(new java.awt.Color(255, 255, 255));
        Keterangan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Keterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 330, 40));

        Unamee.setBackground(new java.awt.Color(164, 119, 84));
        Unamee.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Unamee.setForeground(new java.awt.Color(255, 255, 255));
        Unamee.setBorder(null);
        Unamee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameeActionPerformed(evt);
            }
        });
        getContentPane().add(Unamee, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 230, 30));

        Pass.setBackground(new java.awt.Color(164, 119, 84));
        Pass.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Pass.setBorder(null);
        getContentPane().add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 230, 30));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Log In Admin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        DAUNKANAN.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        DAUNKANAN.setForeground(new java.awt.Color(255, 255, 255));
        DAUNKANAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/daun2.png"))); // NOI18N
        DAUNKANAN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DAUNKANAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DAUNKANANMouseClicked(evt);
            }
        });
        getContentPane().add(DAUNKANAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, 40));

        DAUNKIRI.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        DAUNKIRI.setForeground(new java.awt.Color(255, 255, 255));
        DAUNKIRI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/daun1.png"))); // NOI18N
        DAUNKIRI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DAUNKIRI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DAUNKIRIMouseClicked(evt);
            }
        });
        getContentPane().add(DAUNKIRI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 50, 40));

        DAUNBACK.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        DAUNBACK.setForeground(new java.awt.Color(255, 255, 255));
        DAUNBACK.setText("BACK");
        DAUNBACK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DAUNBACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DAUNBACKDAUNKIRIMouseClicked(evt);
            }
        });
        getContentPane().add(DAUNBACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NEXT");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3DAUNKANANMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        background.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/blue-blue-hour-bright-633811 (2).jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnameeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnameeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnameeActionPerformed

    private void DAUNKANANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DAUNKANANMouseClicked
        try {
            // TODO add your handling code here:
            Admin admin = new Admin(Unamee.getText(), Pass.getText());
            
            if(admin.login(con)){
                Keterangan.setText("Log In Berhasil");
                menuadmin menu = new menuadmin();
                menu.setVisible(true);
                this.dispose();
            }else{
                Pass.setText("");
                Keterangan.setText("Log In Gagal");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogIn2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DAUNKANANMouseClicked

    private void DAUNKIRIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DAUNKIRIMouseClicked
        // TODO add your handling code here:
        LogIn login = new LogIn();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DAUNKIRIMouseClicked

    private void DAUNBACKDAUNKIRIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DAUNBACKDAUNKIRIMouseClicked
        // TODO add your handling code here:
        LogIn login = new LogIn();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DAUNBACKDAUNKIRIMouseClicked

    private void jLabel3DAUNKANANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3DAUNKANANMouseClicked
        try {
            // TODO add your handling code here:
            Admin admin = new Admin(Unamee.getText(), Pass.getText());
            
            if(admin.login(con)){
                Keterangan.setText("Log In Berhasil");
                menuadmin menu = new menuadmin();
                menu.setVisible(true);
                this.dispose();
            }else{
                Pass.setText("");
                Keterangan.setText("Log In Gagal");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogIn2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3DAUNKANANMouseClicked

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
            java.util.logging.Logger.getLogger(LogIn2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DAUNBACK;
    private javax.swing.JLabel DAUNKANAN;
    private javax.swing.JLabel DAUNKIRI;
    private javax.swing.JLabel Keterangan;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Unamee;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel uname;
    private javax.swing.JLabel uname1;
    // End of variables declaration//GEN-END:variables
}
