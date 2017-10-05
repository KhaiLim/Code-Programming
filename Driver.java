import java.util.*;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args)
    {
        double temp;
        Temperature tc = new Temperature();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a new celcius value : ");
        temp = input.nextDouble();
        //System.out.println("Now the temperature is " + tc.toString());        
        System.out.println("Result"+tc.getCelciusTemperature());
        
        for (int k = 0; k < 3 ; k ++)
        {
            System.out.println("Enter a new celcius value : ");
            temp = input.nextDouble();
            System.out.println("Now the temperature is " + tc.toString());
        
        }
        
        
           
    }
}
