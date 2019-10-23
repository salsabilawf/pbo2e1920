package pbominggu9.interfacelatihan;

public class Mahasiswa implements ICumlaude{
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku " + nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulus() {
        System.out.println("Aku lulus biasa");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK ku 3.2");
    }
}
