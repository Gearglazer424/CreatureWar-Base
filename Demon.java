import java.util.Random;
/**
 * Demons have a 5% chance to deal + 50 damage.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
  public class Demon extends Creature  
 {  
    private int percentChance = 5;  
      
    public Demon(int hp, int strength)  
    {  
        super("Demon", hp, strength);  
    }  
    
    
      public Demon(String n,int hp, int strength)  
    {  
        super("Demon", hp, strength);  
    }  
    
    public int DealDmg()  
    {  
        int dmg = super.DealDmg();  
          
        Random rand = new Random();  
        if((rand.nextInt(100) + 1) <= percentChance)  
        {  
            dmg += 50;  
            System.out.println(" Magic Damage!");  
        }  
          
        return dmg;  
 	}
}