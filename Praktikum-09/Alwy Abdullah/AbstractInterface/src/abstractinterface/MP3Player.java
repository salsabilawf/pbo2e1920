package abstractinterface;

public class MP3Player implements ChargeAble{
    
    @Override
    public void doCharge(){
        System.out.println("MP3 player is charging");
    }
}
