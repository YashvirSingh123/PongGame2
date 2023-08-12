import javax.swing.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;

public class OppositeCharacter extends JPanel{
	
	
	
	  	private ArrayList<ImageIcon> OppoPurpleSet = new ArrayList<>();
	    private ArrayList<ImageIcon> OppoGhostySet = new ArrayList<>();
	    private ArrayList<ImageIcon> OppoBluewySet = new ArrayList<>();
	 
	    private ArrayList<ImageIcon> currentList = new ArrayList<>();
		
	    
		JLabel imageLabel = new JLabel();
	    
		int num;
		
	    private int currentIndex = 0;
	  
	    Random rand = new Random();
	    int RandomNum;

	    public OppositeCharacter() {
	    	
	    	OppoPurpleSet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\OppositePurpleRunUp.gif"));
	    	//OppoPurpleSet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\FlippedSmallFire.gif"));
	    	
	    	OppoGhostySet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\OppositeGhostyRunUp.gif"));
	    	//OppoGhostySet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\FlippedSmallElectro.gif"));
	    	
	    	OppoBluewySet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\OppositeBluewyRunUp.gif"));
	    	//OppoBluewySet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\FlippedSmallBlue.gif"));
	    
	    	setOpaque(false);
	        
	    	RandomNum = rand.nextInt(0, 3);
	    	
	       if(RandomNum==0) {
	    	   
	    	  
	    	  currentList = OppoPurpleSet;
	    	  imageLabel.setHorizontalAlignment(JLabel.CENTER);
		       add(imageLabel, BorderLayout.CENTER);
		       imageLabel.setIcon(currentList.get(currentIndex));
	       }
	    
	       else if(RandomNum==1) {
	    	   
	    	   
	    	   currentList = OppoBluewySet;
	    	   imageLabel.setHorizontalAlignment(JLabel.CENTER);
		       add(imageLabel, BorderLayout.CENTER);
		       imageLabel.setIcon(currentList.get(currentIndex));
		       }
	       
	       
	       else if(RandomNum==2) {
	    	   
	    	   
	    	   currentList = OppoGhostySet;
	    	   imageLabel.setHorizontalAlignment(JLabel.CENTER);
		       add(imageLabel, BorderLayout.CENTER);
		       imageLabel.setIcon(currentList.get(currentIndex));
	      
	    }
	       
	  }
	    
	    public void settingOppoCharacter() {
	    	
	    	 
		    
	    	 
	    	 if(num == 1) {
		        
		        imageLabel.setHorizontalAlignment(JLabel.CENTER);
 		       add(imageLabel, BorderLayout.CENTER);
 		       }
		    
	    	 num ++;
	    	 
		     
	    	 imageLabel.setIcon(currentList.get(currentIndex));
		                  

		        
		        
	    }
}
