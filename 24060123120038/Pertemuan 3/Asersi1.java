/*  Nama File   : Asersi1.java
 *  Deskripsi   : Program untuk menunjukkan asersi
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 05 Maret 2025
*/
package pertemuantiga;

public interface Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if (x > 0){
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
