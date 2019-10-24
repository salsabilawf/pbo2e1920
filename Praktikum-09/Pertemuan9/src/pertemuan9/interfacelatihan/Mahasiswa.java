package pertemuan9.interfacelatihan;

public abstract class Mahasiswa implements ICumlaude{
    protected String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }


    @Override
    public void kuliahDiKampus() {
        System.out.println("Nama ku :" + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
    public abstract void lulus();
    public abstract void meraihIPKtingggi();
    

}
