package TugasPraktikum09;
public class Program {
    public static void main(String[] args) {
        Orang o1 = new Orang("Kevin");
        Orang o2 = new Orang("Sadewa");
        Orang o3 = new Orang("Al");
        
        Sepeda S = new Sepeda("BMX",o1);
        SepedaMotor SM = new SepedaMotor("KTM",o2);
        Mobil M = new Mobil("Alpat",o3);
        
        S.tambahKecepatan(20);
        S.rem(5);
        S.gear();
        S.info();
        
        SM.tambahKecepatan(50);
        SM.rem(10);
        SM.gear();
        SM.info();
        
        M.tambahKecepatan(80);
        M.rem(40);
        M.gear();
        M.info();
    }
}
