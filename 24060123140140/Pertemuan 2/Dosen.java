/*
 * Nama File : Dosen.java
 * Deskripsi : berisis atribut dan method dalam class Dosen
 * Pembuat   : Raditya Saputra/24060123140140
 * Tanggal   : 27 Februari 2025
 */

public class Dosen {
    /*************** Atribut *****************/
    private String nip;
    private String nama;
    private String Prodi;
    /*************** Method *****************/
    // Constructor
    protected Dosen(){
        this.nip = "00000";
        this.nama = "Nama Dosen";
        this.Prodi = "Prodi Dosen";
    }

    protected Dosen(String nip, String nama, String Prodi){
        this.nip = nip;
        this.nama = nama;
        this.Prodi = Prodi;

    }

    // Selector / getter
    protected String getNip(){
        return nip;
    }

    protected String getNama(){
        return nama;
    }

    protected String getProdi(){
        return Prodi;
    }

    // Mutator / Setter
    protected void SetNip(String nip){
        this.nip = nip;
    }

    protected void setNama(String nama){
        this.nama = nama;
    }

    protected void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
    
}

