/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9.Tugas;

/**
 *
 * @author Altalarikyusuf
 */
public class Sepeda implements IKendaraan {

    private int kecepatan;
    private int gear;

    @Override
    public void ubahGear(int gear) {
        this.gear = gear;
        System.out.println("Gear sepeda : "+ gear);
    }

    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Tambah kecepatan : "+ kecepatan);
    }

    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
        System.out.println("Kurangi kecepatan : "+ kecepatan);
    }

    @Override
    public void info() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Gear saat ini : " + gear);
        System.out.println("Kecepatan saat ini : " + kecepatan);
    }
    
}
