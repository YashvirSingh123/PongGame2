import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;

public class TestingAnimation extends JFrame{
	
	public void runProgram() {
		
		JFrame frame = new JFrame();
		
		frame.setTitle("Animation Testing");
		frame.setSize(800,800);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Image image = new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\first.jpg").getImage();
		Timer timer = new Timer(100, null);
		
		
		class MyJPanel extends JPanel{
			
			public void paint(Graphics g) {
				Graphics2D g2D = (Graphics2D) g;
				
				g2D .drawImage(image, 10,10, null);
			}
		}
		
		MyJPanel panel = new MyJPanel();
		panel.setPreferredSize(new Dimension(200,200));
		panel.setBackground(Color.black);
		
		
		frame.add(panel);
		
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestingAnimation ta = new TestingAnimation();
			
			ta.runProgram();
		
		
		
	}

}
