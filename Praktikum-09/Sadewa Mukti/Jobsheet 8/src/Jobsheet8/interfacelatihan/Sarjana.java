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
public class Sarjana extends Mahasiswa implements IBerprestasi{

    public Sarjana(String nama) {
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
    
