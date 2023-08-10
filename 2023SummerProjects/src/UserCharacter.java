import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserCharacter extends JPanel {


    private ArrayList<ImageIcon> UserPurplyCharacter = new ArrayList<>();
    private ArrayList<ImageIcon> UserGhostyCharacter = new ArrayList<>();
    private ArrayList<ImageIcon> UserBlueyCharacter = new ArrayList<>();
 
    private ArrayList<ImageIcon> currentList = new ArrayList<>();
	int num = 1 ;
	JLabel imageLabel = new JLabel();
    
    private int currentIndex = 0;
  
    private String ball_label_text;
    
    private boolean switcherSides  ;
    

    public UserCharacter(String inputType) {
    	
    	UserPurplyCharacter.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\UserPurplyRunningUp.gif"));
    	
    	
    	UserGhostyCharacter.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\UserGhostyRunningUp.gif"));
    	
    	
    	UserBlueyCharacter.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\UserBlueyRunningUp.gif"));
    	
    	setOpaque(false);
        
       if(inputType.equals("PURPLE")) {
    	   
    	  
    	  currentList = UserPurplyCharacter;
    	  imageLabel.setHorizontalAlignment(JLabel.CENTER);
	       add(imageLabel, BorderLayout.CENTER);
	       imageLabel.setIcon(currentList.get(currentIndex));
    	 
       }
    
       else if(inputType.equals("BLUEWY")) {
    	   
    	  
    	   currentList = UserBlueyCharacter;
    	   imageLabel.setHorizontalAlignment(JLabel.CENTER);
	       add(imageLabel, BorderLayout.CENTER);
	       imageLabel.setIcon(currentList.get(currentIndex));
    	   
	       }
       
       
       else if(inputType.equals("GHOSTY ")) {
    	   
    	
    	   currentList = UserGhostyCharacter;
    	   imageLabel.setHorizontalAlignment(JLabel.CENTER);
	       add(imageLabel, BorderLayout.CENTER);
	       imageLabel.setIcon(currentList.get(currentIndex));
    	   
      
    }
       
  }
    
  
    
   
}
