/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templa
tes
 * and open the template in the editor.
 */
package sistemakademikitera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Alle
 */
public class formasli1 extends javax.swing.JFrame {

    /**
     * Creates new form formasli1
     */
    
    public String idBrg;
    
    public int lok;
    String namaLok;
    String gedung;
            
    Connection conn=null;
    public formasli1(int lok) {
        conn = new KonekDB().getConnection();
        
        String query="SELECT * FROM tempat_peminjaman WHERE id = "+lok;
        Statement stmt;
        try {
            stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
        
        while(rs.next()){
            this.lok=rs.getInt("id");
            this.namaLok=rs.getString("nama");
            this.gedung=rs.getString("gedung");
        }
        } catch (SQLException ex) {
            Logger.getLogger(formasli1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
        tampil_barang();
        
        lokasi.setText(this.namaLok +" gedung "+this.gedung);
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
        lokasi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablebarang = new javax.swing.JTable();
        idbrang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORM PEMINJAMAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/dusk-evening-flowers-7314 (2).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 370, 630));

        jPanel1.setBackground(new java.awt.Color(255, 193, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lokasi.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 20)); // NOI18N
        lokasi.setForeground(new java.awt.Color(163, 107, 0));
        lokasi.setText(" ");
        jPanel1.add(lokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 270, 30));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lokasi");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Barang");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        tablebarang.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        tablebarang.setForeground(new java.awt.Color(163, 107, 0));
        tablebarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Nama Barang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablebarang.setMinimumSize(new java.awt.Dimension(33, 0));
        tablebarang.setRowHeight(33);
        tablebarang.setRowMargin(10);
        tablebarang.setSelectionBackground(new java.awt.Color(255, 221, 158));
        jScrollPane1.setViewportView(tablebarang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 400, 300));

        idbrang.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 20)); // NOI18N
        idbrang.setForeground(new java.awt.Color(163, 107, 0));
        idbrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbrangActionPerformed(evt);
            }
        });
        jPanel1.add(idbrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 280, 30));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("List Barang");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        submit.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemakademikitera/swing/Thanksgiving_Add_-_On-09-512.png"))); // NOI18N
        submit.setText("SUBMIT");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 500, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        // TODO add your handling code here:
        this.idBrg=idbrang.getText();
        if(!idbrang.getText().isEmpty()){
            listbarang barang = new listbarang (this.lok,this.idBrg);
            try {
                barang.Pinjam(conn);
                
                kesimpulan simpulan=new kesimpulan();
                simpulan.setVisible(true);
                this.dispose();
                
            } catch (SQLException ex) {
                Logger.getLogger(formasli1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_submitMouseClicked

    private void idbrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbrangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbrangActionPerformed
     public ArrayList<listbarang> barang(){
         ArrayList<listbarang> barang1=new ArrayList();
         //form formw = new form();                 
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://"+"localhost:3306/sistem_peminjaman", "root","");
            String query="SELECT id, nama FROM barang WHERE jumlah_stok >0 AND id_tempat_pinjam = "+lok;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            listbarang lbar;
            while (rs.next()){
                lbar=new listbarang(Integer.parseInt(rs.getString("Id")), rs.getString("Nama"));
                barang1.add(lbar);
            }
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return barang1;
    }
     
     public void tampil_barang(){
         ArrayList<listbarang> list =  barang();
         DefaultTableModel model = (DefaultTableModel)tablebarang.getModel();
         Object[] baris = new Object [2];
         for (int i=0;i<list.size(); i++){
             baris[0]=list.get(i).getid();
             baris[1]=list.get(i).getnama();
             model.addRow(baris);
         }
     }
   
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
            java.util.logging.Logger.getLogger(formasli1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formasli1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formasli1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formasli1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        //        new formasli1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idbrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lokasi;
    private javax.swing.JLabel submit;
    private javax.swing.JTable tablebarang;
    // End of variables declaration//GEN-END:variables

   
}
