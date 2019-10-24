package pertemuan9.Tugas;

public class Mobil extends IKendaraan{
    int kecepatan;

    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Mobil di gas : \"kecepatan mobil bertambah\"");
        System.out.println("Kecepatan mobil saat ini : " + this.kecepatan);
    }

    @Override
    public void gantiGear() {   
        System.out.println("Gear telah diganti");
    }

    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
        System.out.println("Mobil di rem : \"kecepatan mobil berkurang\"");
        System.out.println("Kecepatan mobil saat ini : " + this.kecepatan);
    }
    
    public void info(){
        System.out.println("--------------------------------------");
        namaKendaraan();
        System.out.println("Kecepatan sekarang : " + kecepatan);
        System.out.println("--------------------------------------");
    }
    
    public void namaKendaraan() {
        System.out.println("Kijang");
    }
}
