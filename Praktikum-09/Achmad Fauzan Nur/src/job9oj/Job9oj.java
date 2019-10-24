/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job9oj;

/**
 *
 * @author ojan
 */


public class Job9oj {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Sepeda sp = new Sepeda("Sepeda", "ontel");
        SepedaMotor sm = new SepedaMotor("Sepeda Motor", "vespa");
        Mobil m = new Mobil("Mobil", "pajero");
        
        
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

    
