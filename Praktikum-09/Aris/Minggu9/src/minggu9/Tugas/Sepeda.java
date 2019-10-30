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
public class Sepeda extends Kendaraan implements IKendaraan {

 
    int kecepatan;



    @Override
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Sepeda di pancal: \"Wushhhh.....\"");
        System.out.println("Kecepatan sepeda sekarang: " + this.kecepatan);
    }

    @Override
    public void gantiGear() {
        System.out.println("Gear diganti");
    }

    @Override
    public void rem(int kecepatan) {
        this.kecepatan -= kecepatan;
        System.out.println("Sepeda di rem: \"Ngikkkkkkk......\"");
        System.out.println("Kecepatan sepeda sekarang : " + this.kecepatan);
    }

    public void info() {
        System.out.println("--------------------------------------");
        namaKendaraan();
        System.out.println("Kecepatan sekarang : " + kecepatan);
        System.out.println("--------------------------------------");

    }

    @Override
    public void namaKendaraan() {
        System.out.println("Sepeda Untoo Klasikk!!!");
    }

}

