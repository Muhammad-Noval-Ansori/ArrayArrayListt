public class Main {

    public static void main(String[] args) {

        Perpustakaan perpustakaan = new Perpustakaan();

        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku b2 = new Buku("Bumi", "Tere Liye", 2014);
        Buku b3 = new Buku("Pulang", "Tere Liye", 2015);

        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3);

        b2.pinjam();

        System.out.println("=== DATA BUKU ===");
        perpustakaan.tampilkanSemua();

        System.out.println("=== KEMBALIKAN BUKU ===");
        perpustakaan.kembalikanBuku("Bumi");

        System.out.println("\n=== SETELAH DIKEMBALIKAN ===");
        perpustakaan.tampilkanSemua();

        System.out.println("=== CARI PENULIS ===");
        perpustakaan.cariPenulis("Tere Liye");
    }
}
