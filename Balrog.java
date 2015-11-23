import java.util.Random;
/**
 * Balrog is a demon that gets to attacks twice.
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
    //Constructor for fields
    super (0,0);
    rng = new Random();
    this.hp = rng.nextInt(10)+5;
    this.strength = rng.nextInt(25)+10;
}
public int damage(){
   // The damage method is called twice.
   int dmg = 0;
   dmg += super.damage();
   dmg += super.damage();
   return dmg;
}
}
