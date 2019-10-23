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
public class Program {
    public static void main(String[] args) {
        
        System.out.println("===================Sepeda===================");
        Sepeda spd = new Sepeda("Polygon");
        spd.ubahGear(2);
        spd.tambahKecepatan(60);
        spd.rem(20);
        spd.info();
        
        System.out.println("================Sepeda Motor================");
        SepedaMotor sm = new SepedaMotor("Scoopy");
        sm.ubahGear(4);
        sm.tambahKecepatan(100);
        sm.rem(35);
        sm.info();
        
        System.out.println("===================Mobil===================");
        Mobil m = new Mobil("Xenia");
        m.ubahGear(5);
        m.tambahKecepatan(140);
        m.rem(60);
        m.info();
        
    }
}
