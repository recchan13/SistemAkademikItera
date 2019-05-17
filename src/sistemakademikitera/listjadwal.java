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
public class listjadwal {
    private String jam;
    private String ruang;
    
    public listjadwal(String jam, String ruang){
        this.jam=jam;
        this.ruang=ruang;
    }

     public String getjam(){
        return jam;
    }
    public String getruang(){
        return ruang;
    }
    public void Pinjam (Connection conn) throws SQLException{
        System.out.print("hasil"+jam + ruang);
         
        String query="UPDATE `jadwal` SET ketersediaan = 1 WHERE id ="+jam+" and id_tempat_pinjam="+ruang;
        Statement st = conn.createStatement();
        st.executeUpdate(query);  
        
    }
}
