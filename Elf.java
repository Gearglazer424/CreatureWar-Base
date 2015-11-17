import java.util.Random;
/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    int hp;
    int strength;
    Random rng;
public Elf(int hp, int strength){
    super (0,0);
    rng = new Random();
    this.hp = rng.nextInt(20)+1;
    this.strength = rng.nextInt(15)+1;
}
public int damage(){
    int dam = super.damage();
    rng = new Random();
    if (rng.nextFloat() <= 0.1)
    {
        dam *= 2;
    }
        return dam;
}
}
