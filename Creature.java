import java.util.Random;
/**
 * This is the basic structure for all creatures in the game.
 * 
 * @author (Jeremy Hixson) 
 * @version (11/16/2015))
 */
public class Creature

{
   private int hp;
   private int strength;
   Random rng;
   public Creature(int hp, int strength){
   //Constructor for fields
    this.hp=hp;
    this.strength=strength;
   }
    
   public int damage(){
   // Create method that calculates damage
      rng = new Random();
      int damage = rng.nextInt(strength)+1;  
      return damage; 
    }
    
}
