package pbominggu9.Tugas;

public class Program {
    public static void main(String[] args) {
        Pengemudi p1 = new Pengemudi("Sadewa", 9);
        Pengemudi p2 = new Pengemudi("Kevin", 12);
        Pengemudi p3 = new Pengemudi("Dharma", 14);
        
        Sepeda s = new Sepeda(p1);
        SepedaMotor sm = new SepedaMotor(p2);
        Mobil m = new Mobil(p3);
        
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
