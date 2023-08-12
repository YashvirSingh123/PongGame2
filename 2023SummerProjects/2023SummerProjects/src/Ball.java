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

public class Ball extends JPanel{
	


		
		

	    private ArrayList<ImageIcon> FireballSet = new ArrayList<>();
	    private ArrayList<ImageIcon> ElectroballSet = new ArrayList<>();
	    private ArrayList<ImageIcon> IceballSet = new ArrayList<>();
	 
	    private ArrayList<ImageIcon> currentList = new ArrayList<>();
		int num = 1 ;
		JLabel imageLabel = new JLabel();
	    
	    private int currentIndex = 0;
	  
	    private String ball_label_text;
	    
	    private boolean switcherSides  ;
	    

	    public Ball(String inputType) {
	    	
	    	FireballSet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\SmallFireball.gif"));
	    	FireballSet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\FlippedSmallFire.gif"));
	    	
	    	ElectroballSet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\SmallElectricball.gif"));
	    	ElectroballSet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\FlippedSmallElectro.gif"));
	    	
	    	IceballSet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\SmallIceball.gif"));
	    	IceballSet.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\FlippedSmallBlue.gif"));
	    
	    	setOpaque(false);
	        
	       if(inputType.equals("FIREBALL")) {
	    	   
	    	  System.out.println("Selected Fireball : from ball class");
	    	  currentList = FireballSet;
	       }
	    
	       else if(inputType.equals("ICEY")) {
	    	   
	    	   System.out.println("Selected Iceball : from ball class");
	    	   currentList = IceballSet;
		        
		       }
	       
	       
	       else if(inputType.equals("ELECTRO ")) {
	    	   
	    	   System.out.println("Selected Electricball : from ball class");
	    	   currentList = ElectroballSet;
		       
	      
	    }
	       
	  }
	    
	    public void switcher(boolean switcher) {
	    	switcherSides = switcher;
	       }
	    
	    public void settingGif() {
	    	
	    	 
	    
	    	 
	    	 if(num == 1) {
		        
		        imageLabel.setHorizontalAlignment(JLabel.CENTER);
  		       add(imageLabel, BorderLayout.CENTER);
  		       }
		    
	    	 num ++;
	    	 
		        if(switcherSides) {
		        	
		        			currentIndex =0;
		                    imageLabel.setIcon(currentList.get(currentIndex));
		                  
		     		        
		                    System.out.println("fireball straight");
		        }         
		        else  {	
		        	
		        	currentIndex = 1;
		        	imageLabel.setIcon(currentList.get(currentIndex));
		        	
		        	System.out.println("fireball flipped");
		        }
		        
		        
	    }
	    
}
