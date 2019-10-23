package tugas;

public class Sepeda extends Kendaraan implements IKendaraan {
    private String jenisBan;

    Sepeda(String merk, String jenisBan){
        super(merk);
        this.jenisBan =jenisBan;
        this.kecepatan = 0;
        this.gear = 0;
        System.out.println("======Sepeda======");
    }

    @Override
    public void ubahGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
    }

    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
    }

    @Override
    public void info() {
        System.out.println("Merk Sepeda: " + merk);
        System.out.println("Kecepatan Sepeda: " + kecepatan + " m/s");
        System.out.println("Gear Sepeda: " + gear);
        System.out.println("Jenis Ban: " + jenisBan);
    }
}
