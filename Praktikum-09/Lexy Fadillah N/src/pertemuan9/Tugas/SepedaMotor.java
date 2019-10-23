/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Tugas;

/**
 *
 * @author asus
 */
public class SepedaMotor extends Kendaraan implements IKendaraan {
    private int kecepatan;
    Abstrak o;
    public SepedaMotor(String nama, Abstrak o) {
        super(nama);
        this.o = o;
    }
    @Override
    public void gear() {
        System.out.println("Mengganti Gear");
    }
    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Tambah Kecepatan Sepeda Motor...Mpesss....Mpesss...");
        System.out.println("kecepatan Sepeda Motor : " + this.kecepatan);
    }
    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
        System.out.println("Pengeraman Sepeda Motor...ciiiit....ciiiit...");
        System.out.println("Kecepatan Sepeda Motor : " + this.kecepatan);
    }
    public void info(){
        System.out.println("---------------------------------------");
        super.Kendaraan();
        System.out.println("Nama Pengemudi : " + o.nama);
        System.out.println("Kecepatan Saat Ini : " + this.kecepatan);
        System.out.println("---------------------------------------");
    }
}
