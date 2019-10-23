package pertemuan9.abstractclass;

public abstract class Hewan {
    private int umur;
    Hewan(){
        this.umur = 0;
    }
    
    public void bertambahumur(){
        this.umur += 1;
    }
    public abstract void bergerak();
}
