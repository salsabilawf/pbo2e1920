/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author Shirogami
 */
public class Program {
    public static void main(String[] args) {
        Rektor pakRektor=new Rektor();
        
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude=new Sarjana("Dini");
        PascaSarjana maserCumlaude=new PascaSarjana("Elok");
        
        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(maserCumlaude);
    }
}
