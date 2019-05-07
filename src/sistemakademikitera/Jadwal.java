/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemakademikitera;

import java.sql.Connection;
import java.sql.SQLException;
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
    
    Scanner sc = new Scanner(System.in);

    public Jadwal(String hari,int jam) {
        this.hari=hari;
        this.jam=jam;
    }
    
    public void cekJadwal (Connection con) throws SQLException{
        String hari=sc.next();
        
        TreeMap<Integer,String> jdwl= new TreeMap<>();
        
    }
}
