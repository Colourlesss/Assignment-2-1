
/**
 * Write a description of class D6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class D6
{
   public static void main(String[] args){
       for(int i = 1;i<=10;i++){
       System.out.println("Dice roll " + i + " generates: " + (int)(Math.random() * 6 + 1));
    }
   }
}
