package tugas;

public class MainTugas {

    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        Mahasiswa m1 = new Mahasiswa("Andi", "241001001", 85);
        Mahasiswa m2 = new Mahasiswa("Budi", "241001002", 75);
        Mahasiswa m3 = new Mahasiswa("Citra", "241001003", 55);
        Mahasiswa m4 = new Mahasiswa("Dina", "241001004", 90);
        Mahasiswa m5 = new Mahasiswa("Eko", "241001005", 60);

        kelas.tambahMahasiswa(m1);
        kelas.tambahMahasiswa(m2);
        kelas.tambahMahasiswa(m3);
        kelas.tambahMahasiswa(m4);
        kelas.tambahMahasiswa(m5);

        System.out.println("===== DAFTAR MAHASISWA =====");
        kelas.tampilkanSemua();

        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Struktur Data"
        };

        System.out.println("===== MATA KULIAH =====");

        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        System.out.println("\n===== HASIL =====");
        System.out.println("Rata-rata Nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah Lulus    : " + kelas.jumlahLulus());

        Mahasiswa baru = new Mahasiswa("Fajar", "241001006", 88);

        kelas.tambahMahasiswa(baru);

        System.out.println("\nSetelah menambah mahasiswa:");
        System.out.println("Jumlah Mahasiswa : " + kelas.jumlahData());
    }
}MUHAMMAD NOVAL ANSORI
    2410010121

