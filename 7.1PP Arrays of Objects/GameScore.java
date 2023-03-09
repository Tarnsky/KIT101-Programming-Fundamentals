public class GameScore { 
 
     
    //variable declarations 
    private String userName; 
    private int gameId; 
    private int score; 
     
    public String getUserName() 
    { 
        return this.userName;     
    } 
     
    public void setUserName(String name) 
    { 
        this.userName = name; 
    } 
    public int getGameId() 
    { 
        return this.gameId; 
    } 
    public void setGameId(int id) 
    { 
        this.gameId = id; 
    } 
    public int getScore() 
    { 
        return this.score; 
    } 
    public void setScore(int score) 
    { 
        this.score = score; 
    } 
     
    public GameScore (String userName, int gameId, int score) 
    { 
        this.userName = userName; 
        this.gameId = gameId; 
        this.score = score; 
    } 
 
    //getters and setters 
 
    public String toString()  
    { 
     String title; 
     if (score < 1000) 
     { 
         title = "n00b"; 
     } 
     else if (score > 999999) 
     { 
         title = "Godlike"; 
     } 
     else  
     { 
         title = ""; 
     } 
         return (userName + " - " + score + " (game " + gameId + ") " + title); 
 
    } 
 
}