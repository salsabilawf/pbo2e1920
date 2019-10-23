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

public abstract class Pengemudi {
    protected String nama;
    
    public Pengemudi(String nama){
        this.nama = nama;
        
    }
    
    public void getNama(){
        System.out.println("Nama Pengemudi : " + this.nama);
    }
         public abstract void pindahGigi();
         public abstract void putarKemudi();
         public abstract void injakPedalGas();
         public abstract void injakPedalRem();
}

