import java.util.Random;
/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    int hp;
    int strength;
    Random rng;
public Balrog(int hp, int strength){
    super (0,0);
    rng = new Random();
    this.hp = rng.nextInt(10)+5;
    this.strength = rng.nextInt(25)+10;
}
public int damage(){
   int dmg = 0;
   dmg += super.damage();
   dmg += super.damage();
   return dmg;
}
}
