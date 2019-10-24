/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstract.cobainterface;

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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("IPK-ku lebih dari 3,51");
    } 
}