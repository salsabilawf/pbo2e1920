package pertemuan9.interfacelatihan;

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        Rektor pr = new Rektor();

//        Mahasiswa mb = new Mahasiswa("Charlie");
        Sarjana sc = new Sarjana("Dini");
        PascaSarjana mc = new PascaSarjana("Elok");

//        pr.beriSertifikatCumlaude(mb);
        pr.beriSertifikatCumlaude(sc);
        pr.beriSertifikatCumlaude(mc);

        pr.beriSertifikatMawapres(sc);
        pr.beriSertifikatMawapres(mc);
    }

}
