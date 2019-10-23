package tugas;

public class Main {
    public static void main(String[] args) {
        //sepeda
        Sepeda sepeda = new Sepeda("Wimcycle", "Ban Offroad");
        sepeda.ubahGear(2);
        sepeda.tambahKecepatan(58);
        sepeda.ubahGear(3);
        sepeda.tambahKecepatan(10);
        sepeda.rem(40);
        sepeda.info();

        //sepeda motor
        SepedaMotor sepedaMotor = new SepedaMotor("KLX", "Knalpot Racing");
        sepedaMotor.ubahGear(1);
        sepedaMotor.tambahKecepatan(30);
        sepedaMotor.rem(20);
        sepedaMotor.ubahGear(3);
        sepedaMotor.tambahKecepatan(50);
        sepedaMotor.info();

        //mobil
        Mobil mobil = new Mobil("Fortuner", 5);
        mobil.ubahGear(2);
        mobil.tambahKecepatan(50);
        mobil.rem(10);
        mobil.ubahGear(3);
        mobil.tambahKecepatan(20);
        mobil.info();
    }
}
