/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.interfacelatihan;

/**
 *
 * @author asus
 */
public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor("Dini");
        Rektor sirRektor = new Rektor("Elok");

        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        sirRektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
