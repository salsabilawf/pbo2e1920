package pbominggu9.Tugas;

public class SepedaMotor extends Kendaraan implements IKendaraan {

    Pengemudi p;
    int kecepatan;

    public SepedaMotor(Pengemudi p) {
        this.p = p;
    }
    
    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Sepeda motor di gas : \"ngengggggggg......\"");
        System.out.println("Kecepatan sepeda motor saat ini : " + this.kecepatan);
    }

    @Override
    public void gantiGear() {
        System.out.println("Gear telah diganti");
    }

    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
        System.out.println("Sepeda motor di rem : \"ciiiiiiiiiiiit\"");
        System.out.println("Kecepatan sepeda motor saat ini : " + this.kecepatan);
    }
    
    public void info(){
        System.out.println("--------------------------------------");
        System.out.println("Nama saya : " + p.nama);
        System.out.println("Umur saya : " + p.umur);
        System.out.println("Saya suka mengendarai Sepeda Motor :)");
        namaKendaraan();
        System.out.println("Kecepatan sekarang : " + kecepatan);
        System.out.println("--------------------------------------");
    }
    
    @Override
    public void namaKendaraan() {
        System.out.println("Motor Ducati ini guysssss Mahal!!!!");
    }
    
}
