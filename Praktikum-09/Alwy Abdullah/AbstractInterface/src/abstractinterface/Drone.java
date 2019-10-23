package abstractinterface;

public class Drone implements WiFi,Radio{
    int maxSpeed;
    int maxAltitude;
    
    public void sendData(){
        System.out.println("Controlling drone via Wifi...");
    }
    
    public void sendSignal(){
        System.out.println("Controlling drone via Radio...");
    }
}
