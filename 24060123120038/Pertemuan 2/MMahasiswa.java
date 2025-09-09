package pertemuandua;
/*  Nama File   : MMahasiswa.java
 *  Deskripsi   : Berisi program utama untuk menguji method Mahasiswa
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Kelas       : D1
 *  Tanggal     : 26 Februari 2025
*/

public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.setNim("038");
        mhs1.setNama("Nara");
        mhs1.setProdi("Informatika");

        MataKuliah MK1 = new MataKuliah();
        MK1.setNama("PBO");
        MK1.setSks(3);
        mhs1.addMatKul(MK1);

        MataKuliah MK2 = new MataKuliah();
        MK2.setNama("ASA");
        MK2.setSks(3);
        mhs1.addMatKul(MK2);

        Dosen DW1 = new Dosen();
        DW1.setNama("Batman");
        mhs1.setDosenWali(DW1);

        Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.setJenis("Mobil\n");
        kendaraan1.setNoPlat("N 4 RA");
        mhs1.setKendaraan(kendaraan1);

        mhs1.printDetailMhs();
        System.out.println("Jumlah SKS: " + mhs1.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah: " + mhs1.getJumlahMatKul());
        System.out.println("\n");

        Mahasiswa mhs2 = new Mahasiswa("118", "Steve", "Manajemen");

        Dosen DW2 = new Dosen("1234", "Azzahra", "Sasing");
        mhs2.setDosenWali(DW2);

        MataKuliah MK3 = new MataKuliah("PBO1234", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MK4 = new MataKuliah("ASA1234", "Analisis Strategi Algoritma", 3);
        mhs2.addMatKul(MK3);
        mhs2.addMatKul(MK4);

        mhs2.printDetailMhs();
        System.out.println("Jumlah SKS yang diambil: " + mhs2.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah yang diambil: " + mhs2.getJumlahMatKul());
    }
}

