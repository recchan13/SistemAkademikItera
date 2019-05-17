/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemakademikitera;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Alle
 */
public class form extends javax.swing.JFrame {
    Connection con=null;
    
    int idTempat;
    String tempatGet;
    /**
     * Creates new form form
     */
    public form() {
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

        daun1 = new javax.swing.JLabel();
        daun12 = new javax.swing.JLabel();
        daun21 = new javax.swing.JLabel();
        daun2 = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        uname2 = new javax.swing.JLabel();
        uname1 = new javax.swing.JLabel();
        tempat = new javax.swing.JTextField();
        nim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Ket = new javax.swing.JLabel();
        Ket1 = new javax.swing.JLabel();
        kettem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        daun1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        daun1.setForeground(new java.awt.Color(255, 255, 255));
        daun1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/daun2.png"))); // NOI18N
        daun1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        daun1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daun1MouseClicked(evt);
            }
        });
        getContentPane().add(daun1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, 40));

        daun12.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        daun12.setForeground(new java.awt.Color(255, 255, 255));
        daun12.setText("NEXT");
        daun12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        daun12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daun12DAUNKANANMouseClicked(evt);
            }
        });
        getContentPane().add(daun12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, -1, -1));

        daun21.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        daun21.setForeground(new java.awt.Color(255, 255, 255));
        daun21.setText("BACK");
        daun21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        daun21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daun21DAUNKIRIMouseClicked(evt);
            }
        });
        getContentPane().add(daun21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

        daun2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        daun2.setForeground(new java.awt.Color(255, 255, 255));
        daun2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/daun1.png"))); // NOI18N
        daun2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        daun2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daun2MouseClicked(evt);
            }
        });
        getContentPane().add(daun2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 50, 40));

        uname.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uname.setForeground(new java.awt.Color(255, 255, 255));
        uname.setText("NIM");
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        uname2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uname2.setForeground(new java.awt.Color(255, 255, 255));
        uname2.setText("Tempat Peminjaman");
        getContentPane().add(uname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        uname1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        uname1.setForeground(new java.awt.Color(255, 255, 255));
        uname1.setText("Name");
        getContentPane().add(uname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        tempat.setBackground(new java.awt.Color(164, 119, 84));
        tempat.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tempat.setForeground(new java.awt.Color(255, 255, 255));
        tempat.setBorder(null);
        tempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempatActionPerformed(evt);
            }
        });
        tempat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tempatKeyPressed(evt);
            }
        });
        getContentPane().add(tempat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 130, 30));

        nim.setBackground(new java.awt.Color(164, 119, 84));
        nim.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        nim.setForeground(new java.awt.Color(255, 255, 255));
        nim.setBorder(null);
        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });
        nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nimKeyPressed(evt);
            }
        });
        getContentPane().add(nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 240, 30));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Log In Mahasiswa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        Ket.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        Ket.setForeground(new java.awt.Color(255, 255, 255));
        Ket.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Ket, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 670, 180, 40));

        Ket1.setFont(new java.awt.Font("Agency FB", 1, 26)); // NOI18N
        Ket1.setForeground(new java.awt.Color(255, 255, 255));
        Ket1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Ket1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, 200, 40));

        kettem.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        kettem.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(kettem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 220, 40));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 240, 30));

        background.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/blue-blue-hour-bright-633811 (2).jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String tem;
    private void daun1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daun1MouseClicked
        // TODO add your handling code here:
        this.idTempat=Integer.parseInt(tempat.getText());
        Mahasiswa mhs=new Mahasiswa(nim.getText());
        
        try {
            if(mhs.login(con) && !kettem.getText().isEmpty()){
                formasli form = new formasli(mhs.nama,mhs.nim,this.idTempat);
                
                form.setVisible(true);
                this.dispose();
                form.nama=mhs.nama;
                jLabel1.setText(mhs.nama);
                
                Ket.setText("SELAMAT DATANG");
                Ket1.setText("");
                tem=tempat.getText();
            }else{
                nim.setText("");
                Ket.setText("");
                Ket1.setText("LOG IN GAGAL");
//                JOptionPane.showMessageDialog(null, "Maaf anda tidak terdaftar di Itera");
            }
        } catch (SQLException ex) {
            Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_daun1MouseClicked

    private void daun12DAUNKANANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daun12DAUNKANANMouseClicked
        // TODO add your handling code here:
        this.idTempat=Integer.parseInt(tempat.getText());
        Mahasiswa mhs=new Mahasiswa(nim.getText());
        System.out.println("nim "+nim.getText());
        
        try {
            if(mhs.login(con)&& !kettem.getText().isEmpty()){
                formasli form = new formasli(mhs.nama,mhs.nim,this.idTempat);
                form.setVisible(true);
                this.dispose();
                form.nama=mhs.nama;
                jLabel1.setText(mhs.nama);
                
                tem=tempat.getText();
                Ket.setText("SELAMAT DATANG");
                Ket1.setText("");
            }else{
                nim.setText("");
                Ket.setText("");
                Ket1.setText("Maaf Anda Bukan Mahasiswa/i IF Itera");
            }
        } catch (SQLException ex) {
            Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_daun12DAUNKANANMouseClicked

    private void daun21DAUNKIRIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daun21DAUNKIRIMouseClicked
        // TODO add your handling code here:
        LogIn login = new LogIn();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daun21DAUNKIRIMouseClicked

    private void daun2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daun2MouseClicked
        // TODO add your handling code here:
        LogIn login = new LogIn();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_daun2MouseClicked

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nimActionPerformed

    private void nimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nimKeyPressed
        // TODO add your handling code here:
        
        if (evt.getKeyCode()==10){
            Mahasiswa mhs=new Mahasiswa(nim.getText());
            
            try {
                if(mhs.login(con) ){
                    formasli form = new formasli(mhs.nama,mhs.nim,this.idTempat);
                    form.nama=mhs.nama;
                    jLabel1.setText(mhs.nama);
                            
                    Ket.setText("SELAMAT DATANG");
                    Ket1.setText("");
//                    this.tempatActionPerformed(null);
                }else{
                    nim.setText("");
                    Ket.setText("");
                    Ket1.setText("Maaf Anda Bukan Mahasiswa/i IF Itera");
                }
            } catch (SQLException ex) {
                Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_nimKeyPressed
    
    private void tempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempatActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tempatActionPerformed

    private void tempatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempatKeyPressed
        // TODO add your handling code here:
       
        if(evt.getKeyCode()==10){
            Mahasiswa mhs=new Mahasiswa(nim.getText());
           
            try {
                mhs.inputLoc=Integer.parseInt(tempat.getText());
//                System.out.println(mhs.inputLoc);
                kettem.setText(mhs.tempatPinjam(con));
            } catch (SQLException ex) {
                Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tempatKeyPressed

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ket;
    private javax.swing.JLabel Ket1;
    private javax.swing.JLabel background;
    private javax.swing.JLabel daun1;
    private javax.swing.JLabel daun12;
    private javax.swing.JLabel daun2;
    private javax.swing.JLabel daun21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel kettem;
    private javax.swing.JTextField nim;
    private javax.swing.JTextField tempat;
    private javax.swing.JLabel uname;
    private javax.swing.JLabel uname1;
    private javax.swing.JLabel uname2;
    // End of variables declaration//GEN-END:variables
}
