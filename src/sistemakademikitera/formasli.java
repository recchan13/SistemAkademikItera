/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemakademikitera;

import java.awt.HeadlessException;

/**
 *
 * @author Alle
 */
public class formasli extends javax.swing.JFrame {

    /**
     * Creates new form formasli
     */
    public String nama;
    public String nim;
    public String kriteria;
    public String lok;
    public formasli(String nama, String nim, String lok) {
        initComponents();
        this.nama=nama;
        this.nim=nim;
        this.lok=lok;
        namaa.setText(nama);
        nimm.setText(nim);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lRuang = new javax.swing.JLabel();
        lBarang = new javax.swing.JLabel();
        ruang1 = new javax.swing.JLabel();
        ruang = new javax.swing.JLabel();
        barang2 = new javax.swing.JLabel();
        barang = new javax.swing.JLabel();
        aksidaun = new javax.swing.JLabel();
        submit = new javax.swing.JLabel();
        namaa = new javax.swing.JLabel();
        nimm = new javax.swing.JLabel();
        merah = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORM PEMINJAMAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/dusk-evening-flowers-7314 (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 370, 630));

        jPanel1.setBackground(new java.awt.Color(255, 168, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NIM      ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Keterangan Pinjaman");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kategori Pinjaman");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lRuang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/room.png"))); // NOI18N
        lRuang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lRuang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lRuangMouseClicked(evt);
            }
        });
        jPanel1.add(lRuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        lBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/stuff.png"))); // NOI18N
        lBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lBarangMouseClicked(evt);
            }
        });
        jPanel1.add(lBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        ruang1.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        ruang1.setForeground(new java.awt.Color(204, 0, 0));
        ruang1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ruang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ruang1jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(ruang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 60, 30));

        ruang.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        ruang.setForeground(new java.awt.Color(255, 255, 255));
        ruang.setText("Ruangan");
        ruang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ruang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ruangjLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(ruang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, 30));

        barang2.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        barang2.setForeground(new java.awt.Color(204, 0, 0));
        barang2.setText(" ");
        barang2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barang2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barang2jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(barang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 60, -1));

        barang.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        barang.setForeground(new java.awt.Color(255, 255, 255));
        barang.setText("Barang");
        barang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangjLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        aksidaun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/Thanksgiving_Add_-_On-09-512.png"))); // NOI18N
        aksidaun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aksidaun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aksidaunMouseClicked(evt);
            }
        });
        jPanel1.add(aksidaun, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, 61));

        submit.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("SUBMIT");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitjLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, -1, -1));

        namaa.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        namaa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(namaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 106, 230, 30));

        nimm.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        nimm.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nimm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 230, 30));

        merah.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        merah.setForeground(new java.awt.Color(255, 51, 51));
        merah.setText("   ");
        jPanel1.add(merah, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 60, 30));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Keterangan Peminjam");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 0, 500, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lRuangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRuangMouseClicked
        // TODO add your handling code here:
        // IDruangan.setText("ID Ruangan");
        kriteria="Ruang";
        ruang1.setText("Ruangan");
        barang2.setText("");
    }//GEN-LAST:event_lRuangMouseClicked

    private void lBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarangMouseClicked
        // TODO add your handling code here:
        // IDruangan.setText("ID Barang");
        kriteria="Barang";
        ruang1.setText("");
        barang2.setText("Barang");
    }//GEN-LAST:event_lBarangMouseClicked

    private void ruangjLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ruangjLabel8MouseClicked
        // TODO add your handling code here:
        // IDruangan.setText("ID Ruangan");
    }//GEN-LAST:event_ruangjLabel8MouseClicked

    private void barangjLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangjLabel9MouseClicked
        // TODO add your handling code here:
        // IDruangan.setText("ID Barang");
    }//GEN-LAST:event_barangjLabel9MouseClicked

    private void aksidaunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aksidaunMouseClicked
        // TODO add your handling code here:
        if(kriteria.equals("Ruang") ){
            formasli2 form = new formasli2();
            form.setVisible(true);
            this.dispose();
        }else{
            formasli1 form = new formasli1(lok);
            form.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_aksidaunMouseClicked

    private void submitjLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitjLabel15MouseClicked
        // TODO add your handling code here:
         if(kriteria.equals("Ruang") ){
            formasli2 form = new formasli2();
            form.setVisible(true);
            this.dispose();
        }else{
            formasli1 form = new formasli1(lok);
            form.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_submitjLabel15MouseClicked

    private void ruang1jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ruang1jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ruang1jLabel8MouseClicked

    private void barang2jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barang2jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_barang2jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(formasli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formasli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formasli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formasli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new formasli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aksidaun;
    private javax.swing.JLabel barang;
    private javax.swing.JLabel barang2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lBarang;
    private javax.swing.JLabel lRuang;
    private javax.swing.JLabel merah;
    private javax.swing.JLabel namaa;
    private javax.swing.JLabel nimm;
    private javax.swing.JLabel ruang;
    private javax.swing.JLabel ruang1;
    private javax.swing.JLabel submit;
    // End of variables declaration//GEN-END:variables
}