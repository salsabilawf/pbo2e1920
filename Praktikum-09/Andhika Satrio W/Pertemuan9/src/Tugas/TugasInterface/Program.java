/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.TugasInterface;

/**
*
* @author Andhika
*/
public class Program {
public static void main(String[] args) {

    Sepeda spd = new Sepeda();
    System.out.println("------------SEPEDA----------------");
    spd.ubahgear(10); 
    spd.tambahKecepatan(100); 
    spd.rem(50);
    spd.info();

    System.out.println("===================================");
    SepedaMotor spdm = new SepedaMotor(); 
    System.out.println("===========SEPEDAMOTOR===========");
    spdm.ubahgear(5); 
    spdm.tambahKecepatan(10); 
    spdm.rem(5);
    spdm.info();

    System.out.println("===================================");
    Mobil mbl = new Mobil(); 
    System.out.println("=============Mobil==========="); 
    mbl.ubahgear(20);
    mbl.tambahKecepatan(50); 
    mbl.rem(10);
    mbl.info();
}
}

