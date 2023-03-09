import java.util.Scanner;

/**
 * Coffee Order Generator (4.1PP IFTTT)
 * 
 * @Edward krimmer 532970
 */
public class CoffeeOrder {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String coffee; //user's description of kind of coffee
        int shots; //number of coffee shots, 1, 2, possibly higher
        boolean useSoy; //use soy milk instead of regular milk?
        String shotsType;
        
        //Get coffee details from user
        System.out.print("What kind of coffee would you like (e.g., latte, cappuccino)? ");
        coffee = sc.nextLine(); //in case they say 'flat white'
        System.out.print("How many shots (1, 2, ...)? ");
        shots = sc.nextInt();
        System.out.print("With soy milk (true or false)? ");
        useSoy = sc.nextBoolean();
        
        //Display order details
        System.out.print("Order details: ");
        //Adding string values to number of shots
        if (shots >= 3){
            shotsType = "Dark and bitter";}
        else if (shots == 2){
            shotsType = "Double shot";}
        else {
            shotsType = "Single shot";}
        // output message
        if (useSoy == true){
            System.out.println (shotsType + " soy " + coffee);}
        else {
            System.out.println (shotsType + " " + coffee);}
            
        
        //ADD YOUR CODE HERE TO GENERATE THE MESSAGE ON ONE LINE
        //(BUT ENDING ON A NEW LINE)
    }
    
}
