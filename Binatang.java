package interfacelatihan;

public class Binatang {
    private String nama;
    private int jmlKaki;

    Binatang(String nama, int jmlKaki){
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }

    public int getKaki(){
        return jmlKaki;
    }

    public void displayBinatang(){
        System.out.println("Nama    : " + this.nama);
        System.out.println("Jumlah Kaki : " + this.jmlKaki);
    }
}
