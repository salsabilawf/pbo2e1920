/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.interfacelatihan;

/**
 *
 * @author USER
 */
public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        
        //Mahasiswa mahasiswaBiasa = new Mahasiswa("charlie");
        Sarjana sarjanaCumlaude = new Sarjana("dini");
        PascaSarjana masterCumlaude = new PascaSarjana("elok");
        
       
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        //pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
        System.out.println("----------------------------");
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
