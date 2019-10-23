package pertemuan9.Tugas;

public class Kendaraan {
    public String jenisKendaraan;
    
    public Kendaraan(String jenisKendaraan){
        this.jenisKendaraan = jenisKendaraan;
    }
    
    public void info(){
        System.out.println("Ini adalah jenis kendaraan : "+jenisKendaraan);
        System.out.println("---------------------------------------------");
    }
}
