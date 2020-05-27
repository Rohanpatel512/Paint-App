
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class PaintBoard extends JPanel implements MouseMotionListener {
    
    // Class variables 
    static int xValue = 0;
    static int yValue = 0;
    
    static String color = "";
    
    static boolean otherColor = false;
     
    public PaintBoard() {
        
        // Set the dimensions to 300 by 300 pixels 
        this.setPreferredSize(new Dimension(400, 300));
        
        // Add a mouse motion listener to the panel
        addMouseMotionListener(this);
        
        // Set the background to white 
        this.setBackground(Color.WHITE);
                       
    }

    public void mouseDragged(MouseEvent e) {
        
        // Get the x and y coordinates of the mouse and store in variable 
        xValue = e.getX();
        yValue = e.getY();        
        
        // Add a graphics object inside panel 
        Graphics paintLine = this.getGraphics();
        
        // Check what the color of the line must be 
        switch(color) {
            case "Black":
                paintLine.setColor(Color.BLACK);
                break;
                
            case "Red":
                paintLine.setColor(Color.RED);
                break;
                
            case "Yellow":
                paintLine.setColor(Color.YELLOW);
                break;
            
            case "Orange":
                paintLine.setColor(Color.ORANGE);
                break;
            
            case "Blue":
                paintLine.setColor(Color.BLUE);
                break;
            
            case "Eraser":
                paintLine.setColor(Color.WHITE);
                break;
            default:     
        }
        
      
        // Draw the 'line' according to the mouse coordinates
        paintLine.fillOval(xValue, yValue, 20, 10);
        
    }
   
    public void mouseMoved(MouseEvent e){
    }
}
