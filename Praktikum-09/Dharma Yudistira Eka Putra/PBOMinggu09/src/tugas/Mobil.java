package tugas;

public class Mobil extends Kendaraan implements IKendaraan {
    private int jumlahTempatDuduk;

    Mobil(String merk, int jumlahTempatDuduk) {
        super(merk);
        this.jumlahTempatDuduk = jumlahTempatDuduk;
        this.gear = 0;
        this.kecepatan = 0;
        System.out.println("======Mobil======");
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
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Kecepatan Mobil: " + kecepatan + " m/s");
        System.out.println("Gear Mobil: " + gear);
        System.out.println("Jumlah Tempat Duduk Mobil " + jumlahTempatDuduk);
    }
}
