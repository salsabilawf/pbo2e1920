package pertemuan9.Tugas;

public class SepedaMotor extends Kendaraan implements iKendaraan{
    public String merk;
    public int gear = 0;
    public int kecepatan = 0;
    
    public SepedaMotor(String jenisKendaraan, String merk){
        super(jenisKendaraan);
        this.merk = merk;
    }

    @Override
    public void tambahGear() {
        if (gear>=0) {
        gear += 1;    
        }
        else{
    }
}

    @Override
    public void kurangGear() {
        if (gear == 0) {
            System.out.println("Gear di 0, tidak bisa di kurangi");
        }
        else{
            gear -=1;
    }
    }
    @Override
    public void tambahKecepatan() {
        kecepatan += 5;
    }

    @Override
    public void rem() {
        if (kecepatan == 0) {
            System.out.println("kecepatan masih di angka 0");
        }
    }
    public void info(){
        super.info();
        System.out.println("Merek       : "+this.merk);
        System.out.println("Gear        : "+this.gear);
        System.out.println("Kecepatan   : "+this.kecepatan);
        System.out.println("-------------------------------------");
    }
    
}
