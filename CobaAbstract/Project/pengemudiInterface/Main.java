/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract.pengemudiInterface;

/**
 *
 * @author EndG
 */
public class Main {
    public static void main(String[] args) {

        PengemudiPro pPro = new PengemudiPro("Endg");
        PengemudiAmateur pAmateur = new PengemudiAmateur("Sikis");
        
        Cetak c = new Cetak();
        c.Cetak(pPro);
        c.Cetak(pAmateur);
        
    }
}
