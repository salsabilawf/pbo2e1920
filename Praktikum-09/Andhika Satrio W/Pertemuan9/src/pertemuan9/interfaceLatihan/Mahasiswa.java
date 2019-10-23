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
public class Mahasiswa {
    private String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    public void kuliahDiKampus(){
        System.out.println("Aku Mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di Kampus.");
    }
}
