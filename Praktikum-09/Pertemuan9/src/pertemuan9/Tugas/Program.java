package pertemuan9.Tugas;

public class Program {
    public static void main(String[] args) {
        
        Sepeda s = new Sepeda();
        SepedaMotor sm = new SepedaMotor();
        Mobil m = new Mobil();
        
        s.gantiGear();
        s.tambahKecepatan(50);
        s.rem(20);
        s.info();
        
        System.out.println("");
        
        m.gantiGear();
        m.tambahKecepatan(60);
        m.rem(10);
        m.info();
        
        System.out.println("");
        
        sm.gantiGear();
        sm.tambahKecepatan(90);
        sm.rem(40);
        sm.info();
    }
}
