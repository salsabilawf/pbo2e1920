/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Tugas;

/**
 *
 * @author asus
 */
public class Kendaraan {
    protected String nama;
    public Kendaraan(String nama) {
        this.nama = nama;
    }
    public void Kendaraan(){
        System.out.println("Ini adalah Kendaraan, nama kendaraannya " + this.nama);
    }
}
