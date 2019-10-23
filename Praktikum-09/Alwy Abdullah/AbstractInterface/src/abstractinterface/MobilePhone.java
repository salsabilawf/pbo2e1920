package abstractinterface;

public class MobilePhone extends Phone{
    
    @Override
    public void call(String callNumber){
        System.out.println("MobilePhone melakukan panggilan ke: " + callNumber);
    }
    
    @Override
    public void endCall(){
        System.out.println("Mobilephone mengakhiri panggilan");
    }
}
