import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class colorButton extends JPanel {
    
   // Class variables    
   private String[] colors = {"Black", "Red", "Yellow", "Orange", "Blue", "White"};
   private String color = "";
   
   private JButton[] buttonColors = new JButton[6];
      
   // Call method to layout buttons  
  public colorButton() {
       
       // Set the layout of the panel to FlowLayout
       this.setLayout(new FlowLayout());
       
       // Loop through the buttons array 
       for(int i = 0; i < buttonColors.length; i++) {
           
           // Create a new button and store in variable 
           buttonColors[i] = new JButton();
                      
           
           // Check what back ground color button should have 
           switch(colors[i]) {
               case "Black":
                   // Set the background color to black
                   buttonColors[i].setBackground(Color.BLACK);
                   buttonColors[i].setActionCommand("Black");
                   break;
                   
               case "Red":
                   // Set the background color to red 
                   buttonColors[i].setBackground(Color.RED);
                   buttonColors[i].setActionCommand("Red");
                   break;
               
               case "Yellow":
                   // Set the background color to purple 
                   buttonColors[i].setBackground(Color.YELLOW);
                   buttonColors[i].setActionCommand("Yellow");
                   break;
                
               case "Orange":
                   // Set the background color to orange 
                   buttonColors[i].setBackground(Color.ORANGE);
                   buttonColors[i].setActionCommand("Orange");
                   break;
               
               case "Blue":
                   // Set background color to blue 
                   buttonColors[i].setBackground(Color.BLUE);
                   buttonColors[i].setActionCommand("Blue");
                   break;
                
               case "White":
                   // Make the button a eraser button 
                   buttonColors[i].setText("Eraser");
                   buttonColors[i].setBackground(Color.WHITE);
                   buttonColors[i].setActionCommand("Eraser");
                   
               default:
           }
           
           // Add the buttons to panel 
           this.add(buttonColors[i]); 
       }
       
        // Call instance of a class to get color selected 
        getPrimaryColor userColor = new getPrimaryColor(buttonColors);
   }
   
  public class getPrimaryColor extends PaintBoard {

      
     public getPrimaryColor(JButton[] buttonColor) {
         
        // Loop through the color buttons array 
        for(int i = 0; i < buttonColors.length; i++) {
          // Add action listener to each button 
          buttonColors[i].addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 
                 // Get the color and store in variable 
                 color = e.getActionCommand();
 
             } 
          });
        }
         
     }
  
  }
}