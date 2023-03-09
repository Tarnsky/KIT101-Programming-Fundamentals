import java.util.Scanner; 
import java.util.Arrays;
 
public class HighScores { 
 
     public static GameScore readGameScore(Scanner in){ 
          int gameScore = 0; 
          int score = 0; 
          
     
          Scanner sc = new Scanner(System.in); 
          
          System.out.println("Enter game Id: "); 
          int gameId = sc.nextInt(); 
          
           while(gameId <= 0){ 
            System.out.println("invalid response, try again, Enter Game ID: "); 
            gameId = in.nextInt(); 
           } 
           System.out.println("Enter game score(0 or higher): "); 
           score = in.nextInt();
           while(score < 0) { 
            System.out.println("invalid response, try again, Enter Score: "); 
            score = in.nextInt(); 
           } 
           System.out.println("Enter user name: "); 
           String userName = sc.nextLine(); 
           return new GameScore(userName, gameId, score); 
           
     }
    //method(s) for reading and validating 
    //user input and creating a new DataType 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        GameScore gs = new GameScore("",0,0); 
        final int CAPACITY = 5;  
        int[] scoreList = new int[CAPACITY]; //player list, initialised to hold CAPACITY elements 
        int choice; //user's menu selection 
        int count; //amount of recorded scores 
        int score = 0; 
        int temp = 0;

        
        System.out.println("Player Manager"); 
        System.out.println("Enter initial number of entries < " + CAPACITY + "): "); 
        count = Math.min(sc.nextInt(), CAPACITY); 
         
        for (int i = 0; i < count; i++){ //a loop to add the initial array entries, the scores! 
            System.out.println("Entry #" + (i + 1) + " score: "); //displays which number entry you're adding to 
            scoreList[i] = sc.nextInt(); 
        } 
         
      
         
        System.out.println("User Menu"); 
        System.out.println("1. Add another score"); 
        System.out.println("2. Display all scores"); 
        System.out.println("3. Display average score of user"); 
        System.out.println("4. Display highest score of user"); 
        System.out.println("5. Quit"); 
        System.out.println(); 
         
        do{ 
        System.out.println("Enter option: "); 
         
        choice = sc.nextInt(); 
         
        switch (choice) 
         { 
            case 1: //add another score 
                    System.out.println("Enter the score: "); 
                    score = sc.nextInt(); 
                    count = addScores(scoreList, score, count); 
                    System.out.println(); 
                    break; 
            case 2: //Display scores with printAll method 
                    printAll(scoreList, count); 
                    break; 
            case 3: //display average score for a user 
                    System.out.println(averageUserScore(scoreList, count)); 
                    break; 
             case 4: 
                    System.out.println(highScore(scoreList, count)); 
                break; 
         } 
        } 
       while(choice != 5 ); 
      
    } 
 
    
    
    
     public static void printAll(int[] scoreList, int count) { 
         
         
        for(int i = 0;i < count; i++){  
            if( i != (count-1)){ System.out.println( scoreList[i]);  
            } else { System.out.println(scoreList[i]); 
            } 
        } 
    }
    
    
    
    
    public static int addScores(int[] scoreList, int score, int count) { //method to add new scores 
        if (count < scoreList.length) { 
            scoreList[count] = score; 
            count = count + 1; 
        }else{ 
             System.out.print("Not enough room for that many scores");
        } 
        return count; 
    } 
    
     public static double averageUserScore(int[] scoreList, int count) { 
        double sum = 0; 
        double average; 
         
        for (int i = 0; i < count; i++) { 
            sum = sum + scoreList[i]; 

        } 
        average = sum / count; 
             
        return average; 
    }

       

     public static int highScore(int[] scoreList, int count)//find the highest score from scoreList
     {
     int temp;  
     for (int i = 0; i < count; i++)   
        {  
            for (int j = i + 1; j < count; j++)   
            {  
                if (scoreList[i] > scoreList[j])   
                {  
                    temp = scoreList[i];  
                    scoreList[i] = scoreList[j];  
                    scoreList[j] = temp;  
                }  
            }  
        }  
       return scoreList[count-1];  
      }
}