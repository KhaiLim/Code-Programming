
/**
 * Write a description of class Temperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temperature
{
    private double celciusTemperature;
    private double fahrenheitTemperature;
    
    //Constructor method has the same exact name
    //as the class are there is no return type
    //The constructor method is used to "contruct"
    
    public Temperature()
    {
        celciusTemperature = 0;
        fahrenheitTemperature = 32;       
    }
    
       
    //method with the same name but with 
    //different formal parameter lists can coexist
    //this is call over loading a method
    
    public Temperature (double inTemp, char scale )
    {
        if (scale == 'c' || scale == 'C')
        {
            celciusTemperature = inTemp;
            fahrenheitTemperature = (9.0/5 * celciusTemperature) +32;
        
        }
        else
        {
            fahrenheitTemperature = inTemp;
            celciusTemperature = (fahrenheitTemperature - 32 ) * 5.0/9;
        
        }
    
    }
    
    public void setCelcius(double inTemp)
    {
        celciusTemperature = inTemp;
        fahrenheitTemperature = 9.0/5 * (celciusTemperature + 32);
           
    }
    
    public void setFahrenheit(double inTemp)
    {
        fahrenheitTemperature = inTemp;
        celciusTemperature = (fahrenheitTemperature - 32 ) * 5.0/9;
        
    
    }
    
    public double getfahrenheitTemperature()
    {
        return fahrenheitTemperature;
    
    }
    
    public double getCelciusTemperature()
    {
        return celciusTemperature;
    }
    
    public String toString()
    {
        return "Celcius is " + celciusTemperature + " Fahrenheit is " + fahrenheitTemperature;
    
    }
   
    
}
