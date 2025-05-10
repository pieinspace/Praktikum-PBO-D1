package pertemuandua;

public class MataKuliah {
    //Atribut
    private String idMatKul;
    private String nama;
    private int sks;

    //Method
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //Selektor 
    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    //Mutator
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
