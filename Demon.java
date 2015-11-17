import java.util.Random;
/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    int hp;
    int strength;
    Random rng;
public Demon(int hp, int strength){
    super (0,0);
    rng = new Random();
    this.hp = rng.nextInt(10)+5;
    this.strength = rng.nextInt(25)+10;
}
public int damage(){
    int dam = super.damage();
    rng = new Random();
    if (rng.nextFloat() <= 0.05)
    {
        dam = dam + 50;
    }
        return dam;
}
}