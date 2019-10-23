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
public class PascaSarjana extends Mahasiswa implements IBerprestasi{

    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void menjuaraiKompetensi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }

    

   
    
    
    
}
//public PascaSarjana(String nama){
//        super(nama);
//    }
//    @Override
//    public void lulus() {
//        System.out.println("Aku sudah menyelesaikan TESIS");
//    }
//
//    @Override
//    public void meraihIPKTinggi() {
//        System.out.println("IPK-Ku lebih dari 3,7");
//    }
//    @Override
//    public void kuliahDiSini() {
//        System.out.println("Aku Mahasiswa, namaku " + this.nama);
//        System.out.println("Aku berkuliah di kampus.");
//    }
