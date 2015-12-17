import java.util.Random;
/**
 * The SheildBearer is a human that takes - 10 damage from all attacks.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SheildBearer extends Human
{
    Random rng;
public SheildBearer(int hp, int strength)  
    {  
        super("SheildBearer", hp, strength);  
    } 
public int damage(){
   //Damage is subtracted by 10
   int dam = super.DealDmg();
   dam = dam - 10;
    return dam;
}
}
