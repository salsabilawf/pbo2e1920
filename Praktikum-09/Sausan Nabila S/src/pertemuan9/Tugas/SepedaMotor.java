/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Tugas;

/**
 *
 * @author 45U5
 */
public class SepedaMotor implements IKendaraan {
 int kecepatan;
 int gear;

    public void ubahgear(int gear) {
       this.gear = gear;
    }

    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
    }

    public void rem(int kecepatan) {
       this.kecepatan -= kecepatan;
    }

    public void info() {
        System.out.println("Kecepata "+ kecepatan);
        System.out.println("Gear Sekarang "+ gear);
    }
    
}



