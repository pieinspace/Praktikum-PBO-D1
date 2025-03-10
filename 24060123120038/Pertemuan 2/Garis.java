package pertemuandua;
/*  Nama File   : Titik.java
 *  Deskripsi   : Berisi atribut dan method dalam class garis
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 26 Februari 2025
*/

public class Garis {
    //ATRIBUT
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    //METHOD
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    public double getGradien() {
        if (titikAkhir.getAbsis() == titikAwal.getAbsis()) {
          throw new ArithmeticException("Gradien tak terdefinisi (garis vertikal)");
        }
          return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    public Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    public boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    public boolean isTegakLurus(Garis garisLain) {
        double gradien1 = this.getGradien();
        double gradien2 = garisLain.getGradien();
    if (Double.isInfinite(gradien1) && gradien2 == 0) return true;
    if (Double.isInfinite(gradien2) && gradien1 == 0) return true;
    return gradien1 * gradien2 == -1;
    }

    // Menampilkan ke layar titik awal dan titik akhir garis
    public void tampilkanGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c 
    public void printPersamaanGaris() {
        double gradien = getGradien();
        double intercept = titikAwal.getOrdinat() - gradien * titikAwal.getAbsis();
        System.out.println("Persamaan garis: y = " + gradien + "x + " + intercept);
    }
}
