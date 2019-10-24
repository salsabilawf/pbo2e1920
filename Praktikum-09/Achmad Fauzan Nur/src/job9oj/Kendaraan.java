/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job9oj;

/**
 *
 * @author ojan
 */
public class Kendaraan {
    public String jenisKendaraan;
    
    public Kendaraan(String jenisKendaraan){
        this.jenisKendaraan = jenisKendaraan;
    }
    public void info(){
        System.out.println("Ini adalah "+this.jenisKendaraan);
        System.out.println("Lebih Lengkapnya : ");
        System.out.println("\n-------------------------------------");
    }
}
