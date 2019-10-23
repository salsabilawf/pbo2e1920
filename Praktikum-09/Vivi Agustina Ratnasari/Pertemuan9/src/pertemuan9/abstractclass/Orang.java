/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.abstractclass;

/**
 *
 * @author Vivi Agustina
 */
public class Orang {
    private String nama;
    private Hewan hewanpeliharaan;
    
    public Orang(String nama){
        this.nama=nama;
    }
    public void peliharaHewan(Hewan hewanPeliharaan){
        this.hewanpeliharaan=hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku: "+this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanpeliharaan.bergerak();
        System.out.println("-----------------------------------------p");
    }
}
