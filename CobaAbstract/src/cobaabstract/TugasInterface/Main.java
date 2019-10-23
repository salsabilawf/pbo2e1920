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
public class Main {
    public static void main(String[] args) {
        Amatir a = new Amatir();
        Profesional p = new Profesional();
        
        a.pindahGigi();
        a.putarKemudi();
        a.pedalGas();
        a.pedalRem();
        
        System.out.println("====================================================");
        
        p.pindahGigi();
        p.putarKemudi();
        p.pedalGas();
        p.pedalRem();
    }
}
