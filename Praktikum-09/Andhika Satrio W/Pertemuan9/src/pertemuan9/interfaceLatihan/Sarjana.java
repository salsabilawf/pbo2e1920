/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.interfaceLatihan;

/**
 *
 * @author Andhika
 */
public class Sarjana extends Mahasiswa implements ICumlaude,IBerprestasi{

    public Sarjana(String nama){
        super(nama);
    }
    @Override
    public void lulus() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Aku sudah Menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void menjuaraiKompetisi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
    
}
