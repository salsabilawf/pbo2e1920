/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract.PengemudiAbstract;



/**
 *
 * @author EndG
 */
public class PengemudiPro extends Pengemudi{
    public PengemudiPro(String nama) {
        super(nama);
    }

    @Override
    public void pindahGigi() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cara memindahkan gigi : Berurutan dan halus");
    }

    @Override
    public void putarKemudi() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cara putar kemudi     : Taat aturan dan undang-undang");
    }

    @Override
    public void injakPedalGas() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cara injak pedal gas  : Berekualitas");
    }

    @Override
    public void injakPedalRem() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cara injak pedal rem  : Mulus");
    }
}
