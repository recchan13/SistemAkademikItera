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
import java.util.TreeMap;

/**
 *
 * @author GOCCHAN
 */
public class Barang extends BarangPinjam {
    int jumlahStok;

    public Barang(int jumlahStok, int id, String nama) {
        super(id, nama);
        this.jumlahStok = jumlahStok;
    }
    
    public void pilihBarang(Connection con,String nama) throws SQLException{
        Statement stmt = con.createStatement();
        String query="SELECT * FROM barang"; //jangan lupa filter tempat peminjaman
        ResultSet rs = stmt.executeQuery(query);
        
        String namaFromDb="";
        int jumlahFromDb;
        
        TreeMap<String,Integer> brg= new TreeMap<>();
        
        while(rs.next()){
            namaFromDb=rs.getString("nama");
            jumlahFromDb=rs.getInt("jumlah_stok");
            
            brg.put(namaFromDb, jumlahFromDb);
        }
        System.out.println("jumlah stok : " + brg.get(nama));
    }
}