import javax.swing.*;
import java.awt.*;

public class TestingHitbox extends JPanel {
    public TestingHitbox() {
        setLayout(null); // Disable layout manager to manually position components

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setBounds(100, 100, 150,150);
        add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        panel2.setBounds(1000, 1000, 10, 10);
        
        add(panel2);

        // Set panel2's z-order to -1 to position it behind panel1
        panel1.setComponentZOrder(panel2, 0);

        setPreferredSize(new Dimension(500,500));
    }

    public static void main(String[] args) {
      
            
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Panel Example");
                frame.getContentPane().add(new TestingHitbox());
                frame.pack();
                frame.setVisible(true);
            
        }
    }

