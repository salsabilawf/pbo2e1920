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
public class Cetak {
    public void Cetak(Pengemudi x){
        x.getNama();
        x.pindahGigi();
        x.putarKemudi();
        x.injakPedalGas();
        x.injakPedalRem();
        System.out.println("---------------------------------------");
    }
}
