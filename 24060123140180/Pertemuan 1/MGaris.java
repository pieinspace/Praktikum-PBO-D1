// Nama File : MGaris.java
// Deskripsi : berisis atribut dan method dalam class Garis
// Pembuat   : Pramudya Jati Pamungkas
// Tanggal   : 22 Februari 2025 


public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();

        System.out.println("G1");
        G1.printGaris();
        G1.getTitikAwal().setAbsis(4);
        G1.getTitikAwal().setOrdinat(2);
        G1.getTitikAkhir().setAbsis(10);
        G1.getTitikAkhir().setOrdinat(10);
        G1.printGaris();
        System.out.println("Panjang Garis: " + G1.getPanjang());
        System.out.println("Gradien Garis: " + G1.getGradien());
        G1.getTitikTengah().printTitik();

        Garis G2 = new Garis();
        System.out.println("\nG2");
        G2.printGaris();
        G2.getTitikAwal().setAbsis(4);
        G2.getTitikAwal().setOrdinat(2);
        G2.getTitikAkhir().setAbsis(6);
        G2.getTitikAkhir().setOrdinat(8);
        G2.printGaris();
        System.out.println("Panjang Garis: " + G2.getPanjang());
        System.out.println("Gradien Garis: " + G2.getGradien());
        G2.getTitikTengah().printTitik();

        System.out.println("/nApakah G1 & G2 Sejajar? "+ G1.isSejajar(G2));
        System.out.println("Apakah G1 & G2 Tegak Lurus? "+ G1.isTegakLurus(G2));
        System.out.println("\nPersamaan Garis G1: "+ G1.getEqual());
        System.out.println("Persamaan Garis G2: "+ G2.getEqual());

      

    }
}
