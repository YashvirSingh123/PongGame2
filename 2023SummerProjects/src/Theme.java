import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;

import java.io.File;
import java.io.IOException;



public class Theme {

    //private ArrayList<ImageIcon> BallDisplayList = new ArrayList<>();

//    private ArrayList<ImageIcon> ballThemeList = new ArrayList<>();
//    private ArrayList<ImageIcon> padThemeList = new ArrayList<>();
//    private ArrayList<ImageIcon> bgThemeList = new ArrayList<>();
    
   

    private final int DisplayXcor = 100;
    private final int DisplayYcor = 125;
    private final int DisplayWidth = 150;
    private final int DisplayHeight = 150;
    private final int DisplaySpacing = DisplayHeight + 20;


    private final int FrameWidth = 700;
    private final int FrameHeight = 700;

    private final int TitlePanelXcor = 90;
    private final int TitlePanelYcor = 30;
    private final int TitlePanelWidth = 500;
    private final int TitlePanelHeight = 70;

    private final int ButtonPanelXcor = 350;
    private final int ButtonPanelYcor = 125;
    private final int ButtonPanelWidth = 250;
    private final int ButtonPanelHeight = 490;
    
    private final int ButtonXcor = 35;
    private final int ButtonYcor = 45;
    private final int ButtonWidth = 140;
    private final int ButtonHeight = 50;
    private final int ButtonSpacing = ButtonHeight + 120;
    
    private boolean DisposeStatus = false;

//    private String BallButtonText;
//    private String CharacterButtonText;
//    private String BgButtonText;


    JFrame Themeframe = new JFrame();
    
    
    JLabel TitleLabel = new JLabel("Select Theme");
    JPanel titlepanel = new JPanel();

    JPanel ballDisplay = new JPanel();
    JPanel characterDisplay = new JPanel();
    JPanel bgDisplay = new JPanel();

    

    JPanel ButtonPanel = new JPanel();
    TestingJButton BallButton = new TestingJButton("Ball");
    TestingJButton CharacterButton = new  TestingJButton("Character");
    
   JLabel SelectedBall = new JLabel("Default Selection : FIREBALL");
    JLabel SelectedCharacter = new JLabel("Default Selection : PURPLE");
    
   // TestingJButton BgButton = new  TestingJButton();
    JPanel BGPanel = new JPanel();
    JLayeredPane layeredPane = new JLayeredPane();

    
    
    BallLabelDisplay BallDisplay = new BallLabelDisplay("BallDisplay");
 
    int LabelIndex = 0;
    
    BallLabelDisplay CharacterDisplay = new BallLabelDisplay("CharacterDisplay");

    
   
    
    JButton okbutton = new JButton("OK");
    
    
    public Theme(){
    	

    }

    /**
     * 
     */
    


