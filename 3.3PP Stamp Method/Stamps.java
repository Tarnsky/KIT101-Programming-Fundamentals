import java.awt.Color;
import kit101.turtle.Turtle;

/**
 * 3.3PP Stamp Method: Implements a reusable 'stamp' that can draw the
 * author's initials at any location on the Turtle Graphics window.
 * 
 * @TED KRIMMER
 */
public class Stamps {

    public static void drawStamp(Turtle stamper, double x, double y, Color ink) {
        
        Color oldInk = oldInk = stamper.getColor();
        double oldDirection = stamper.getDirection();
        double oldX = oldX = stamper.getX();
        double oldY = oldY = stamper.getY();
 
        //moving 'ink' to start
        stamper.setColor(ink);
        stamper.penUp();
        stamper.moveTo(x + 50, y + 50);
        stamper.penDown();
        stamper.penUp();
        stamper.turn(180);
        stamper.move(100);
        //Draw "T"
        stamper.penDown();
        stamper.turn(180);
        stamper.move(80);
        stamper.turn(180);
        stamper.move(40);
        stamper.turn(90);
        stamper.move(80);
        //end of drawing "T"
        stamper.penUp();
        stamper.turn(180);
        stamper.move(80);
        stamper.turn(270);
        stamper.move(100);
        //start drawing"k"
        stamper.penDown();
        stamper.turn(270);
        stamper.move(80);
        stamper.turn(180);
        stamper.move(40);
        stamper.turn(215);
        stamper.move(50);
        stamper.turn(180);
        stamper.move(50);
        stamper.turn(270);
        stamper.move(50);
        //move stamp to start position
        stamper.penUp();
        stamper.moveTo(oldX, oldY);
        stamper.setColor(oldInk);
        stamper.turnTo(oldDirection);

}
    
    public static void main(String[] args) {
        Turtle t = new Turtle(); //the graphics device
        drawStamp(t,50,50,Color.BLUE); 
        drawStamp(t,50,300,Color.BLUE);
        drawStamp(t,300,50,Color.BLUE);


        //You will call your method (eventually several times) here
 //For example, drawStamp(t); during Stage 1 of the task
    }
}
