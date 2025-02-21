/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 19 Februari 2025
 */


public class Titik {
    //ATRIBUT
    double absis;
    double ordinat;
    static int counterTitik = 0;
    int kuadran;

    //METHOD
    //konstruktor membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        kuadran = 0;
        counterTitik++;
    }

    //konstruktor membuat titik (x,y)
    Titik(double x, double y){
        absis = x;
        ordinat = y;
        kuadran = 0;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + y;
        ordinat = ordinat + x;
    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mengembalikan nilai kudran titik
    int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            kuadran = 1;
        }
        else if (absis < 0 && ordinat > 0) {
            kuadran = 2;
        }
        else if (absis < 0 && ordinat < 0) {
            kuadran = 3;
        }
        else if (absis > 0 && ordinat < 0) {
            kuadran = 4;
        }
        return kuadran;
    }

    // mengembalikan jarak pusat
    double getJarakPusat(){
        return Math.sqrt(
            (getAbsis() * getAbsis()) 
            + 
            (getOrdinat() * getOrdinat())
        );
    }

    // mengembalikan jarak 2 titik
    double getJarak(Titik T1){
        return Math.sqrt(
            Math.pow((absis - T1.getAbsis()), 2)  
            + 
            Math.pow((ordinat - T1.getOrdinat()), 2)
        );
    }

    // merefleksi x
    void refleksiX(){
        absis = absis * -1;
    }

    // merefleksi y
    void refleksiY(){
        ordinat = ordinat * 1;
    }

    // mengembalikan nilai titik setelah refleksi x
    Titik getRefleksiX(){
        Titik a = new Titik();
        a.setOrdinat(this.ordinat * -1);
        a.setAbsis(this.absis);

        return a;
    }

    // mengembalikan nilai titik setelah refleksi y
    Titik getRefleksiY(){
        Titik a = new Titik();
        a.setOrdinat(this.ordinat);
        a.setAbsis(this.absis * -1);

        return a;
    }

    // Override toString() untuk mencetak objek dengan format yang jelas
    @Override
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }
}
