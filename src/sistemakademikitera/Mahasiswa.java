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

/**
 *
 * @author GOCCHAN
 */
public class Mahasiswa {
    String nim,nama,prodi;
    private Object con;
    
    public Mahasiswa(String nim) {
        this.nim=nim;
//        this.nama=nama;
//        this.prodi=prodi;
    }
    
    //untuk cek apakah mahasiswa tsb terdaftar atau tidak
    public void terdaftar (Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        String query="SELECT * FROM mahasiswa";
        ResultSet rs = stmt.executeQuery(query);
        
        HashMap<String,String> ada= new HashMap<>();
        
        String nimFromDb="";
        String namaFromDb="";
        
        while(rs.next()){
            nimFromDb=rs.getString("id");
            namaFromDb=rs.getString("nama");
            ada.put(nimFromDb, namaFromDb);
        }
        
        if (nim.equals(nimFromDb)){
            this.nama=ada.get(nim);
            System.out.println(ada.get(nim));
        }else{
            System.out.println("maaf anda bukan mahasiswa IF ITERA");
        }
    }
}