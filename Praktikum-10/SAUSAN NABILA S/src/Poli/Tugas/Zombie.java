
package Poli.Tugas;

/**
 *
 * @author 45U5
 */
abstract public class Zombie implements IDestroyable{
    protected int health, level;
    
    abstract public void heal();
    @Override
    abstract public void destroyed();
    public String getZombieInfo() {
        return "Health = " + this.health + "\n"
        + "Level = " + this.level + "\n";
    };
}
