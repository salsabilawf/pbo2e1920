/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.Tugas;

/**
 *
 * @author 45U5
 */
public class Program {
    public static void main(String[] args) {
        
        Sepeda spd = new Sepeda();
        System.out.println("------------SEPEDA----------------");
        spd.ubahgear(3);
        spd.tambahKecepatan(50);
        spd.rem(30);
        spd.info();
        System.out.println("===================================");
        SepedaMotor spdm = new SepedaMotor();
        System.out.println("===========SEPEDA MOTOR===========");
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
