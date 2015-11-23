import java.util.Random;
/**
 * If a runecaster is hit by an attack that deals more than 30 damage, the attack is nullified.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runecaster extends Elf
{
    int hp;
    int strength;
    Random rng;
public Runecaster(int hp, int strength){
    //Constructor for fields
    super (0,0);
    rng = new Random();
    this.hp = rng.nextInt(20)+1;
    this.strength = rng.nextInt(15)+1;
}
public int damage(){
   // If damage goes above 30, take no damage.
   int dam = super.damage();
   if( dam > 30)
   {
       dam = 0;
    }
    return dam;
}
}
