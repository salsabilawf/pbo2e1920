package abstractinterface;

public class SmartPhone extends Phone{
    public String ipAddress;
    
    @Override
    public void call(String callNumber){
        System.out.println("SmartPhone melakukan panggilan ke " + callNumber);
    }
    
    @Override
    public void endCall(){
        System.out.println("Smartphone mengakhiri panggilan");
    }
    
    public void connectToNetwork(){
        System.out.println("Smartphone melakukan koneksi ke jaringan");
    }
}
