/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemakademikitera;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static javax.swing.UIManager.get;
import static javax.swing.UIManager.get;

/**
 *
 * @author Alle
 */
public class formasli2 extends javax.swing.JFrame {

    /**
     * Creates new form formasli2
     */
    public formasli2() {
        initComponents();
    }
    public String namahari=null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        submit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        monday = new javax.swing.JLabel();
        tuesday = new javax.swing.JLabel();
        wednesday = new javax.swing.JLabel();
        thursday = new javax.swing.JLabel();
        friday = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/kecildusk.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 680));

        jPanel1.setBackground(new java.awt.Color(255, 193, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/Thanksgiving_Add_-_On-09-512.png"))); // NOI18N
        submit.setText("SUBMIT");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, -1, 61));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hari yang diinginkan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        monday.setBackground(new java.awt.Color(255, 255, 255));
        monday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-monday-64.png"))); // NOI18N
        monday.setText("jLabel2");
        monday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        monday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mondayMouseClicked(evt);
            }
        });
        jPanel1.add(monday, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 60, -1));

        tuesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-tuesday-64.png"))); // NOI18N
        tuesday.setText("jLabel4");
        tuesday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tuesday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tuesdayMouseClicked(evt);
            }
        });
        jPanel1.add(tuesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 60, -1));

        wednesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-wednesday-64.png"))); // NOI18N
        wednesday.setText("jLabel5");
        wednesday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wednesday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wednesdayMouseClicked(evt);
            }
        });
        jPanel1.add(wednesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 60, -1));

        thursday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-thursday-64.png"))); // NOI18N
        thursday.setText("jLabel6");
        thursday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thursday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thursdayMouseClicked(evt);
            }
        });
        jPanel1.add(thursday, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 60, -1));

        friday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-friday-64.png"))); // NOI18N
        friday.setText("jLabel7");
        friday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        friday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fridayMouseClicked(evt);
            }
        });
        jPanel1.add(friday, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 270, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        // TODO add your handling code here:
        formasli3 form = new formasli3(namahari);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submitMouseClicked
    
    private void mondayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mondayMouseClicked
        // TODO add your handling code here:
        monday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-monday-64 - Copy.png")));
        tuesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-tuesday-64.png")));
        wednesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-wednesday-64.png")));
        thursday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-thursday-64.png")));
        friday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-friday-64.png")));
        this.namahari="Senin";
    }//GEN-LAST:event_mondayMouseClicked

    private void tuesdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuesdayMouseClicked
        // TODO add your handling code here:
        monday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-monday-64.png")));
        tuesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-tuesday-64 - Copy.png")));
        wednesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-wednesday-64.png")));
        thursday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-thursday-64.png")));
        friday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-friday-64.png")));
        this.namahari="Selasa";
    }//GEN-LAST:event_tuesdayMouseClicked

    private void wednesdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wednesdayMouseClicked
        // TODO add your handling code here:
        monday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-monday-64.png")));
        tuesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-tuesday-64.png")));
        wednesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-wednesday-64 - Copy.png")));
        thursday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-thursday-64.png")));
        friday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-friday-64.png")));
        this.namahari="Rabu";
    }//GEN-LAST:event_wednesdayMouseClicked

    private void thursdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thursdayMouseClicked
        // TODO add your handling code here:
        monday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-monday-64.png")));
        tuesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-tuesday-64.png")));
        wednesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-wednesday-64.png")));
        thursday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-thursday-64 - Copy.png")));
        friday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-friday-64.png")));
        this.namahari="Kamis";
    }//GEN-LAST:event_thursdayMouseClicked

    private void fridayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fridayMouseClicked
        // TODO add your handling code here:
        monday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-monday-64.png")));
        tuesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-tuesday-64.png")));
        wednesday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-wednesday-64.png")));
        thursday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-thursday-64.png")));
        friday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/icons8-friday-64 - Copy.png")));
        this.namahari="Jumat";
    }//GEN-LAST:event_fridayMouseClicked

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
            java.util.logging.Logger.getLogger(formasli2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formasli2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formasli2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formasli2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formasli2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel friday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel monday;
    private javax.swing.JLabel submit;
    private javax.swing.JLabel thursday;
    private javax.swing.JLabel tuesday;
    private javax.swing.JLabel wednesday;
    // End of variables declaration//GEN-END:variables
}
