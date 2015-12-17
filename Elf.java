import java.util.Random;
/**
 * An elf has a 10 % chance to deal double damage.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;  
   
 public class Elf extends Creature  
 {  
     private int percentChance = 10;
     public Elf(String n,int hp, int strength)  
    {  
        super("Elf", hp, strength);  
    } 
public int DealDmg()  
    {  
     int dmg = super.DealDmg();  
     Random rand = new Random();  
        if((rand.nextInt(100) + 1) <= percentChance)  
        {  
            dmg *= 2;  
            System.out.println(" Magic Damage!");  
        }  
          return dmg;  
    }  
 }   
