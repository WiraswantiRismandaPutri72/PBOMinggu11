package interfacelatihan;

public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi{
    public Sarjana(String nama){
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIilmiah() {
        System.out.println("Saya telah menerbitkan artikel di jurnal NASIONAL");
    }
}