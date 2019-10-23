/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract.PengemudiAbstract;

import Abstract.pengemudiInterface.*;

/**
 *
 * @author EndG
 */
public class PengemudiAmateur extends Pengemudi{

    public PengemudiAmateur(String nama) {
        super(nama);
    }

    @Override
    public void pindahGigi() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cara memindahkan gigi : Acak");
    }

    @Override
    public void putarKemudi() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cara putar kemudi     : Kurang menaati aturan yang ada");
    }

    @Override
    public void injakPedalGas() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cara injak pedal gas  : Asal ");
    }

    @Override
    public void injakPedalRem() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Cara injak pedal rem  : Asal");
    }
    
}
