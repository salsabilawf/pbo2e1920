/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstract.tugas;

/**
 *
 * @author macair4
 */
public class Mobil extends Kendaraan implements IKecepatan{

    @Override
    public void maxKecepatan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Max Kecepatan 280km/jam");
    }
    
    @Override
    public void mengendarai() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Mengendarai mobil wus wus");
    }
    
    public void tambahKecepatan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tambah 50");
    }
    
    public void rem() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("kurang 20");
    }
    
}
