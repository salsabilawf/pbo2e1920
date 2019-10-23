package abstractinterface;

public class TestPhone {
    public static void main(String[] args) {
        MobilePhone noqia = new MobilePhone();
        SmartPhone samsunk = new SmartPhone();
//      Phone sonny = new Phone();
        
        noqia.setPhoneNumber("081234567");
        samsunk.setPhoneNumber("087654321");
        
        noqia.call("081234182");
        samsunk.call("0821374156");
        
        checkPhoneNumber(samsunk);
    }
    
    public static void checkPhoneNumber(Phone phone){
        System.out.println("Nomor dari telpon ini adalah : "
        + phone.getPhoneNumber());
    }
}
