import java.util.ArrayList;

public class Perpustakaan {

    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanSemua() {
        for (Buku b : daftarBuku) {
            b.info();
        }
    }

    // Soal 1
    public void kembalikanBuku(String judul) {
        for (Buku b : daftarBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                b.kembalikan();
                System.out.println(judul + " berhasil dikembalikan.");
            }
        }
    }

    // Soal 3
    public void cariPenulis(String penulis) {
        System.out.println("\nDaftar buku karya " + penulis + ":");

        for (Buku b : daftarBuku) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                b.info();
            }
        }
    }
}
