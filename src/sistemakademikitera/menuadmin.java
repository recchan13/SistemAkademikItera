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
public class menuadmin extends javax.swing.JFrame {
    Connection con=null;
    /**
     * Creates new form menuadmin
     */
    public menuadmin() {
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

        gam1 = new javax.swing.JLabel();
        gam2 = new javax.swing.JLabel();
        gam3 = new javax.swing.JLabel();
        pengbarang1 = new javax.swing.JLabel();
        pengbarang = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        upjadwal1 = new javax.swing.JLabel();
        upjadwal = new javax.swing.JLabel();
        tamadmin1 = new javax.swing.JLabel();
        tamadmin = new javax.swing.JLabel();
        bcgrnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gam1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/healthjjj.png"))); // NOI18N
        gam1.setText("jLabel2");
        gam1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gam1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gam1MouseClicked(evt);
            }
        });
        getContentPane().add(gam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 150, -1));

        gam2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/health.png"))); // NOI18N
        gam2.setText("jLabel4");
        gam2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gam2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gam2MouseClicked(evt);
            }
        });
        getContentPane().add(gam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 150, -1));

        gam3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/pineapple-512.png"))); // NOI18N
        gam3.setText("jLabel5");
        gam3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gam3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gam3MouseClicked(evt);
            }
        });
        getContentPane().add(gam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 150, -1));

        pengbarang1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        pengbarang1.setForeground(new java.awt.Color(204, 0, 0));
        pengbarang1.setText(" ");
        pengbarang1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(pengbarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 190, -1));

        pengbarang.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        pengbarang.setForeground(new java.awt.Color(255, 255, 255));
        pengbarang.setText("Pengembalian Barang");
        pengbarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gam3MouseClicked(evt);
            }
        });
        getContentPane().add(pengbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELAMAT DATANG DI MENU ADMIN");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        upjadwal1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        upjadwal1.setForeground(new java.awt.Color(204, 0, 0));
        upjadwal1.setText(" ");
        upjadwal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(upjadwal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 130, -1));

        upjadwal.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        upjadwal.setForeground(new java.awt.Color(255, 255, 255));
        upjadwal.setText("Update Jadwal");
        upjadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upjadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gam1MouseClicked(evt);
            }
        });
        getContentPane().add(upjadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        tamadmin1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        tamadmin1.setForeground(new java.awt.Color(204, 0, 0));
        tamadmin1.setText(" ");
        tamadmin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(tamadmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 130, -1));

        tamadmin.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        tamadmin.setForeground(new java.awt.Color(255, 255, 255));
        tamadmin.setText("Tambah Admin");
        tamadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tamadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gam2MouseClicked(evt);
            }
        });
        getContentPane().add(tamadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        bcgrnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/backlit-color-colour-145805.jpg"))); // NOI18N
        bcgrnd.setText("jLabel1");
        getContentPane().add(bcgrnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 753, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gam1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gam1MouseClicked
        // TODO add your handling code here:
        upjadwal1.setText("Update Jadwal");
        pengbarang1.setText("");
        tamadmin1.setText("");
    }//GEN-LAST:event_gam1MouseClicked

    private void gam2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gam2MouseClicked
        // TODO add your handling code here:
        upjadwal1.setText("");
        pengbarang1.setText("");
        tamadmin1.setText("Tambah Admin");
    }//GEN-LAST:event_gam2MouseClicked

    private void gam3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gam3MouseClicked
        // TODO add your handling code here:
        upjadwal1.setText("");
        pengbarang1.setText("Pengembalian Barang");
        tamadmin1.setText("");
    }//GEN-LAST:event_gam3MouseClicked

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
            java.util.logging.Logger.getLogger(menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bcgrnd;
    private javax.swing.JLabel gam1;
    private javax.swing.JLabel gam2;
    private javax.swing.JLabel gam3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel pengbarang;
    private javax.swing.JLabel pengbarang1;
    private javax.swing.JLabel tamadmin;
    private javax.swing.JLabel tamadmin1;
    private javax.swing.JLabel upjadwal;
    private javax.swing.JLabel upjadwal1;
    // End of variables declaration//GEN-END:variables
}
