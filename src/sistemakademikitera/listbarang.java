/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemakademikitera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Alle
 */
public class listbarang  {
    private int idTempat;
    private String idBarang;
    
    public listbarang(int idTempat, String idBarang){
        this.idTempat=idTempat;
        this.idBarang=idBarang;
    }
    
    public int getid(){
        return idTempat;
    }
    public String getnama(){
        return idBarang;
    }
    
    public void Pinjam (Connection conn) throws SQLException{
        System.out.print(idBarang + idTempat);
         
        
        String query="UPDATE `barang` SET jumlah_stok = jumlah_stok - 1 WHERE id ="+idBarang+" and id_tempat_pinjam="+idTempat;
        Statement st = conn.createStatement();
        st.executeUpdate(query);  
        
    }
}
