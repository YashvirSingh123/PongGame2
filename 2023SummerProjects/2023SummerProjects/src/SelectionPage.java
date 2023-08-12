import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;

public class SelectionPage {

    private final int FrameWidth = 700;
    private final int FrameHeight = 700;

    private final int TitlePanelXcor = 40;
    private final int TitlePanelYcor = 40;
    private final int TitlePanelWidth = 600;
    private final int TitlePanelHeight = 110;

    private final int ButtonPanelXcor = 40;
    private final int ButtonPanelYcor = 200;
    private final int ButtonPanelWidth = 600;
    private final int ButtonPanelHeight = 400;
    
    private final int InbetweenButtonSpacing = 40;

    JFrame frame = new JFrame();
    JLabel TitleLabel = new JLabel("PONG GAME");
    JPanel titlepanel = new JPanel();

    JPanel ButtonPanel = new JPanel();

  
    JPanel panel1 = new JPanel();

    JButton PlayGameButton = new JButton();
    JButton ChooseThemeButton = new JButton();
    JButton ScoreButton = new JButton();
    
    JLabel PlayGameLabel = new JLabel("Play Game");
    JLabel ChooseThemeLabel = new JLabel("Choose Theme");
    JLabel ScoreLabel = new JLabel("Score");
    
    Font ButtonFont = new Font("Gamix", Font.PLAIN, 40);
    Font TitleFont = new Font("Gamix", Font.PLAIN, 80);
    
    Color buttonColor = new Color(123,123,153, 7);
    
    JLayeredPane layeredPane = new JLayeredPane();
    public SelectionPage() {

    }

    public void runSelectionPage() {

        // title label properties
        TitleLabel.setForeground(Color.red);
        TitleLabel.setFont(TitleFont);

        // title panel properties
        titlepanel.setBounds(TitlePanelXcor, TitlePanelYcor, TitlePanelWidth, TitlePanelHeight);
        titlepanel.setOpaque(false);
        titlepanel.add(TitleLabel);
        
        //buttons properties
        PlayGameLabel.setFont(ButtonFont);
        PlayGameLabel.setForeground(Color.white);
        ChooseThemeLabel.setFont(ButtonFont);
        ChooseThemeLabel.setForeground(Color.white);
        ScoreLabel.setFont(ButtonFont);
        ScoreLabel.setForeground(Color.white);
        
        PlayGameButton.add(PlayGameLabel);
        PlayGameButton.setBorder(null);
        PlayGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        PlayGameButton.setBackground(buttonColor);
        PlayGameButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Theme theme = new Theme();
				theme.runTheme();
			}
        	
        });
      
        ChooseThemeButton.add( ChooseThemeLabel);
        ChooseThemeButton.setBorder(null);
        ChooseThemeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        ChooseThemeButton.setBackground(buttonColor);
       
        ScoreButton.add(ScoreLabel);
        ScoreButton.setBorder(null);
        ScoreButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        ScoreButton.setBackground(buttonColor);
        

        // button panel properties    
        ButtonPanel.setLayout(new BoxLayout(ButtonPanel, BoxLayout.Y_AXIS));
        ButtonPanel.setBounds(ButtonPanelXcor, ButtonPanelYcor, ButtonPanelWidth, ButtonPanelHeight);
        ButtonPanel.setOpaque(false);
        ButtonPanel.add(Box.createRigidArea(new Dimension(0, InbetweenButtonSpacing)));
        ButtonPanel.add(PlayGameButton);
        ButtonPanel.add(Box.createRigidArea(new Dimension(0, InbetweenButtonSpacing)));
        ButtonPanel.add(ChooseThemeButton);
        ButtonPanel.add(Box.createRigidArea(new Dimension(0, InbetweenButtonSpacing)));
        ButtonPanel.add(ScoreButton);

        // panel1 properties
        panel1.setBounds(0, 0, FrameWidth, FrameHeight);
        //panel1.setBackground(Color.blue);
        panel1.add(new BGDisplay(0));

        // Create a layered pane
        layeredPane.setLayout(null);
        layeredPane.setBounds(0, 0, FrameWidth, FrameHeight);

        // Add components to the layered pane with appropriate layers
        layeredPane.add(panel1, JLayeredPane.DEFAULT_LAYER); // panel1 at the back
        layeredPane.add(ButtonPanel, JLayeredPane.PALETTE_LAYER); // ButtonPanel at the front
        layeredPane.add(titlepanel, JLayeredPane.PALETTE_LAYER); // titlepanel at the front

        // Add the layered pane to the frame
        frame.setContentPane(layeredPane);

        // Make the frame visible
        frame.setSize(FrameWidth, FrameHeight);
        frame.setTitle("Welcome to Pong Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        SelectionPage sp = new SelectionPage();

        sp.runSelectionPage();
    }
}
