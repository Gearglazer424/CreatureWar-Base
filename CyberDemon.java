import java.util.Random;
/**
 * Write a description of class Elf here.
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
    super (0,0);
    rng = new Random();
    this.hp = rng.nextInt(20)+1;
    this.strength = rng.nextInt(15)+1;
}
}

