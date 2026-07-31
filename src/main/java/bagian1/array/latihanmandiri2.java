public class Soal2 {
    public static void main(String[] args) {
        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Minggu"
        };

        System.out.println("Nama hari yang memiliki lebih dari 5 huruf:");

        for (int i = 0; i < hari.length; i++) {
            if (hari[i].length() > 5) {
                System.out.println(hari[i]);
            }
        }
    }
}
