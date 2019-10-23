/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9.interfacelatihan;

/**
 *
 * @author Riza Zulfah
 */
public class Program {
    public static void main(String[] args) {
    Rektor r = new Rektor();
    
    Mahasiswa biasa = new Mahasiswa("Charlie");
    Sarjana sarjana = new Sarjana("Dini");
    PascaSarjana master = new PascaSarjana("Elok");
    
   // r.bersertifikatCumlaude(sarjana);
   //  r.bersertifikatCumlaude(master);
    
    r.bersertifikatMawapres(sarjana);
    r.bersertifikatMawapres(master);
    }
    
}
