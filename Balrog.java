import java.util.Random;
/**
 * Balrog is a demon that gets to attacks twice.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon  
 {  
 	public Balrog(int hp, int strength)  
 	{  
     	super("Balrog", hp, strength);  
 	}  
 	
 	public Balrog(String name, int hp, int strength)  
 	{  
     	super(name, hp, strength);  
 	}  
 	  
 	public int DealDmg()  
 	{  
     	int dmg1 = super.DealDmg();  
     	System.out.println(" Attack 1: " + dmg1);  
     	  
     	int dmg2 = super.DealDmg();  
     	System.out.println(" Attack 2: " + dmg2);  
     	  
     	return dmg1 + dmg2;  
 	}  
 }   
