/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9.interfacelatihan;

/**
 *
 * @author USER
 */
public class Sarjana extends Mahasiswa implements ICumlaude{

    public Sarjana(String nama){
        super(nama);
    }
    @Override
    public void lulus() {
        System.out.println("aqu suda menyelesaikan skripsi");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dr 3,51");
    }
    
}
