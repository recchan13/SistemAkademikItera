/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemakademikitera;

/**
 *
 * @author GOCCHAN
 */
public class Ruang extends BarangPinjam{
    String gedung;

    public Ruang(String gedung, int id, String nama) {
        super(id, nama);
        this.gedung = gedung;
    }
}
