/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemakademikitera;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GOCCHAN
 */
public class KonekDB {
    String host,username,pass;

    public KonekDB() {
        host="localhost:3306/sistem_peminjaman";
        username="root";
        pass="";
    }
    
     public Connection getConnection(){
        Connection con;
        try{
            con=(Connection) DriverManager.getConnection("jdbc:mysql://"+host, username, pass);
            System.out.println("Connect!");
            return con;
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, host);
            JOptionPane.showMessageDialog(null, "Database not connected!");
            return null;
        }
     }
}