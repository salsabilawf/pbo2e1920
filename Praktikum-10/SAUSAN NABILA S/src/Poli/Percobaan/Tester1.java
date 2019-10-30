
package Poli.Percobaan;

/**
 *
 * @author 45U5
 */
public class Tester1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        
        Employee e;
        Payable p;
        
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
    
}
