/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstract.tugas;

/**
 *
 * @author USER
 */
public abstract class Kendaraan {
    private int gear;
    private int tambahKecepatan;
    private int rem;
    
    protected Kendaraan(){
        this.gear = 0;
    }
    
    public abstract void tambahKecepatan();
    
    public abstract void rem();
    
    public abstract void mengendarai();
}
