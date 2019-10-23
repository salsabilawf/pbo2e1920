package abstractinterface;

public class RaspberryPi extends Computer implements WiFi, Radio{
    int rumSocket;
    
    @Override
    public void sendData(){
        System.out.println("Controlling raspberry via Wifi...");
    }
    
    @Override
    public void sendSignal(){
        System.out.println("Controlling Raspberry via Radio...");
    }
}
