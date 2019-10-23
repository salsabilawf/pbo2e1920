/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstract.TugasInterface;

/**
 *
 * @author USER
 */
public class Profesional implements IPenentuan{

    @Override
    public void pindahGigi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Pindah Gigi secara Pelan");
    }

    @Override
    public void putarKemudi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Memutar kemudi dengan Tenang");
    }

    @Override
    public void pedalGas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Menginjak pedal gas secara perlahan");
    }

    @Override
    public void pedalRem() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Meninjak pedal gas secara hati-hati");
    }
    
}
