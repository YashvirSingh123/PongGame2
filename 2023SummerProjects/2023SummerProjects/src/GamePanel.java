import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;



public class GamePanel extends Theme{

	
	private int AnimationSpeed = 10;
	
	private int PongBallPanelWidth = 90 ;
	private int PongBallPanelHeight  = 100 ;
	
	private int UserCharacterXcor = 20;
	private int UserCharacterYcor = 200;
	
	
	private int OppositeCharacterXcor = 970;
	private int OppositeCharacterYcor = 200;
	
	private int CharacterPanelWidth = 120;
	private int CharacterPanelHeight = 160 ;
	
	
	private int TopYboundary = 30 ;
	private int BottomYboundary = 630;
	
	private int FrameWidth = 1100;
	private int FrameHeight = 800;
	//panel one and its coordinates properties
	int Xcor = 200;
	int Ycor = 200;
	
	private int Characterspeed = 30;
	//pongball panel object
	Ball PongBall ;
	
	//character panel
	UserCharacter UserCharacter ;
	OppositeCharacter OppositeCharacter = new OppositeCharacter();
	
	//animation timer
	Timer animation;
	
	Theme theme = new Theme();
    
	JPanel BGPanel = new JPanel();
	JLayeredPane layeredPane = new JLayeredPane();
	
	JFrame frame = new JFrame();
	
	
	private String defaultUsercharacter = "PURPLE";
	
	
	public void Runtesting(String inputBallType, String UserCharacterType) {
		
		if(inputBallType.equals("ELECTRO ")) {
			this.PongBallPanelWidth = 150;
		}
		
		//adding pongball according to its type 
		PongBall =  new Ball(inputBallType);
		
		UserCharacter = new UserCharacter(UserCharacterType);
		
		PongBall.switcher(true);
		PongBall.settingGif();
		PongBall.setBounds(Xcor, Ycor, PongBallPanelWidth, PongBallPanelHeight);
		PongBall.setLocation(Xcor, Ycor);
			
		
		
		//enemy panel 
		UserCharacter.setBounds(UserCharacterXcor , UserCharacterYcor , CharacterPanelWidth, CharacterPanelHeight);
		UserCharacter.setBackground(Color.red);
		
		//enemy panel 2
		OppositeCharacter.setBounds(OppositeCharacterXcor, OppositeCharacterYcor, CharacterPanelWidth, CharacterPanelHeight);
		//OppositeCharacter.setBackground(Color.red);
		
	
		
	
		
		
		class timelistener implements ActionListener{

			int switcherx = 0 ;
			int switchery =0;
			int counter = 0 ;
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				// TODO Auto-generated method stub
				//checking for collision 
				Rectangle bounds1 = PongBall.getBounds();
				Rectangle bounds2 = UserCharacter.getBounds();
				Rectangle bounds3 = OppositeCharacter.getBounds();
				
				
				
				
				if(bounds1.intersects(bounds3) ) {
					switcherx = 3;
					
					
					PongBall.switcher(false);
					PongBall.settingGif();
					
				
					
					
				}
				if(bounds1.intersects(bounds2) ) {
					switcherx = 2;
					
					
					PongBall.switcher(true);
					PongBall.settingGif();
					
				
					
					
				}
				if(Ycor == BottomYboundary) {
					switchery = 3;
				}
				if(Ycor == TopYboundary) {
					switchery = 2;
				}
				if(switcherx % 2 == 0) {
					Xcor = Xcor + 5;
				
					PongBall.setLocation(Xcor, Ycor);
					
					
				}
				if(switcherx % 2!= 0) {
					Xcor = Xcor -5 ;
				
					PongBall.setLocation(Xcor, Ycor);
				}
				if(PongBall.getX()< 0) {

					animation.stop();
					
					JFrame frame = new JFrame();
					frame.setTitle("You lose");
					
					JLabel label = new JLabel("YOU LOSE");
					label.setFont(new Font("Gamix",Font.PLAIN, 30));
					label.setForeground(Color.red);
					
					JPanel panel = new JPanel ();
					panel.add(label);
					panel.setBackground(Color.black);

					frame.add(panel);
					
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setSize(400, 100);
					frame.setBackground(Color.black);
					frame.setForeground(Color.black);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setBackground(Color.BLACK);
					frame.setVisible(true);
					
					
				}
				if(switchery % 2 == 0) {
					
					Ycor = Ycor + 5;
					PongBall.setLocation(Xcor, Ycor);
					OppositeCharacter.setLocation(OppositeCharacterXcor, Ycor);
					
					
				}
				if(switchery % 2!= 0) {
					
					Ycor = Ycor - 5;
					PongBall.setLocation(Xcor, Ycor);
					OppositeCharacter.setLocation(OppositeCharacterXcor, Ycor);
				
				}
			
				
				

			}
			
		}
		
		class UserCharacterKeyListener extends KeyAdapter{
			private int corY;
			
			public UserCharacterKeyListener(int corY) {
				this.corY = corY;
			}
			
			 public void keyPressed(KeyEvent e) {
	                int keyCode = e.getKeyCode();

	                if (keyCode == KeyEvent.VK_UP) {
	                	
	                	if(UserCharacter.getY() > TopYboundary) {
	                    UserCharacter.setLocation(  UserCharacter.getX(),   UserCharacter.getY() - corY);
	                	}
	                } else if (keyCode == KeyEvent.VK_DOWN) {
	                	
	                	if(UserCharacter.getY() < BottomYboundary) {
	                	  UserCharacter.setLocation(  UserCharacter.getX(),   UserCharacter.getY() + corY);
	                	}
	                }
	            }
		}
		
		
		UserCharacterKeyListener keyListener = new UserCharacterKeyListener(Characterspeed);
		frame.addKeyListener(keyListener);
		
		//animation of the moving panel 
		ActionListener moving = new timelistener();
		animation = new Timer(AnimationSpeed, moving);
		
		BGPanel.setBounds(0, 0, FrameWidth, FrameHeight); 
		BGPanel.add(new BGDisplay(1));
		layeredPane.setLayout(null);
        layeredPane.setBounds(0, 0, FrameWidth, FrameHeight);
		
		 layeredPane.add(BGPanel, JLayeredPane.DEFAULT_LAYER); 
	     layeredPane.add(PongBall, JLayeredPane.PALETTE_LAYER); 
	     layeredPane.add(UserCharacter, JLayeredPane.PALETTE_LAYER); 
	     layeredPane.add(OppositeCharacter, JLayeredPane.PALETTE_LAYER);
	     
	       
	    frame.setContentPane(layeredPane);
		
		frame.setTitle("Pong Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.add(PongBall);
//		frame.add(UserCharacter);
//		frame.add(OppositeCharacter);
		frame.setSize(FrameWidth, FrameHeight);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.BLACK);
		frame.setVisible(true);
		
		
	}
	
	

	
	public void startTimer() {
		animation.start();
	}

}
