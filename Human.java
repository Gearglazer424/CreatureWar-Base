import java.util.Random;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    int hp;
    int strength;
    Random rng;
public Human(int hp, int strength){
    super (0,0);
    rng = new Random();
    this.hp = rng.nextInt(25)+5;
    this.strength = rng.nextInt(13)+5;
}
}
