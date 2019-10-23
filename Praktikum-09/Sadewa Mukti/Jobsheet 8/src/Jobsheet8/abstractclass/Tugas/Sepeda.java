/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet8.abstractclass.Tugas;

/**
 *
 * @author mispan
 */
public class Sepeda implements Kendaraan{
    
    private int gear;
    private int kecepatan;
    private String merk;
    
    
    public Sepeda(String merk){
        this.merk = merk;
    }
    @Override
    public void ubahGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
    }

    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
    }
    @Override
    public void info(){
        System.out.println("Merek Sepeda        : "+merk);
        System.out.println("Ubah Gear           : "+gear);
        System.out.println("Kecepatan           : "+kecepatan+"Km/h");
    }
    
}
