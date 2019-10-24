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
public class Program {
    public static void main(String[] args) {   
        Mobil m = new Mobil();
        Sepeda s = new Sepeda();
        SepedaMotor sm = new SepedaMotor();
          
        m.gantiGear();
        m.tambahKecepatan(50);
        m.rem(5);
        m.info();
        
        System.out.println("");
        
        s.gantiGear();
        s.tambahKecepatan(100);
        s.rem(10);
        s.info();
        
        System.out.println("");
        
        sm.gantiGear();
        sm.tambahKecepatan(60);
        sm.rem(20);
        sm.info();
    }
}