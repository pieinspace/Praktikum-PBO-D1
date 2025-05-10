/*  Nama File   : Asersi2.java
 *  Deskripsi   : Program untuk demo asersi, yang akan menolak input jari jari lingkaran yang bernilai nol
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 05 Maret 2025
*/

package pertemuantiga;


//class lingkaran
class lingkaran{
    private double jariJari;

    public lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 5;
        assert(jariJari > 0): "jari-jari tidak boleh nol!!!";
        lingkaran l = new lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

// PETANYAAN : 
// secara konsep, ada yang kurang tepat pada program Asersi2 di atas, jelaskan!

// JAWABAN : 
// ----Asersi Seharusnya Ditempatkan di Konstruktor----
// Asersi (assert) digunakan untuk memeriksa nilai yang tidak boleh terjadi dalam program.
// Dalam kode di atas, asersi hanya dilakukan dalam main() sebelum objek lingkaran dibuat. 
// Namun, jika ada cara lain untuk membuat objek lingkaran di tempat lain dalam program, asersi tersebut tidak akan berlaku. Perbaikan kode:

// class lingkaran {
//     private double jariJari;

//     public lingkaran(double jariJari) {
//         assert(jariJari > 0) : "Jari-jari tidak boleh nol atau negatif!!!";
//         this.jariJari = jariJari;
//     }

//     public double hitungKeliling() {
//         return 2 * Math.PI * jariJari;
//     }
// }


