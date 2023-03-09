import java.util.Scanner;

/**
 * Typing Tutor (4.2PP Repetition, repetition, repetition)
 * 
 * @Edward Krimmer 532970
 */
public class TypingTutor {

    /** 
     * Displays the heading in ALL CAPS, underlined by tildes (~),
     * followed by a blank line.
     */
    public static void printHeading(String heading) {
        System.out.print(heading.toUpperCase());
        System.out.println();
        for (int i=0; i < heading.length(); i++)
        {
            System.out.print("~");
        }
        System.out.println("\n");
    }
    
    /**
     * Tests the user's typing ability by having them type the given word
     * correctly at least required times before finishing. Returns the total
     * number of attempts.
     */
    public static int runTutorial(Scanner in, String word, int required) {
        int attempts = 0;
        int correct = 0;
        String attempt;
            
        while (correct < required)
        {
            System.out.println("Type '" + word + "':");
        attempt = in.nextLine();
        attempts++;
        if (attempt.compareTo(word) == 0)
        {
        System.out.print("Correct");
        correct++;}
        else 
        {
            System.out.print("Try again ");
        }
        }
        
        return attempts;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String WORD = "Ted"; //the word to type
        final int TIMES = 10; //required number of correct repetitions
        long startTime, endTime; //start and end time of typing test
        double seconds; //elapsed time in seconds
        int attempts;
        
        printHeading("Typing Tutor");
        System.out.println("You need to type a word " + TIMES +
                           " times correctly, as quickly as you can");
        System.out.println("Your word in today's test is '" + WORD + "' (do not enter the quotes)");
        System.out.println();
        
        //The test
        System.out.println("Press enter to start the test");
        sc.nextLine();
        startTime = System.currentTimeMillis();
        attempts = runTutorial(sc, WORD, TIMES);
        endTime = System.currentTimeMillis();
        
        //Test report
        seconds = (double)(endTime - startTime) / 1000;
        System.out.println("You took " + seconds + " seconds and " + attempts +
                           " attempts to correctly type '" + WORD + "' " + TIMES + " times");
        System.out.println();
        printHeading("Come back for more pracice soon");
    }
    
}
