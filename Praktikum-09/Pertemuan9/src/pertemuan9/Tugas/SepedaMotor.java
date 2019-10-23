package pertemuan9.Tugas;

public class SepedaMotor extends IKendaraan {
    int kecepatan;
    
    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Sepeda motor di gas : \"kecepatan motor nambah\"");
        System.out.println("Kecepatan sepeda motor saat ini : " + this.kecepatan);
    }

    @Override
    public void gantiGear() {
        System.out.println("Gear telah diganti");
    }

    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
        System.out.println("Sepeda motor di rem : \"kecepatan motor ngurang\"");
        System.out.println("Kecepatan sepeda motor saat ini : " + this.kecepatan);
    }
    
    public void info(){
        System.out.println("--------------------------------------");
        namaKendaraan();
        System.out.println("Kecepatan sekarang : " + kecepatan);
        System.out.println("--------------------------------------");
    }
    
    public void namaKendaraan() {
        System.out.println("Supra");
    }
    
}
