package pertemuan9.interfacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberi sertifikat cumlaude");
        System.out.println("Selamat ! silakan perkenalkan diri anda..");
        
        mahasiswa.lulus();
        mahasiswa.kuliahDiKampus();
        mahasiswa.meraihIPKtingggi();
        
        System.out.println("-------------------------------------------");
    }
    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberi sertifikat MAWAPRES.");
        System.out.println("Selamat ! Bagaimana anda bisa berprestasi?");
        
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("--------------------------------------------");
    }
}
