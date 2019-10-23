package interfacelatihan;

public class Program {
    public static void main(String[] args) {
        Rektor rektor = new Rektor();

//        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

//        rektor.beriSertifikatCumlaude(mahasiswaBiasa);
        rektor.beriSertifikatCumlaude(sarjanaCumlaude);
        rektor.beriSertifikatCumlaude(masterCumlaude);

//        rektor.beriSertifikatMawapres(sarjanaCumlaude);
//        rektor.beriSertifikatMawapres(masterCumlaude);
    }
}
