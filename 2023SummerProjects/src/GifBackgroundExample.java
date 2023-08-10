import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class GifBackgroundExample extends JPanel {
	

	Image background = new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\BGTwo.gif").getImage();

	GifBackgroundExample() {
		setPreferredSize(new Dimension(400, 400));
	}

	public void paintComponent(Graphics g) {
		
		
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		g2.drawImage(background, 0, 0, null);
	}
	
	

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);

        // Create the GIF panel
       
        ImageIcon gif = new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\BGTwo.gif");
      
        JLabel label1 = new JLabel();
        
        JPanel panel1 = new JPanel();
        
        label1.setIcon(gif);
        
        
  
        // Create the black panel
        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(50, 50, 100, 100);
       // blackPanel.setLayout(null);

        // Set the layout of the frame's content pane to null
        //frame.getContentPane().setLayout(null);

        // Add the black panel to the frame's content pane
        
        
        
        panel1.add(new GifBackgroundExample());
        panel1.add(blackPanel);
        //panel1.add(blackPanel, BorderLayout.CENTER);
        frame.getContentPane().add(panel1);

        // Add the GIF panel to the black panel
        
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

    
}


