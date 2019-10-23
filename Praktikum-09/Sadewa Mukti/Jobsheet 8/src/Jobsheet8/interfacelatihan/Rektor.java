/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet8.interfacelatihan;

/**
 *
 * @author mispan
 */
public class Rektor{

    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana anda bisa cumlaude?..");
        mahasiswa.menjuaraiKompetensi();
        mahasiswa.membuatPublikasiIlmiah();
        System.out.println("----------------------------------------------");
    }
}
