/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peminjaman_buku;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ASUS RYZEN
 */
public class Auth {

    Scanner input = new Scanner(System.in);
    HashMap<String, Datadiri> data = new HashMap<>();
    Datadiri pinjam;
    char jwb;

    public boolean dataTersimpan() {
        data.put("Kiamat", new Datadiri("Husein Abdul Hamid", 98));
        data.put("Rasulullah", new Datadiri("Rio aditya", 202));
        data.put("Wanita", new Datadiri("Yusuf bayu", 66));
        return false;
    }

    public boolean daftarPeminjaman() {
        System.out.println("Masukkan nama buku yang dipinjam :");
        String buku = input.next();
        System.out.println("Masukkan nama peminjaman :");
        String nama = input.next();
        System.out.println("Masukkan jumlah halaman pada buku :");
        int halaman = input.nextInt();

        if (data.containsKey(buku) == true) {
            System.out.println("[Mohon maaf buku telah dipinjam oleh orang lain]");

        } else {
            data.put(buku, new Datadiri(nama, halaman));
            System.out.println("[Buku berhasil dipinjamkan]");
        }
        return false;
    }

    public boolean cariBuku() {
        System.out.println("Masukkan nama buku yang ingin dicari : ");
        String key = input.next();
        if (data.get(key) == null) {
            System.out.println("Buku masih tersedia di perpustakaan");
        } else {
            pinjam = data.get(key);
            System.out.println("Buku yang anda cari telah dipinjamkan");

        }
        return false;
    }

    public void tampil() {
        System.out.println();
        System.out.print("Tampilkan Semua Data ? y/n : ");
        char jjwb = input.next().charAt(0);
        if (jjwb == 'y' || jjwb == 'Y') {
            System.out.println(">>Menampilkan Semua Data<<");
            System.out.println();
            for (String nsb : data.keySet()) {
                Datadiri value = data.get(nsb);
                System.out.println("[Nama buku: " + nsb + ", Nama peminjam : " + value.getNama() + ", Jumlah Halaman : " + value.getHalaman() + "]");
            }
        }
        if (jjwb == 'n' || jwb == 'N') {
            System.out.println();
            System.out.println("Terimakasih");
        } else {
            System.out.println();
        }
    }

    public void home() {

        System.out.println("MENU");
        System.out.println("1.Mencari buku");
        System.out.println("2.Menampilkan peminjaman");
        System.out.println("3.Tambah buku");
        System.out.println("4.Exit");
        System.out.print("Pilih : ");
        char jjwb = input.next().charAt(0);
        if (jjwb == '1') {
            cariBuku();
            home();
        } else if (jjwb == '2') {
            tampil();
            home();
        } else if (jjwb == '3') {
            daftarPeminjaman();
            home();          
        }  else if (jjwb == '4') {
            System.out.println("GOOD BYE");
        }else{
            System.out.println("WRONG INPUT");
            home();
        }

    }
}
