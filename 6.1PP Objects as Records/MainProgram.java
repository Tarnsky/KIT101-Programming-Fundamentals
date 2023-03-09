import java.util.Scanner;

public class MainProgram {

    public static GameScore readGameScore()
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter user name: ");
     String userName = sc.nextLine();
     System.out.println("Enter game Id: ");
     int gameId = sc.nextInt();

     int gameScore = 0;
     do 
     {
      System.out.println("Enter game score(0 or higher): ");
      gameScore = sc.nextInt();
     }
     while (gameScore <= 0);
     GameScore gs = new GameScore(userName, gameId, gameScore);
     return gs;
    }
    //method(s) for reading and validating
    //user input and creating a new DataType

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameScore gs = new GameScore("",0,0);
        
        System.out.println("Enter score data: ");
        gs = readGameScore();
        System.out.println("you entered: " + gs.toString());

        //calls method to read details from user
        //and assigns result to data

        //displays data using println
    }
}