/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9.abstarctclass;

/**
 *
 * @author Riza Zulfah
 */
public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumba = new Ikan();
        
        Orang ani = new Orang("Ani");
        Orang Budi = new Orang("Budi");
        
        ani.peliharaanHewan(kucingKampung);
        Budi.peliharaanHewan(lumba);
        
        ani.ajakPeliharaanJalan();
        Budi.ajakPeliharaanJalan();
    }
}
