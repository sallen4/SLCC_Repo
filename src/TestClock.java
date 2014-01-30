/**
 * Sean Allen
 * CSIS 1410
 * EC1
 * 
 */
import java.awt.*;
import javax.swing.*;


public class TestClock {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Ticking Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new TickingClock());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
