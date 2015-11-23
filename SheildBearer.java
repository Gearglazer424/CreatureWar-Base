import java.util.Random;
/**
 * The SheildBearer is a human that takes - 10 damage from all attacks.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SheildBearer extends Human
{
    int hp;
    int strength;
    Random rng;
public SheildBearer(int hp, int strength){
    //Constructor for fields
    super (0,0);
    rng = new Random();
    this.hp = rng.nextInt(20)+10;
    this.strength = rng.nextInt(5)+10;
}
public int damage(){
   //Damage is subtracted by 10
   int dam = super.damage();
   dam = dam - 10;
    return dam;
}
}
