package pertemuan9.Tugas;

public class Sepeda extends IKendaraan {

    int kecepatan;

    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Sepeda di pancal : \"kecepatan sepeda bertambah\"");
        System.out.println("Kecepatan sepeda saat ini : " + this.kecepatan);
    }

    @Override
    public void gantiGear() {
        System.out.println("Gear telah diganti");
    }

    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
        System.out.println("Sepeda di rem \"kecepatan sepeda berkurang\"");
        System.out.println("Kecepatan sepeda saat ini : " + this.kecepatan);
    }

    public void info() {
        System.out.println("--------------------------------------");
        namaKendaraan();
        System.out.println("Kecepatan sekarang : " + kecepatan);
        System.out.println("--------------------------------------");

    }

    public void namaKendaraan() {
        System.out.println("Sepeda Lowrider");
    }

}
