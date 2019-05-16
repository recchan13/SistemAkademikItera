/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemakademikitera;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author GOCCHAN
 */
public class SistemAkademikItera {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        KonekDB mKonekDB = new KonekDB();
        Connection con = mKonekDB.getConnection();
        
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        LogIn log = new LogIn();
        
        log.setVisible(true);
        String nim = sc.next();
        Mahasiswa mahasiswa = new Mahasiswa(nim);

        mahasiswa.login(con);
        if(mahasiswa.login(con)){
            //alihkan ke form
            mahasiswa.pilihBarangRuang(con);
        }else{
            //isi ulang nim
        }
    }
}