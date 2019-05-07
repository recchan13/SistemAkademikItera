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
public class Admin {
    String username; 
    String pass;
    Scanner sc = new Scanner(System.in);
    
    TreeMap<String,String> log= new TreeMap<>();
    
    public Admin(String username, String pass) {
        this.username=username;
        this.pass=pass;
    }
    
    public boolean login (Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        String query="SELECT * FROM admin";
        ResultSet rs = stmt.executeQuery(query);
        

        String passFromDb="";
        String unameFromDb="";

        //isi hashmap
        while(rs.next()){
            passFromDb=rs.getString("password");
            unameFromDb=rs.getString("username");
            log.put(unameFromDb, passFromDb);
        }
        
        if (pass.equals(log.get(username))){
            return true;
        }else{
            return false;
        }
    }
    
    public void menu (Connection con) throws SQLException{
        System.out.println("1. mendaftarkan admin baru");
        System.out.println("pilihan : ");
        
        Integer input=sc.nextInt();
        
        if (input==1){
            this.tambah(con);
        }
    }
    
    public void tambah (Connection con) throws SQLException{
        System.out.println("\nusername : ");
        String unameBaru = sc.next();
        System.out.println("\npassword : ");
        String passBaru = sc.next();
        
        log.put(unameBaru, passBaru);
        
        System.out.println("isi log" + log);
    }
}