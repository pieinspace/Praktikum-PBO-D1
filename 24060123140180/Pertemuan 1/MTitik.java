// Nama File : MTitik.java
// Deskripsi : berisis Main dari atribut dan method dalam class Titik
// Pembuat   : Pramudya Jati Pamungkas
// Tanggal   : 19 Februari 2025 


public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik();

        System.out.println("T1");
        T1.setAbsis(4);
        T1.setOrdinat(2);
        T1.printTitik();
        T1.geser(-9, -4);
        T1.printTitik();

        System.out.println("\nT2");
        T2.printTitik();
        T2.setAbsis(10);
        T2.setOrdinat(10);
        T2.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Kuadran T1 = " + T1.getKuadran());
        System.out.println("Jarak T2 ke 0 = " + T2.getJarak());
        System.out.println("Jarak T2 ke T1 = " + T2.getJarak2(T1));
        System.out.println("Jarak T2 ke T1 = " + T2.getJarak2(T1));

        System.out.println("\nRefleksiX dan RefleksiY T1");
        T1.refleksiX();
        T1.printTitik();
        T1.refleksiY();
        T1.printTitik();

        System.out.println("\ngetRefleksiX dan getRefleksiY T1");
        T1 = T1.getRefleksiX();
        T1.printTitik();
        T1 = T1.getRefleksiY();
        T1.printTitik();
    }

}
