import java.util.Random;
/**
 * If a runecaster is hit by an attack that deals more than 30 damage, the attack is nullified.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runecaster extends Elf
{
public Runecaster(int hp, int strength)  
    {  
        super("Runecaster", hp, strength);  
    }  
public int damage(){
   // If damage goes above 30, take no damage.
   int dam = super.DealDmg();
   if( dam > 30)
   {
       dam = 0;
    }
    return dam;
}
}
