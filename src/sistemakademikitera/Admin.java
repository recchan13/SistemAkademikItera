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
public class Admin {
    String username; 
    String pass;
    
    public Admin(String username, String pass) {
        this.username=username;
        this.pass=pass;
    }
    
    public boolean login (Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        String query="SELECT * FROM admin";
        ResultSet rs = stmt.executeQuery(query);
        
        HashMap<String,String> log= new HashMap<>();

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
}