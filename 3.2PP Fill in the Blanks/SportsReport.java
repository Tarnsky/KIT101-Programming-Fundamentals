import java.util.Scanner;

/**
 * 3.2PP Sports News Generator
 * 
 * @author Ted Krimmer
 */
public class SportsReport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String winner; //winning team's name, may be multiple words
        int round;     //current competition round
        String loser; //Losing team's name
        int winningPoints;
        int losersPoints;
        int difference;

        System.out.println("Any Sport in a Storm");
        System.out.println();
        System.out.print("Enter the winning team's name: ");
        winner = sc.nextLine();
        System.out.print("Enter the losing team's name: ");
        loser = sc.nextLine();
        System.out.print("What round of the competition? ");
        round = sc.nextInt();
        System.out.print("How many points did " + winner + " score? ");
        winningPoints = sc.nextInt();
        System.out.print("How many points did " + loser + " score? ");
        losersPoints = sc.nextInt();
        difference = winningPoints-losersPoints;
        System.out.println(winner + " beat " + loser + " by " + difference + " points at the weekend in a thrilling game.");
        System.out.println("The final score line was " + winningPoints + " points to " + losersPoints + ".");
        System.out.println(" After just " + round + " rounds winner look like favourites to win the competition.");
        
        
    }

}