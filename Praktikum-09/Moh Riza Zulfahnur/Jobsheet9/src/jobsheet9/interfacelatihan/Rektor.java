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
public class Rektor{
    public void bersertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat ! Silahkan perkenalkan diri Anda..");
        mahasiswa.kuliahDikampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("-----------------------------------------------");
        
    }
    public void bersertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat ! Bagaimana Anda Bisa berprestasi ?");
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        System.out.println("-----------------------------------------------");
    }
}
