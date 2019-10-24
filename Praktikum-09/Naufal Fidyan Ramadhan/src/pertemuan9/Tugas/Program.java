package pertemuan9.Tugas;

public class Program {
    public static void main(String[] args) {
        Sepeda spd = new Sepeda("Sepeda","Family");
        
        spd.tambahGear();
        spd.kurangGear();
        spd.tambahKecepatan();
        spd.rem();
        spd.info();
        
        SepedaMotor spm = new SepedaMotor("Sepeda Motor","Happy");
        spm.tambahGear();
        spm.tambahGear();
        spm.tambahKecepatan();
        spm.kurangGear();
        spm.info();
        
        Mobil mbl = new Mobil("Mobil","Pikep");
        mbl.tambahGear();
        mbl.tambahKecepatan();
        mbl.tambahGear();
        mbl.info();
    }
}
