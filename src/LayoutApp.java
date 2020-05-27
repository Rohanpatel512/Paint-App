import javax.swing.*;
import java.awt.*;


public class LayoutApp extends JFrame {
    

    // Create an instance of each panel class
    colorButton buttons = new colorButton();
    PaintBoard board = new PaintBoard();
    

    // Construct the object 
    public LayoutApp() {
        
        // Create the window frame 
        this.setTitle("Paint App");
        this.setSize(700, 500);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the layout of the window to border layout
        this.setLayout(new BorderLayout());
        
        // Add each panel inside the window 
        this.add(buttons, BorderLayout.CENTER);
        this.add(board, BorderLayout.WEST);        
        
    }
}
