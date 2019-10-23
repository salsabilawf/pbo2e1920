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
public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi{

    public Sarjana(String nama){
        super(nama);
    }
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku Lebih dari 3,51");
    }
    public void kuliahDikampus(){
        super.kuliahDikampus();
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di Jurnal INTERNASIONAL");
    }
}
