package tugas;

public class SepedaMotor extends Kendaraan implements IKendaraan {
    private String jenisKnalpot;

    SepedaMotor(String merk, String jenisKnalpot){
        super(merk);
        this.gear = 0;
        this.jenisKnalpot = jenisKnalpot;
        this.kecepatan = 0;
        System.out.println("======Sepeda Motor======");
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
        System.out.println("Merk Sepeda Motor: " + merk);
        System.out.println("Kecepatan Sepeda Motor: " + kecepatan + " m/s");
        System.out.println("Gear Sepeda Motor: " + gear);
        System.out.println("Jenis Knalpot: " + jenisKnalpot);
    }
}
