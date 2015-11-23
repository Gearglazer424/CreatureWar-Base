import java.util.Random;
/**
 * A generic Demon.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    int hp;
    int strength;
    Random rng;
public CyberDemon(int hp, int strength){
    //Constructor for fields
    super (0,0);
    rng = new Random();
    this.hp = rng.nextInt(20)+1;
    this.strength = rng.nextInt(15)+1;
}
}

