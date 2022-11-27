package interfacelatihan;

public class Rektor{
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda.");

        Mahasiswa mhs = new Mahasiswa("Dini");

        mhs.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("---------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi PascaSarjana){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi ?");

        PascaSarjana.menjuaraiKompetisi();
        PascaSarjana.membuatPublikasiIilmiah();

        System.out.println("---------------------------------------------");
    }
}
