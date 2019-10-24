/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9.tugas;

/**
 *
 * @author Riza Zulfah
 */
public class Program {
    public static void main(String[] args) {
        Sepeda sp = new Sepeda("Sepeda", "Polygon");
        SepedaMotor sm = new SepedaMotor("Sepeda Motor", "Supra 125cc");
        Mobil m = new Mobil("Mobil", "Lamborghini");
        
        
        sp.tambahGear();
        sp.tambahKecepatan();
        sp.info();
        
        sm.tambahGear();
        sm.tambahKecepatan();
        sm.tambahKecepatan();
        sm.tambahKecepatan();
        sm.rem();
        sm.info();
        
        m.tambahGear();
        m.tambahKecepatan();
        m.info();
        m.tambahGear();
        m.tambahKecepatan();
        m.tambahKecepatan();
        m.info();
    }
}
