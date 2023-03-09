import java.util.Scanner;

/**
 * Word Manager (5.2PP Collection of Strings)
 *
 * @Edward Krimmer 532970
 */
public class WordManager 
{

    /**
     * Adds the word to the next empty space in the array, if there is space.
     * Returns the new size of the array.
     */
    public static int add(String[] words, int count, String word, int CAPACITY) 
    {
        if (count >= CAPACITY)
        {
            System.out.print("collection is full"); 
        }
        else
        {
        words[count] = word;   
        count++;
        }
        return count;
    }
    
    /** Displays the words in the collection as a comma separated list. */
    public static void printList(String[] words, int count) 
    {
        for (int i = 0; i<count;i++)
        {
            System.out.print(words[i] + ", ");
        }
            System.out.print("\n");
    }
    
    public static double averageLength(String[] words, int count)
    {
        double result =0;
        
    for (int i = 0; i < count; i++)
       {
            result = result + words[i].length();
       }

        return result / count;
    }
   
    
    public static void main(String[] args ) 
    {
        final int CAPACITY = 20; 
        Scanner sc = new Scanner(System.in);
        String[] words;
        int count = 0;
        int choice;
        String aWord; 
        words = new String[CAPACITY];

        
        System.out.println("Word Manager");
        System.out.println("1. Add a word");
        System.out.println("2. Display words");
        System.out.println("3. Display average word length");
        System.out.println("4. Quit");
        System.out.println();
        
        do{
        System.out.println("Enter option: ");
        
        choice = sc.nextInt();
        
        switch (choice)
         {
            case 1: 
                System.out.println("Enter word: ");
                Scanner sc1 = new Scanner(System.in);
                aWord = sc1.nextLine();
                count = add(words, count, aWord, CAPACITY);
                break;
            case 2:
                printList(words, count);
                break;
            case 3:
                System.out.println("Average word length: " + averageLength(words, count));
                break;
         }
        }
       while(choice != 4 );
         
     }

}


