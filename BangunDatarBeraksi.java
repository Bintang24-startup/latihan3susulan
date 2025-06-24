package latihan3susulan;

public class BangunDatarBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class BangunDatar
        BangunDatar bintang = new BangunDatar();

        // Memberi nilai alas dan tinggi untuk menghitung luas segitiga
        bintang.alas = 6;
        bintang.tinggi = 4;
        bintang.hitungLuasSegitiga();
        System.out.println("Luas Segitiga = " + bintang.getHasil());

        // Memberi nilai jari-jari untuk menghitung luas lingkaran
        bintang.jariJari = 5;
        bintang.hitungLuasLingkaran();
        System.out.println("Luas Lingkaran = " + bintang.getHasil());
    }
}
