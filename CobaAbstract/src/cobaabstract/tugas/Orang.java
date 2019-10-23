/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstract.tugas;

import cobaabstract.cobainterface.ICumlaude;

/**
 *
 * @author USER
 */
public class Orang {
    private String nama;
    private Kendaraan kendaraan;
    
    public Orang(String nama){
        this.nama = nama;
    }
    public void kendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    
    public void beriSertifikatCumlaude(){
        
    }
    
    public void kendaraanBerjalan(IKecepatan kecepatan){
        System.out.println("Namaku " + this.nama);
        this.kendaraan.mengendarai();
        this.kendaraan.tambahKecepatan();
        this.kendaraan.rem();
        kecepatan.maxKecepatan();
        System.out.println("-----------------------------------------");
    }
}
