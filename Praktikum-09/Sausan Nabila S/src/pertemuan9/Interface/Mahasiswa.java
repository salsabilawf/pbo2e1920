
package pertemuan9.Interface;

/**
 *
 * @author 45U5
 */
public class Mahasiswa {
    protected String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus");
    }
}
