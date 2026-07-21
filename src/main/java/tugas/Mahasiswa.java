package tugas;

public class Mahasiswa {

    private String nama;
    private String npm;
    private double nilai;

    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    public boolean lulus() {
        return nilai >= 60;
    }

    public void tampilkan() {
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("Nilai : " + nilai);
        System.out.println("Status: " + (lulus() ? "Lulus" : "Tidak Lulus"));
        System.out.println();
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    
}
