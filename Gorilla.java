package interfacelatihan;

public class Gorilla implements IKarnivora, IHerbivora{
    protected String suara;
    protected String warnaBulu;
    
    Gorilla(String nama, int jmlKaki, String suara, String warnaBulu){
        super();
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis : Karnivora + Herbivora");
        System.out.println("Makanan : Daging + Tumbuhan");
    }

    public void displayBinatang(){
        System.out.println("Nama : Gulali");
        System.out.println("Jumlah Kaki : 4");
    }

    public void displayData(){
        System.out.println("Suara : Haaum Hauum");
        System.out.println("Warna Bulu : Hitam Manis");
    }
}
