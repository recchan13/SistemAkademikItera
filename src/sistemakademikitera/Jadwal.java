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
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author GOCCHAN
 */
public class Jadwal {
    String hari;
    int jam;
    String ruangan;
    boolean ketersediaan; 
    int idHapus;
    
    TreeMap<Integer,String> jdwl= new TreeMap<>();
    
//    Scanner sc = new Scanner(System.in);

    public Jadwal(String hari,int jam) {
        this.hari=hari;
        this.jam=jam;
    }
    
    public Jadwal(int idHapus){
        this.idHapus=idHapus;
    }
    
    public void cekJadwal (Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        String query="SELECT * FROM jadwal";
        ResultSet rs = stmt.executeQuery(query);
        
        
        
        //isi hashmap
        int idFromDb;
        String namaFromDb="";
        
        while(rs.next()){
            idFromDb=rs.getInt("id");
            namaFromDb=rs.getString("ruangan");
            
            this.jdwl.put(idFromDb, namaFromDb);
        }
    }
    
    public void tambah (Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        String query="INSERT INTO jadwal(hari,jam,ruangan,ketersediaan) VALUE ('" +hari+ "','" +jam+ "'," +ruangan+ "," +ketersediaan+ ")";
        
        if(stmt.executeUpdate(query)==1){
        }
    }
    
    public void hapus (Connection con) throws SQLException{
        String ket;
        
        this.cekJadwal(con);
        
        System.out.println(this.jdwl.get(100));
        if(this.jdwl.get(this.idHapus)!=null){
            Statement stmt = con.createStatement();
            String query="DELETE FROM `jadwal` WHERE `jadwal`.`id` = "+this.idHapus;
            
            if(stmt.executeUpdate(query)==1){
            }
            
            ket="Data Berhasil di hapus ^^";
        }else{
            ket="ID yang anda masukkan tidak ada di database ";
        }
        Dialog dialog = new Dialog(ket);
        dialog.setVisible(true);
    }
}