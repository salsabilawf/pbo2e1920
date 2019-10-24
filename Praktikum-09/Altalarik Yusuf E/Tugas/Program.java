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
public class Program {
    public static void main(String[] args) {
        
        System.out.println("=========== SEPEDA ===========");
        Sepeda sp = new Sepeda();
        
        System.out.println();
        sp.ubahGear(1);
        sp.tambahKecepatan(40);
        sp.rem(20);
        sp.ubahGear(2);
        sp.tambahKecepatan(50);
        sp.info();
        
        System.out.println();
        
        System.out.println("======== SEPEDA MOTOR ========");
        SepedaMotor spm = new SepedaMotor();
        
        spm.ubahGear(1);
        spm.tambahKecepatan(50);
        spm.rem(5);
        spm.ubahGear(2);
        spm.tambahKecepatan(30);
        spm.info();
        
        System.out.println();
        
        System.out.println("============ MOBIL ==========");
        Mobil m = new Mobil();
        
        m.ubahGear(1);
        m.tambahKecepatan(70);
        m.rem(10);
        m.ubahGear(2);
        m.tambahKecepatan(100);
        m.rem(20);
        m.ubahGear(3);
        m.tambahKecepatan(20);
        m.info();
    }
}
