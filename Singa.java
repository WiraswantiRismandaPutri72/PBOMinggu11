package interfacelatihan;

public class Singa extends Binatang implements IKarnivora {
    protected String suara;
    protected String warnaBulu;

    Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis : Karnivora");
        System.out.println("Makanan : Daging");
    }

    public void displayBinatang(){
        System.out.println("Nama : CingaCing");
        System.out.println("Jumlah Kaki : 4");
    }

    public void displayData(){
        System.out.println("Suara : Roaar Roaaar");
        System.out.println("Warna Bulu : Coklat");
    }  
}
