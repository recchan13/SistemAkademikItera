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
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author GOCCHAN
 */
public class Mahasiswa {
    String nim,nama,prodi;
    private Object con;
    int inputLoc;
    
    public Mahasiswa(String nim) {
        this.nim=nim;
        this.nama="";
//        this.prodi=prodi;
    }
    
    //untuk cek apakah mahasiswa tsb terdaftar atau tidak
    public boolean terdaftar (Connection con) throws SQLException{
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
        if (ada.get(nim)!=null){
            this.nama=ada.get(nim);
//            System.out.println(nama);
            return true;
        }else{
            System.out.println("maaf anda bukan mahasiswa IF ITERA");
            return false;
        }
    }
    
    
    public void pilihBarangRuang (Connection con) throws SQLException{
        //sediain login admin
        
//        Admin admin=new Admin(nama, nama);
        Scanner sc = new Scanner(System.in);
            String nama="";
            int jml=0;
            int id=0;
            //nanti ini di ubah jadi scanner
        
        Barang barang = new Barang(jml, id, nama);
//        ArrayList<Barang> brng =new ArrayList();
        
        System.out.println("pilih barang : ");
        int pilihan = sc.nextInt();
        if (pilihan==1){
            //user milih barang
            //manggil kelas barang
            nama=sc.next();
            barang.pilihBarang(con,nama);
            
        }else if (pilihan==2){
            //user milih ruang
            //manggil kelas ruang atau jadwal
            
            
        }
    }
    
    public String tempatPinjam (Connection con) throws SQLException {
        Statement stmt = con.createStatement();
        String query="SELECT * FROM tempat_peminjaman";
        ResultSet rs = stmt.executeQuery(query);
        
        int lokasiDB;
        String namaLokasiDB="";
        String namaGedungDB="";

        //isi hashmap
        TreeMap<Integer,String> lok= new TreeMap<>();
        while(rs.next()){
            lokasiDB=rs.getInt("id");
            namaLokasiDB=rs.getString("nama");
            
            lok.put(lokasiDB, namaLokasiDB);
        }
        //outputkan semua id LokasiDB
        System.out.println(inputLoc);
        if (lok.get(inputLoc)!=null){
            //outputkan ke text
            query="SELECT * FROM `tempat_peminjaman` WHERE `id` = '"+inputLoc+"'";
            rs = stmt.executeQuery(query);
            
            while(rs.next()){
                namaGedungDB=rs.getString("gedung");
            }
//            System.out.println(lok.get(inputLoc)+" gedung "+namaGedungDB);
            return (lok.get(inputLoc)+" gedung "+namaGedungDB);
        }else{
            return "Masukkan ID tempat yang benar";
        }
    }
}