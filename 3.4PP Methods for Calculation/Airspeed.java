import java.util.Scanner;

public class Airspeed {
   
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       double userFrequency;
       double userAmplitude;
       
       //The airspeed velocity of a bird can be calculated using an equation based on the Strouhal Number.
       //From this information we can determine that the airspeed velocity of a bird (U) can be calculated from
       //the frequency (f) at which the bird beats its wings multiplied by the amplitude in metres (A) of
       //each wing stroke, divided by the Strouhal Number (s).
       
       
      System.out.println("Airspeed Velocity Calculator");
      System.out.println("African Swallow: " + airSpeedVelocity(15,21)/100 + "Metres/second");
      System.out.println("European Swallow: " + airSpeedVelocity(14,22)/100 + "Metres/second");
       
      System.out.println("Enter frequency in Hz: ");
      userFrequency = sc.nextDouble();
     
      System.out.println("Enter amplitude in cm: ");
      userAmplitude = sc.nextDouble();
       
      System.out.println("CALCULATING...");
      System.out.println("ANSWER IS " + airSpeedVelocity(userFrequency,userAmplitude)/100);
     
    }
   
    public static double airSpeedVelocity(double frequency, double amplitude)
    {
        final double STROUHAL_NUM = 0.33;
        return ((frequency * amplitude)/STROUHAL_NUM);
    }
}