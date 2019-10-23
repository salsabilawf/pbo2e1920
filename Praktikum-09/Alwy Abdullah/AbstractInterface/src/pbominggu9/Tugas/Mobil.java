package pbominggu9.Tugas;

public class Mobil extends Kendaraan implements IKendaraan {
    
    Pengemudi p;
    int kecepatan;

    public Mobil(Pengemudi p) {
        this.p = p;
    }
    
    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Mobil di gas : \"ngengggggggg......\"");
        System.out.println("Kecepatan mobil saat ini : " + this.kecepatan);
    }

    @Override
    public void gantiGear() {
        System.out.println("Gear telah diganti");
    }

    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
        System.out.println("Mobil di rem : \"ciiiiiiiiiiiit\"");
        System.out.println("Kecepatan mobil saat ini : " + this.kecepatan);
    }
    
    public void info(){
        System.out.println("--------------------------------------");
        System.out.println("Nama saya : " + p.nama);
        System.out.println("Umur saya : " + p.umur);
        System.out.println("Saya suka mengendarai Mobil :)");
        namaKendaraan();
        System.out.println("Kecepatan sekarang : " + kecepatan);
        System.out.println("--------------------------------------");
    }
    
    @Override
    public void namaKendaraan() {
        System.out.println("Mobil Lamborghini ini guysssss Mahal!!!!");
    }
    
}
