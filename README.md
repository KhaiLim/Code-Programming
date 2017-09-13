import java.util.Scanner;
import java.util.Random;

public class gameComparetesting
{
   public static void main (String args[])
   {
      int randomN;
                  
      Scanner keyboard = new Scanner(System.in);
      Random randomNumber = new Random();
      
      randomN = randomNumber.nextInt(1000);
      
      boolean win = false;
      while ( win == false )
      {
         for (int i = 0; i <10 ; i++)
         {
            System.out.println("Only enter the range between 0 - 1000 to guess the match number with PC");
            System.out.println("Enter your number to guess PC number : ");
            int userPick = keyboard.nextInt();
            
            if ( userPick > randomN)
            {
               System.out.println("The number you picked too high !!!");
               System.out.println("You entered " + (i+1) + " time");
            }
            else if ( userPick < randomN)
            {
               System.out.println("The number you picked too low !!!");
               System.out.println("You entered " + (i+1) + " time");
            }
            else
            {
               System.out.println("Congrat !!! You Win ");
               win = true;
            } 
         
         
         
         
         }
         win = true;
         System.out.println("You Lose !!!");
         
       }  
  
   }// end main



}//end class
