import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TestingRotatingPanel extends JButton {

    private Color defaultColor = Color.LIGHT_GRAY;
    private Color clickedColor = Color.YELLOW;

    public TestingRotatingPanel(String text) {
        super(text);
        setFocusPainted(false);
        setBorderPainted(false);

        addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				 setBackground(clickedColor);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
         
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            // If the button is pressed, use the clicked color
            setBackground(clickedColor);
        } else {
            // Otherwise, use the default color
            setBackground(defaultColor);
        }
        
        if(getModel().isRollover()) {
        	setBackground(new Color(225,225,225,20));
        }
        super.paintComponent(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        TestingRotatingPanel button = new TestingRotatingPanel("Click Me");
        button.setPreferredSize(new Dimension(100, 50));
        button.setOpaque(true);
        
        frame.add(button);
        frame.setVisible(true);
    }
}
