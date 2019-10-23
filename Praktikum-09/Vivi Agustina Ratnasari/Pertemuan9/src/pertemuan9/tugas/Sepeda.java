/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.tugas;

/**
 *
 * @author Vivi Agustina
 */
public class Sepeda extends Kendaraan implements IKemampuan{

        protected int gear;
        protected int kecepatan=0;
          
    public Sepeda(String merk) {
        super(merk);
        System.out.println("Merk Sepeda adalah: "+merk);
    }

    @Override
    public void ubahGear(int gear) {
        this.gear = gear;
        System.out.println("Ganti gear: "+gear);
    }

    @Override
    public void tambahKecepatan() {
        
        kecepatan += 1;
        System.out.println("Kecepatan: "+kecepatan);
    }
    @Override
    public void rem() {
        kecepatan -= 1;
        System.out.println("Rem: "+kecepatan);
    }  
}
