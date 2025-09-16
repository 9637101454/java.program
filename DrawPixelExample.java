import javax.swing.*; 
import java.awt.*; 

public class DrawPixelExample extends JPanel { 

    @Override 
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g); 
      
        // Set pixel color 
        g.setColor(Color.RED); 

        // Draw single pixel at (50, 50) 
        g.fillRect(50, 50, 50, 50);
    } 
    
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Draw Single Pixel Examaple");
         DrawPixelExample panel = new DrawPixelExample(); 
         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(200, 200); 
        frame.add(panel); 
        frame.setVisible(true); 
}

}