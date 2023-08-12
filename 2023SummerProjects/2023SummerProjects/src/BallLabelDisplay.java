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

public class BallLabelDisplay extends JPanel {
	
	

    private ArrayList<ImageIcon> BallList = new ArrayList<>();
    private ArrayList<ImageIcon> CharacterList = new ArrayList<>();
    private ArrayList<ImageIcon> BGList = new ArrayList<>();
    
    
    private int currentIndex = 0;
  
    
    private String ball_label_text;
    private String character_label_text;
    
    
	
    

    public BallLabelDisplay(String InputType) {
    	
    	BallList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\SmallFireball.gif"));
    	BallList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\SmallElectricball.gif"));
    	BallList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\SmallIceball.gif"));
    	
    
    	CharacterList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\PurpleDude.gif"));
    	CharacterList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\GhostDude.gif"));
    	CharacterList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\BlueDude.gif"));
    	
    
    	
    	//BGList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\TempoBG.gif"));
    	BGList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\NewBGFive.gif"));
    	
    	
    
    	
    	setOpaque(false);
        
       if(InputType.equals("BallDisplay")) {
    	   
    	   

        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
       add(imageLabel, BorderLayout.CENTER);
        
      
        //firstly i want to try to make it static but using timer to loop the image list
        class timerlistener implements ActionListener{

        			@Override
        	public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
        				
        				//looping the image list
        			currentIndex = (currentIndex + 1) % BallList.size();
                    imageLabel.setIcon(BallList.get(currentIndex));
                   
                  
        	}
        	
        }
        
        ActionListener action = new timerlistener();
        int speed = 2000;
        Timer animation = new Timer(speed, action);
        animation.start();

        
       
        imageLabel.setIcon(BallList.get(currentIndex));
       }
    
    
    
    if(InputType.equals("CharacterDisplay")) {
    	
    	 JLabel imageLabel = new JLabel();
         imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);
         
         
         //firstly i want to try to make it static but using timer to loop the image list
         class timerlistener implements ActionListener{

         			@Override
         	public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
         				
         				//looping the image list
         			currentIndex = (currentIndex + 1) % CharacterList.size();
                     imageLabel.setIcon(CharacterList.get(currentIndex));
                    
                   
         	}
         	
         }
         
         ActionListener action = new timerlistener();
         int speed = 2000;
         Timer animation = new Timer(speed, action);
         animation.start();

        
         imageLabel.setIcon(CharacterList.get(currentIndex));
        }
    
    	
    if(InputType.equals("BGDisplay")) {
    	
    	JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
       add(imageLabel, BorderLayout.CENTER);
        
        
        //firstly i want to try to make it static but using timer to loop the image list
        class timerlistener implements ActionListener{

        			@Override
        	public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
        				
        				//looping the image list
        			currentIndex = (currentIndex + 1) % BGList.size();
                    imageLabel.setIcon(BGList.get(currentIndex));
                    
                  
        	}
        	
        }
        
        ActionListener action = new timerlistener();
        int speed = 2000;
        Timer animation = new Timer(speed, action);
        animation.start();


        imageLabel.setIcon(BGList.get(currentIndex));
    	
    }
    
    
    
    }
    
  
    
  

  }
  

