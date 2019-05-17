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
    private int id;
    private String nama;
    public listbarang(int id, String nama){
        this.id=id;
        this.nama=nama;
    }
    
    public int getid(){
        return id;
    }
    public String getnama(){
        return nama;
    }
    
    public boolean Pinjam (Connection conn) throws SQLException{
        System.out.print(nama + id);
         
        if(id>=1 && id<=4){
            String query="UPDATE `barang` SET jumlah_stok = jumlah_stok - 1 WHERE id ="+nama+" and id_tempat_pinjam="+id;
            Statement st = conn.createStatement();
            st.executeUpdate(query);  
            return true;
        }   else{
            return false;
        }
    }
}
