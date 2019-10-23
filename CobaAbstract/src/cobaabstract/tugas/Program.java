/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstract.tugas;

/**
 *
 * @author USER
 */
public class Program {
    public static void main(String[] args){
        Motor motor = new Motor();
        Sepeda sepeda = new Sepeda();
        Mobil mobil = new Mobil();
        
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");
        Orang raka = new Orang("Raka");
        
        ani.kendaraan(motor);
        budi.kendaraan(sepeda);
        raka.kendaraan(mobil);
        
        ani.kendaraanBerjalan(motor);
        budi.kendaraanBerjalan(sepeda);
        raka.kendaraanBerjalan(mobil);
    }
}
