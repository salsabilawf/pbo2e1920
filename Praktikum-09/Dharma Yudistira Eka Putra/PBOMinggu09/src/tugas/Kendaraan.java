package tugas;

public abstract class Kendaraan {
    String merk;
    int kecepatan;
    int gear;

    Kendaraan(String merk){
        this.merk = merk;
    }

    public abstract void info();
}
