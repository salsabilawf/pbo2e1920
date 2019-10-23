/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan2;

/**
 *
 * @author Shirogami
 */
public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi{

    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("AKu sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3.51");
    }

    @Override
    public void menjuaraiKompetisi() {
        
    }

    @Override
    public void membuatPublikasiIlmiah() {
        
    }

    @Override
    public void menjuaraiKompetisiNasional() {
       System.out.println("Saya telah menjuarai kompetisi NASIONAL"); 
    }

    @Override
    public void membuatPublikasiIlmiahNasional() {
        System.out.println("Saya telah menerbitkan artikel di jurnal NASIONAL");
    }
    
}
