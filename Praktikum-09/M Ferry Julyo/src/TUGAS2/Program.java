/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS2;

/**
 *
 * @author Shirogami
 */
public class Program {
    public static void main(String[] args) {

        Sepeda spd = new Sepeda();
        System.out.println("=============SEPEDA=============");
        spd.ubahgear(7); 
        spd.tambahKecepatan(90); 
        spd.rem(30);
        spd.info();

        System.out.println("===================================");
        SepedaMotor spdm = new SepedaMotor(); 
        System.out.println("===========SEPEDA MOTOR===========");
        spdm.ubahgear(4); 
        spdm.tambahKecepatan(70); 
        spdm.rem(10);
        spdm.info();

        System.out.println("===================================");
        Mobil mbl = new Mobil(); System.out.println("=============Mobil==========="); 
        mbl.ubahgear(5);
        mbl.tambahKecepatan(150); mbl.rem(50);
        mbl.info();
}
}

