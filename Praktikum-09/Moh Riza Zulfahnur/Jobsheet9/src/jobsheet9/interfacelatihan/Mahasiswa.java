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
public class Mahasiswa{
    protected String nama;
    
    public Mahasiswa(String nama){
        this.nama=nama;
    }
    public void kuliahDikampus(){
        System.out.println("Aku Mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah dikampus.");
    }
}
