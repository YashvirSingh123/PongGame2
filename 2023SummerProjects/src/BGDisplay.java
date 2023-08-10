import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BGDisplay  extends JPanel{

	
	 private ArrayList<ImageIcon> BGList = new ArrayList<>();
	 private int currentIndex = 0;
	 
	 public BGDisplay(int indexNumber) {
		 
		 BGList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\NewBGFive.gif"));
		 
		 BGList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\GamePanelBG.gif"));
		 
		 currentIndex = indexNumber; 
		 
		 JLabel imageLabel = new JLabel();
		 
	       imageLabel.setHorizontalAlignment(JLabel.CENTER);
	       add(imageLabel, BorderLayout.CENTER);
	        
	        
//	        //firstly i want to try to make it static but using timer to loop the image list
//	        class timerlistener implements ActionListener{
//
//	        			@Override
//	        	public void actionPerformed(ActionEvent e) {
//	   			// TODO Auto-generated method stub
//	        				
//	        				//looping the image list
//	        			currentIndex = (currentIndex + 1) % BGList.size();
//	                    imageLabel.setIcon(BGList.get(currentIndex));
//	                    
//	                  
//	        	}
//	        	
//	        }
//	        
//	        ActionListener action = new timerlistener();
//	        int speed = 2000;
//	        Timer animation = new Timer(speed, action);
//	        animation.start();


	        imageLabel.setIcon(BGList.get(currentIndex));
	 }
}
