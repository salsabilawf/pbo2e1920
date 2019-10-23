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
public class Main {
    public static void main(String[] args) {
        Abstrak a1 = new Abstrak("Dini") {};
        Abstrak a2 = new Abstrak("Elok") {};
        Abstrak a3 = new Abstrak("Charlie") {};
        
        Sepeda S = new Sepeda("Ontel",a1);
        SepedaMotor SM = new SepedaMotor("Supra Balap",a2);
        Mobil M = new Mobil("Angkot BMW",a3);
        
        S.tambahKecepatan(30);
        S.rem(10);
        S.gear();
        S.info();
        
        SM.tambahKecepatan(20);
        SM.rem(10);
        SM.gear();
        SM.info();
        
        M.tambahKecepatan(100);
        M.rem(50);
        M.gear();
        M.info();
    }

}
