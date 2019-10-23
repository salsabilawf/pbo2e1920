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
public class ProgramMain {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan("Sepeda");
        
        Sepeda spd = new Sepeda("Polygon");
        spd.ubahGear(3);        
        spd.tambahKecepatan();
        spd.rem();
        
        System.out.println("-------------------------------------------------");
    
        SepedaMotor sm = new SepedaMotor("Yamaha");
        sm.ubahGear(2);
        sm.tambahKecepatan();
        sm.rem();
        
        System.out.println("----------------------------------------------------------");
        
        Mobil m = new Mobil("Mobilio");
        m.ubahGear(5);
        m.tambahKecepatan();
        m.rem();
    }
}
