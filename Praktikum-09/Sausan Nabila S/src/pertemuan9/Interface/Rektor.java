/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Interface;

/**
 *
 * @author 45U5
 */
public class Rektor 
{
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("saya rektor, memberikan sertifikat cumlaude.");
        System.out.println("slmt, silahkan perkenalkan diri anda..");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("--------------------------------------------");
    }
    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("saya rektor, memberikan sertifikat mawapres");
        System.out.println("slmt, bgmn anda bs brprestasi?");
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        System.out.println("---------------------------------------------");
    }
}
