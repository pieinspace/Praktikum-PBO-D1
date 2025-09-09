package pertemuandua;
/*  Nama File   : Dosen.java
 *  Deskripsi   : Berisi program utama untuk menguji method Mahasiswa
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Kelas       : D1
 *  Tanggal     : 26 Februari 2025
*/

public class Dosen {
    //Atribut
    private String nip;
    private String nama;
    private String prodi;

    //Method
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = "nip";
        this.nama = "nama";
        this.prodi = "prodi";
    }

    //Selektor
    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    //Mutator
    public void setNip(String nip){
        this.nip =  nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi =  prodi;
    }
}
