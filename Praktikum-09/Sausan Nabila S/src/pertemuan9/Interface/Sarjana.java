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
public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi {

    public Sarjana(String nama){
        super(nama);
    }
    @Override
    public void lulus() {
        System.out.println("aqu suda menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dr 3,51");
    }
   public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
    
}
