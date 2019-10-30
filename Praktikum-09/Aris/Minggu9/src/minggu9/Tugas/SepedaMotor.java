/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9.Tugas;

/**
 *
 * @author Acer
 */
public class SepedaMotor extends Kendaraan implements IKendaraan {
    int kecepatan;

 
    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Sepeda motor di gas: \"Breemmmmm......\"");
        System.out.println("Kecepatan sepeda motor saat ini : " + this.kecepatan);
    }

    @Override
    public void gantiGear() {
        System.out.println("Gear telah diganti");
    }

    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
        System.out.println("Sepeda motor di rem : \"ciiiiiiiiiiiit\"");
        System.out.println("Kecepatan sepeda motor saat ini : " + this.kecepatan);
    }
    
    public void info(){
        System.out.println("--------------------------------------");
        namaKendaraan();
        System.out.println("Kecepatan sekarang : " + kecepatan);
        System.out.println("--------------------------------------");
    }
    
    @Override
    public void namaKendaraan() {
        System.out.println("Motor Honda C70!");
    }
    
}

    

