package latihan3susulan;

/*
    Nama  : Sudrajat Bintang Nur Aflah
    NPM   : 23010010615
    Kelas : TI-4A
*/

public class BangunDatar {
    // Isi class BangunDatar
    public double alas;
    public double tinggi;
    public double jariJari;
    public double hasil;

     // Method menghitung luas segitiga
    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
    }

    // Method menghitung luas lingkaran
    public void hitungLuasLingkaran() {
        hasil = 3.14 * jariJari * jariJari;
    }
}
