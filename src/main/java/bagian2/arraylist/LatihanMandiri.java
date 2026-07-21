import java.util.ArrayList;

public class LatihanArrayList {

    public static void main(String[] args) {

        // =========================
        // SOAL 1
        // =========================
        System.out.println("===== SOAL 1 =====");

        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Telur");

        // Hapus item ke-2 (index 1)
        daftarBelanja.remove(1);

        System.out.println("Daftar Belanja:");
        for (String item : daftarBelanja) {
            System.out.println("- " + item);
        }

        System.out.println("Jumlah item: " + daftarBelanja.size());


        // =========================
        // SOAL 2
        // =========================
        System.out.println("\n===== SOAL 2 =====");

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(15);
        angka.add(8);
        angka.add(23);
        angka.add(42);
        angka.add(17);

        int terbesar = angka.get(0);

        for (int nilai : angka) {
            if (nilai > terbesar) {
                terbesar = nilai;
            }
        }

        System.out.println("Isi ArrayList: " + angka);
        System.out.println("Nilai terbesar: " + terbesar);


        // =========================
        // SOAL 3
        // =========================
        System.out.println("\n===== SOAL 3 =====");

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Aisyah");
        nama.add("Citra");
        nama.add("Aldi");
        nama.add("Doni");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

/**
 *
 * @author USER
 */
public class LatihanMandiri {
    
}
