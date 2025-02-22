// Nama File : Titik.java
// Deskripsi : berisis atribut dan method dalam class Titik
// Pembuat   : Pramudya Jati Pamungkas
// Tanggal   : 19 Februari 2025 

public class Titik {
    /*************** Atribut *****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*************** Method *****************/
    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
    }

    static int getCounterTitik() {
        return counterTitik;
    }
    
    // Mengembalikkan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikkan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }
    
    // geser 
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    void printTitik() {
        System.out.println("Titik(" + absis + ", " + ordinat + ")");
    }

    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

    double getJarak(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak2(Titik T){
        return Math.sqrt(Math.pow(absis - T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
    }

    void refleksiX(){
        ordinat *= -1;
    }

    void refleksiY(){
        absis *= -1;
    }

    Titik getRefleksiX(){
        return new Titik(this.absis, this.ordinat * -1);
    }

    Titik getRefleksiY(){
        return new Titik(this.absis * -1, this.ordinat);
    }
}