package TugasPraktikum09;
public class Kendaraan {
    protected String nama;
    public Kendaraan(String nama) {
        this.nama = nama;
    }
    public void Kendaraan(){
        System.out.println("Ini adalah Kendaraan, namanya " + this.nama);
    }
}