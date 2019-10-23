package TugasPraktikum09;
public class Sepeda extends Kendaraan implements IKendaraan{
    private int kecepatan;
    Orang o;
    public Sepeda(String nama, Orang o) {
        super(nama);
        this.o = o;
    }
    @Override
    public void gear() {
        System.out.println("Mengganti Gear");
    }
    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Tambah Kecepatan Sepeda...Mpesss....Mpesss...");
        System.out.println("Kecepatan Sepeda : " + this.kecepatan);
    }
    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
        System.out.println("Pengereman Sepeda Memakai Sendal...");
        System.out.println("Kecepatan Sepeda : " + this.kecepatan);
    }
    public void info(){
        System.out.println("---------------------------------------");
        super.Kendaraan();
        System.out.println("Nama Pengemudi : " + o.nama);
        System.out.println("Kecepatan Saat Ini : " + this.kecepatan);
        System.out.println("---------------------------------------");
    }
}