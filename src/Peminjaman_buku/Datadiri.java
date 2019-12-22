/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peminjaman_buku;

/**
 *
 * @author ASUS RYZEN
 */
public class Datadiri {
    
    public String nama;
    public int halaman;

    public String getNama() {
        return nama;
    }

    public int getHalaman() {
        return halaman;
    }
    public Datadiri(String nama,int halaman){
        this.nama=nama;
        this.halaman=halaman;
    }

}
