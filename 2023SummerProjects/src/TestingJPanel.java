import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;



public class TestingJPanel extends JFrame{

	//panel one and its coordinates properties
	int Xcor = 200;
	int Ycor = 200;
	ImagePanelExample panel1 = new ImagePanelExample();
	
	//panel two 
	JPanel enemy_panel = new JPanel();
	JPanel enemy_panel2 = new JPanel();
	
	//overall panel 
	JPanel overallPanel = new JPanel(new GridLayout(1,3));
	
	JPanel hitbox = new JPanel();
	
	
	public void Runtesting() {
		JFrame frame = new JFrame();
		
		
		frame.setTitle("Testing JPanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		
//	panel1.setPreferredSize(new Dimension(500,500));
		panel1.setBounds(200, 200, 150, 150);
		panel1.setLocation(Xcor, Ycor);
		panel1.setBackground(Color.cyan);
		
		
		hitbox.setBounds(200,200,150,150);
		hitbox.setBackground(Color.red);
		
		
		
		//enemy panel 
		enemy_panel.setBounds(50, 200, 50, 50);
		enemy_panel.setBackground(Color.red);
		
		//enemy panel 2
		enemy_panel2.setBounds(850, 200, 50, 50);
		enemy_panel2.setBackground(Color.red);
		
		//overall panel
		overallPanel.setBounds(1000, 1000, 5, 5);
		
	class mousemotionlistener implements MouseMotionListener{

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Your are in hitbox");
				System.out.println(e.getX()+ " " + e.getY());
				
			}
			
			
		}
		
		class framemousemotionlistener implements MouseMotionListener{
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
			
				System.out.println(e.getX()+ " " + e.getY());
				
			}
		}
		
		class timelistener implements ActionListener{

			int switcherx = 0 ;
			int switchery =0;
			int counter = 0 ;
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				panel1.add(hitbox);
//				panel1.setComponentZOrder(hitbox, 0);
				// TODO Auto-generated method stub
				//checking for collision 
				Rectangle bounds1 = panel1.getBounds();
				Rectangle bounds2 = enemy_panel.getBounds();
				Rectangle bounds3 = enemy_panel2.getBounds();
				Rectangle bounds4 = overallPanel.getBounds();
				
				Random rand = new Random();
				int number = rand.nextInt(50,224);
				int number2 = rand.nextInt(50,200);
				
				if(bounds1.intersects(bounds3) ) {
					switcherx = 3;
					panel1.setBackground(new Color(number, number2, number));
					panel1.SetCurrentList(false);
					
				}
				if(bounds1.intersects(bounds2) ) {
					switcherx = 2;
					panel1.setBackground(new Color(number2, number, number2));
					panel1.SetCurrentList(true);
				}
				if(Ycor == 500) {
					switchery = 3;
				}
				if(Ycor == 30) {
					switchery = 2;
				}
				if(switcherx % 2 == 0) {
					Xcor = Xcor + 5;
				
					panel1.setLocation(Xcor, Ycor);
					
					
				}
				if(switcherx % 2!= 0) {
					Xcor = Xcor -5 ;
				
					panel1.setLocation(Xcor, Ycor);
				}
				if(switchery % 2 == 0) {
					
					Ycor = Ycor + 5;
					panel1.setLocation(Xcor, Ycor);
					enemy_panel2.setLocation(850, Ycor);
					enemy_panel.setLocation(50, Ycor);
					
				}
				if(switchery % 2!= 0) {
					
					Ycor = Ycor - 5;
					panel1.setLocation(Xcor, Ycor);
					enemy_panel2.setLocation(850, Ycor);
					enemy_panel.setLocation(50, Ycor);
				}
			
				
				

			}
			
		}
		
		
		//animation of the moving panel 
		ActionListener moving = new timelistener();
		Timer animation = new Timer(1, moving);
		animation.start();
		
		
		
		
		frame.addMouseMotionListener(new framemousemotionlistener());
		hitbox.addMouseMotionListener(new mousemotionlistener());
	
//		overallPanel.setLayout(null);
//		overallPanel.add(panel1);
//		overallPanel.add(enemy_panel);
//		overallPanel.add(enemy_panel2);
		
		
		frame.add(panel1);
		frame.add(enemy_panel);
		frame.add(enemy_panel2);
		frame.setSize(1100, 800);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.BLACK);
	
		frame.setVisible(true);
		
		
	}
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		TestingJPanel tp = new TestingJPanel();
		tp.Runtesting();
		

		
	}

}
