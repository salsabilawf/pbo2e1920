
package Poli.Percobaan;

/**
 *
 * @author 45U5
 */
public class InternshipEmployee extends Employee {
    private int length;
    
    public InternshipEmployee(String name, int lenght){
        this.length = length;
        this.name = name;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int Length){
        this.length = length;
    }
    
      @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as internship employee for " + length + " month/s\n";
        return info;
    }
    
}

