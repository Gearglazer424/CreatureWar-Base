import java.util.Random;
/**
 * This is the basic structure for all creatures in the game.
 * 
 * @author (Jeremy Hixson) 
 * @version (11/16/2015))
 */
public class Creature

{
   private String name = "Creature";  
     private int minH = 5;  
     private int minStr = 5;  
     private int maxH = 0;  
     private int maxStr = 0;  
     private int currentH = 0;  
     private int currentStr = 0; 
public Creature(String n, int hp, int strength)  
 	{  
 		name = n;  
         SetStats(hp, strength);  
 	}  
        
 	public int DealDmg()  
 	{  
 		Random rand = new Random();  
 		int dmg = rand.nextInt(currentStr) + 1;  
 		  
 		return dmg;  
 	}  
 	public boolean TakeDmg(int dmg)  
 {  
     	currentH -= dmg;  
     	  
     	if(currentH<= 0) return true;  
     	else return false;  
 	}  
 	  
 	private void SetStats(int hpMax, int sMax)  
 	{  
 		 // Reset max variables  
 		// 0 for a param means use default value which is already set  
 		if(hpMax != 0) maxH = 0;  
 		if(sMax != 0) maxStr = 0;  
 		  
 		// Make sure max values are not less than min  
     	if(hpMax < minH && hpMax != 0)  
 		{  
 			System.out.println("ERROR: HP can not be less than 5!");  
 			return;  
 		}  
     	if(maxStr < minStr && maxStr != 0)  
 		{  
 			System.out.println("ERROR: Strength can not be less than 5!");  
 			return;  
 		}  
 		  
 		// Set max values  
 		Random rand = new Random();  
 		if(hpMax >= minH)  
 		{  
 			// Find a new random max until it is not less than min  
 			while (maxH < minH)  
 			{  
 				maxH = rand.nextInt(hpMax) + 1;  
 				//System.out.println(maxHP);  
 			}  
 	  
 		{  
 			// Find a new random max until it is not less than min  
 			while (maxStr < minStr)  
 			{  
 				maxStr = rand.nextInt(sMax) + 1;  
 				//System.out.println(maxStrength);  
 			}  
 		}  
 		  
		// Set the current level of the stats  
		currentH = maxH;  
		currentStr = maxStr;  
	}  
  }  
 	public void DisplayStats()  
 	{  
 		System.out.println(" " + name);  
 		System.out.println("  HP: " + currentH + "/" + maxH);  
 		System.out.println("  Strength: " + currentStr + "/" + maxStr);  
 	}  
 	  
 	// Getters  
 	public int GetMinH()  
 	{  
    	  return minH;  
 	}  
 	public int GetMinStrength()  
 	{  
     	return minStr;  
 }  
 	public int GetMaxHP()  
 	{  
     	return maxH;  
 	}  
 	public int GetMaxStrength()  
 	{  
     	return maxStr;  
 	}  
 	public int GetcurrentH()  
 	{  
     	return currentH;  
 	}  
 	public int GetcurrentStr()  
 	{  
     	return currentStr;  
 	}  
     public String GetName()  
 	{  
 		return name;  
 	}  
      
   }  

