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
public interface IKendaraan {
public abstract void ubahgear(int gear);
public abstract void tambahKecepatan(int kecepatan); 
public abstract void rem(int kecepatan);
public abstract void info();

}