    public void runTheme(){
    	
    	
    	

        //title label properties 
        TitleLabel.setForeground(Color.red);
        TitleLabel.setFont(new Font("Gamix",Font.PLAIN, 50));
           
        //title panel properties
        titlepanel.setOpaque(false);
        titlepanel.setBounds(TitlePanelXcor,TitlePanelYcor, TitlePanelWidth,TitlePanelHeight);

        //adding content into panel
        titlepanel.add(TitleLabel);

        //display panel properties
        ballDisplay.setBounds(DisplayXcor, DisplayYcor, DisplayWidth, DisplayHeight);
        ballDisplay.setOpaque(false);
        ballDisplay.add(BallDisplay);
       
        
        characterDisplay.setBounds(DisplayXcor, DisplayYcor+DisplaySpacing, DisplayWidth, DisplayHeight);
        characterDisplay.setOpaque(false);
        characterDisplay.add(CharacterDisplay);
        
        
        bgDisplay.setBounds(DisplayXcor, DisplaySpacing+DisplayYcor+DisplaySpacing, DisplayWidth, DisplayHeight);

        //button panel properties
        ButtonPanel.setBounds(ButtonPanelXcor, ButtonPanelYcor, ButtonPanelWidth, ButtonPanelHeight);
        ButtonPanel.setLayout(new BoxLayout(ButtonPanel, BoxLayout.Y_AXIS));
        ButtonPanel.setOpaque(false);
        

        //buttons properties
        BallButton.setBounds(ButtonXcor, ButtonYcor, ButtonWidth, ButtonHeight);
        CharacterButton.setBounds(ButtonXcor, ButtonYcor + ButtonSpacing, ButtonWidth, ButtonHeight);
       // BgButton.setBounds(ButtonXcor, ButtonYcor +ButtonSpacing+ ButtonSpacing, ButtonWidth, ButtonHeight);
       
        //adding contents into button panel
        BallButton.setBorder(null);
        BallButton.setHorizontalAlignment(JLabel.CENTER);
        ButtonPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        ButtonPanel.add(BallButton, BorderLayout.CENTER);

        //inbetween spacing and the label properties
        ButtonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
    	SelectedBall.setForeground(Color.white);
		SelectedBall.setBackground(Color.white);
		SelectedBall.setFont( new Font("Haettenschweiler", Font.PLAIN, 15) );
        ButtonPanel.add(SelectedBall);
        
        //adding mouesemotionlistener to BallButton
        BallButton.addMouseListener(new MouseListener() {
   
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				 String selectedBallType = BallButton.getButtonLabelText();
				 
	                
	               
	               
	                // Set the selected ball type to the label
	                SelectedBall.setText("Selected: " + selectedBallType);
	                System.out.println(BallButton.getButtonLabelText());
	               
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
        
        
      
        CharacterButton.setBorder(null);
        CharacterButton.setHorizontalAlignment(JLabel.CENTER);
        ButtonPanel.add(Box.createRigidArea(new Dimension(0, 120)));
        ButtonPanel.add(CharacterButton, BorderLayout.CENTER);
        
        //inbetween spacing and the selected label properties
        ButtonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        SelectedCharacter.setForeground(Color.white);
		SelectedCharacter.setBackground(Color.white);
		SelectedCharacter.setFont( new Font("Haettenschweiler", Font.PLAIN, 15) );
        ButtonPanel.add(SelectedCharacter);
        CharacterButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
			
				
				SelectedCharacter.setText("Selected : "+CharacterButton.getButtonLabelText());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
        
        
       // ButtonPanel.add(BgButton); //will add in future updates
        
        
        
        //BG Panel
        BGPanel.setBounds(0, 0, FrameWidth, FrameHeight);  
        BGPanel.add(new BGDisplay(0));
        //adding into layered pane
        // Create a layered pane
        layeredPane.setLayout(null);
        layeredPane.setBounds(0, 0, FrameWidth, FrameHeight);
        
        
        
        //JButton okbutton = new JButton("OK");
//        okbutton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				GamePanel gp = new GamePanel();
//				gp.Runtesting();
//			}
//        	
//        });
        okbutton.addActionListener(new ActionListener() {

        	GamePanel gp = new GamePanel();
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//gp.setBall(BallButton.getButtonLabelText());
				gp.Runtesting(BallButton.getButtonLabelText(), CharacterButton.getButtonLabelText());
				gp.startTimer();
			}
        	
        });
        ButtonPanel.add(okbutton);
        // Add components to the layered pane with appropriate layers
        layeredPane.add(BGPanel, JLayeredPane.DEFAULT_LAYER); // panel1 at the back
        layeredPane.add(titlepanel, JLayeredPane.PALETTE_LAYER); // ButtonPanel at the front
        layeredPane.add(ballDisplay, JLayeredPane.PALETTE_LAYER); // titlepanel at the front
        layeredPane.add(characterDisplay, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(ButtonPanel, JLayeredPane.PALETTE_LAYER);
        // Add the layered pane to the frame
        Themeframe.setContentPane(layeredPane);
        
        
//        //Themeframe.add(bgDisplay); //will add in future updates

        

        

        Themeframe.setTitle("Select Preferences");
        Themeframe.setSize(FrameWidth,FrameHeight);
        Themeframe.setLayout(null);
        Themeframe.setResizable(false);
        Themeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Themeframe.getContentPane().setBackground(Color.black);
        Themeframe.setLocationRelativeTo(null);
        Themeframe.setVisible(true);

        if(DisposeStatus) {
        	Themeframe.dispose();
        }
        

    }

    // public ImageIcon getBallTheme (){
    //     return ;
    // }

    // public ImageIcon getPadTheme(){
    //     return ;
    // }
    
    // public ImageIcon getBgTheme(){
    //     return ;
    // }
    public void setDisposeStatus(boolean status) {
    	
    	DisposeStatus = status;
    
    }

   
    
    public static void main (String[] main){
       Theme theme = new Theme();
      
        theme.runTheme();
    }


}
