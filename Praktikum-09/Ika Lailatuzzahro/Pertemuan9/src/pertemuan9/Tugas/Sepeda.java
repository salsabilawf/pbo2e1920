/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Tugas;

/**
 *
 * @author ELA-PC
 */
public class Sepeda extends Kendaraan implements IKemampuan {

    protected int gear,kecepatan = 0;
    
    public Sepeda(String merk){
        super(merk);
        System.out.println("Merk Sepeda: "+merk);
    }
    @Override
    public void ubahGear(int gear) {
       this.gear=gear;
       System.out.println("Ganti Gear: "+gear);
    }

    @Override
    public void tambahKecepatan() {
        kecepatan+=1;
        System.out.println("kecepatan: "+kecepatan);
    }

    @Override
    public void rem() {
    kecepatan-=1;
    System.out.println("Rem: "+kecepatan);
    }
    
}
