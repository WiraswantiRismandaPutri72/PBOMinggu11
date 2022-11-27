package interfacelatihan;

public class Keledai extends Binatang implements IHerbivora{
    protected String suara;
    protected String warnaBulu;

    Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis : Herbivora");
        System.out.println("Makanan : Tumbuhan");
    }
    
    public void displayBinatang(){
        System.out.println("Nama : Keledai");
        System.out.println("Jumlah Kaki : 4");
    }

    public void displayData(){
        System.out.println("Suara : Hehehehe");
        System.out.println("Warna Bulu : Abu-Abu");
    }
}
