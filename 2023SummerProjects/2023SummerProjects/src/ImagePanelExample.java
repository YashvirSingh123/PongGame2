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

public class ImagePanelExample extends JPanel {
    private ArrayList<ImageIcon> imageList = new ArrayList<>();
    
    private ArrayList<ImageIcon> imageList2 = new ArrayList<>();
    
    private ArrayList<ImageIcon> currentList = new ArrayList<>();
    
    private int currentIndex = 0;
    
    

    public ImagePanelExample() {
    	
    	imageList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\third-removebg.png"));
        imageList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\second-removebg.png"));
        imageList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\third-removebg.png"));
        imageList.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\fifth-removebg.png"));
        
        imageList2.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\third-left.png"));
        imageList2.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\second-left.png"));
        imageList2.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\third-left.png"));
        imageList2.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\fifth-left.png"));
        
      ImageIcon fireball = new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\DisplayFireball.gif");
//        Image originalImage = fireball.getImage();
//        BufferedImage resizedImage = new BufferedImage(50,50, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2 = resizedImage.createGraphics();
//        g2.drawImage(originalImage, 0, 0, 50,50, null);
//        g2.dispose();
      currentList.add(fireball);
//        
        setPreferredSize(new Dimension(200, 200));
        setLayout(new BorderLayout());
        
       // currentList = imageList;

        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
       add(imageLabel, BorderLayout.CENTER);
        

//        //forward button 
//        JButton forwardButton = new JButton("Forward");
//        forwardButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentIndex = (currentIndex + 1) % imageList.size();
//                imageLabel.setIcon(imageList.get(currentIndex));
//            }
//        });
//
//        //backward button 
//        JButton backwardButton = new JButton("Backward");
//        backwardButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentIndex = (currentIndex - 1 + imageList.size()) % imageList.size();
//                imageLabel.setIcon(imageList.get(currentIndex));
//            }
//        });
        
        //firstly i want to try to make it static but using timer to loop the image list
        class timerlistener implements ActionListener{

        			@Override
        	public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
        				
        				//looping the image list
        			currentIndex = (currentIndex + 1) % currentList.size();
                    imageLabel.setIcon(currentList.get(currentIndex));
                    
                  
        	}
        	
        }
        
        ActionListener action = new timerlistener();
        int speed = 250;
        Timer animation = new Timer(speed, action);
        animation.start();

        //adding the buttons into another panel
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(backwardButton);
//        buttonPanel.add(forwardButton);
//        add(buttonPanel, BorderLayout.SOUTH);

        imageLabel.setIcon(currentList.get(currentIndex));
    }
    
    public void SetCurrentList(boolean switchlist) {
    	
    	if(switchlist) {
    		currentList = imageList;
    	}
    	else {
    		currentList = imageList2;
    	}
    }
    
    public void movePenguin(ImagePanelExample panel) {
    	
    	class timerlistener2 implements ActionListener{

    		int switcherx = 0;
    		int switchery = 0;
    		int Xcor;
    		int Ycor;
    		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  //algorithm to move panel
                if(Ycor == 500) {
					switchery = 3;
				}
				if(Ycor == 30) {
					switchery = 2;
				}
				if(switcherx % 2 == 0) {
					Xcor = Xcor + 5;
				
					panel.setLocation(Xcor, Ycor);
					
					
				}
				if(switcherx % 2!= 0) {
					Xcor = Xcor -5 ;
				
					panel.setLocation(Xcor, Ycor);
				}
				if(switchery % 2 == 0) {
					
					Ycor = Ycor + 5;
					panel.setLocation(Xcor, Ycor);
					
				}
				if(switchery % 2!= 0) {
					
					Ycor = Ycor - 5;
					panel.setLocation(Xcor, Ycor);
					
				}
			}
    		
    	}
    }

    public static void main(String[] args) {
        List<ImageIcon> images = new ArrayList<>();
        images.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\third-removebg.png"));
        images.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\second-removebg.png"));
        images.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\third-removebg.png"));
        images.add(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\fifth-removebg.png"));
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
               
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Animation Example");
                ImagePanelExample panel = new ImagePanelExample();
//                panel.movePenguin(panel);
                frame.getContentPane().add(panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
