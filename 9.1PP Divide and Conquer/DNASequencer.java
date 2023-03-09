import java.util.Scanner;
import java.util.Arrays;
//class to get user information on a DNA sequence and modify and return different results
//Ted Krimmer
//532970
public class DNASequencer
{
   
    private static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args)
    {
       
        System.out.println("Welcome to the DNA Sequencer");
        getUserInput();
       
    }
   
    //Transcribes a DNA sequence to MRna
    public static String transcribe(String dna) 
    {
           return dna.replace("T", "U");
    }
       
    //Transcribes a defined section of a DNA sequence to MRna
    public static String transcribeSection(String dna){
       
        System.out.println("Enter starting position");
        int pos1 = sc.nextInt();
        System.out.println("Enter ending posistion");
        int pos2 = sc.nextInt();
       
        return transcribe(dna.substring(pos1-1, pos2));
                   
    }
   
    //Gets the compliment of a DNA sequence
    public static char[] compliment(String dna) {
       
        char[] DNAArray = dna.toCharArray();
       
        for (int i = 0; i < dna.length(); i++) {
                 
                if (dna.charAt(i) == 'A')  
                {
                    DNAArray[i] = 'T';
                }
                else if (dna.charAt(i) == 'T')  
                {
                    DNAArray[i] = 'A';
                }
                else if (dna.charAt(i) == 'G')  
                {
                    DNAArray[i] = 'C';
                }
                else if (dna.charAt(i) == 'C')  
                {
                          DNAArray[i] = 'G';
                }
                   
        }
        return DNAArray;
    }
   
    //In valid sequqnces are replaced by "n"
    public static String clean(String dna){
       
        dna = dna.toUpperCase(); // Takes user imput and converts to uppercase
        return dna.replaceAll("[^ATGC]", "n"); // Replaces any char that is not ATG or C to n
       
    }
   
   public static double displayErrorRate(String dna)
   {
       
        String DNAtemp = dna.replace("n",""); // new string with 'n' removed
        int errors = dna.length() - DNAtemp.length();
        System.out.println(DNAtemp + String.valueOf(DNAtemp.length()) + dna);
        System.out.println(String.valueOf(dna.length()));
        double errorRate = (Double.valueOf(errors)  / Double.valueOf(dna.length()) )*100; // percentage of errors
        System.out.println("error rate is " + errorRate + "%");
        return errorRate;
    }
    
   
    public static void getUserInput() 
    {
       
        String DNA;
        int choice = 0;
       
        System.out.println("Enter DNA sequence");
        DNA = sc.nextLine();
        DNA = clean(DNA);
       
           
        System.out.println("User Menu");
        System.out.println("1. Transcribe DNA to mRNA");
        System.out.println("2. Transcribe a section");
        System.out.println("3. Switch to the sequence’s complement");
        System.out.println("4. Display the original DNA sequence");
        System.out.println("5. Display sequence error rate");
        System.out.println("6. Quit");
        System.out.println();
       
        do {
        System.out.println("Enter option: ");
        choice = sc.nextInt();
         
        switch (choice)
         {
            case 1: //Transcribe DNA to mRNA
                    System.out.println("MRna = " + transcribe(DNA));
                    System.out.println();
                    break;
            case 2: //Display section of mRNA
                    System.out.println("MRna section = " + transcribeSection(DNA));
                    break;
            case 3: //Prints sequence’s complement

                    System.out.print("compliment = ");
                   
                    for( char c: compliment(DNA)){
                        System.out.print(c);
                    }
                    System.out.println();
                    break;
            case 4:
                    System.out.println("DNA sequence = " + DNA);
                    break;
            case 5:
                    displayErrorRate(DNA);
                    break;
            case 6:
                System.out.println("Thanks for playing");
                break;
            default:
                System.out.println("Invalid input");
                break;

         }
        }
       while(choice != 6 );
    }
       
}