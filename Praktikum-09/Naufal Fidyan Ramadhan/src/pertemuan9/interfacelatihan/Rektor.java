package pertemuan9.interfacelatihan;

public class Rektor {
    public void beriSertifikaMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya Rektor, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat , Bagaimana anda bisa berprestasi ?");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("--------------------------------------------");
    }
}
