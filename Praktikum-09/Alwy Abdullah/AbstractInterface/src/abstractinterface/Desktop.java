package abstractinterface;

public class Desktop extends Computer implements WiFi{
    int battCapacity;
    
    public WiFi wifiControl(WiFi wifi){
        return wifi;
    }
    
    @Override
    public void sendData(){
        System.out.println("controlling desktop via Wifi...");
    }
}
