/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.interfacelatihan;

/**
 *
 * @author Vivi Agustina
 */
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("saya REKTOR, memberikan sertifikst cumlaude");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");
        
        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("------------------------------------------");
    }
        public void beriSertifikatMawapres(IBerprestasi mahasiswa){
            System.out.println("saya REKTOR, memberikan sertifikat MAWAPRES");
            System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
            mahasiswa.menjuaraiKompetisi();
            mahasiswa.membuatPublikasiIlmiah();
            
            System.out.println("--------------------------------------");
        }
    }

