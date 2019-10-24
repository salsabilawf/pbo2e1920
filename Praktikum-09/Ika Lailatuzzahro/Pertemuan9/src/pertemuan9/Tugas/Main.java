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
public class Main {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan("fihfihqi");
        
        Sepeda s = new Sepeda("poligon");
        s.ubahGear(2);
        s.tambahKecepatan();
        s.rem();
        
        System.out.println("----------------------------------------------------------");
        
        SepedaMotor sm = new SepedaMotor("Honda");
        sm.ubahGear(1);
        sm.tambahKecepatan();
        sm.rem();
        
        System.out.println("----------------------------------------------------------");
        
        Mobil m = new Mobil("Honda Jazz");
        m.ubahGear(3);
        m.tambahKecepatan();
        m.rem();
    }
}
