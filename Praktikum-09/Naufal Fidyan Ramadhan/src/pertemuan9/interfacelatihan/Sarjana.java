package pertemuan9.interfacelatihan;

public class Sarjana extends Mahasiswa implements ICumlaude{

    
    public Sarjana(String nama){
        super(nama);
    }
    
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTInggi() {
        System.out.println("IPKku lebih dari 3,51");
    }
    
}
