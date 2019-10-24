/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.abstractclass;

/**
 *
 * @author USER
 */
public class Program {
    public static void main(String[] args) {
        Kucing kucingBarbar = new Kucing();
        Ikan teri = new Ikan();
        
        Orang ani = new Orang("Cah Ayu");
        Orang budi = new Orang("Cah Ganteng");
        
        ani.peliharaanHewan(kucingBarbar);
        budi.peliharaanHewan(teri);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
