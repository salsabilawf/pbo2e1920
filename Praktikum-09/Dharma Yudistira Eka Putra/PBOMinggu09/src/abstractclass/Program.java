package abstractclass;

public class Program {
    public static void main(String[] args) {
        Kucing kucingLampung = new Kucing();
        Ikan lumbaLumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.hewanPeliharaan(kucingLampung);
        budi.hewanPeliharaan(lumbaLumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
