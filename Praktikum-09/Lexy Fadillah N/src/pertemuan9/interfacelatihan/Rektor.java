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
public class Rektor extends Mahasiswa{

    public Rektor(String nama) {
        super(nama);
    }
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");
        super.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("--------------------------------------------");
    }
}
