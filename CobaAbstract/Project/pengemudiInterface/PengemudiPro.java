/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract.pengemudiInterface;

/**
 *
 * @author EndG
 */
public class PengemudiPro extends Pengemudi implements Penilaian{
    public PengemudiPro(String nama) {
        super(nama);
    }

    @Override
    public void pindahGigi() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Berurutan dan halus");
    }

    @Override
    public void putarKemudi() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Taat aturan dan undang-undang");
    }

    @Override
    public void injakPedalGas() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Berekualitas");
    }

    @Override
    public void injakPedalRem() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Mulus");
    }
}
