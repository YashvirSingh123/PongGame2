import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TestingJButton extends JButton {

    private List<String> BallThemeLabel = new ArrayList<>();
    private List<String> CharacterThemeLabel = new ArrayList<>();
    private int BallcurrentIndex = 0;
    private int CharaccurrentIndex = 0;
    JLabel label = new JLabel();
    
    JLabel BallLabel = new JLabel();
    JLabel CharacLabel = new JLabel();
    
    public TestingJButton() {
    	
    	
    }
    
    public TestingJButton(String label) {
        // Populate the label list
      
      
        
    	BallThemeLabel.add("ICEY");
    	BallThemeLabel.add("FIREBALL");
    	BallThemeLabel.add("ELECTRO ");
    	
    	
    	CharacterThemeLabel.add("BLUEWY");
    	CharacterThemeLabel.add("PURPLE");
    	CharacterThemeLabel.add("GHOSTY ");
        
    	
       if(label.equals("Ball")) {
    	   
    	   addActionListener(new ActionListener() {
             	public void actionPerformed(ActionEvent e) {
             		setBackground(Color.gray);
             	}
             });
           

             // Create a timer to change the button label
             Timer timer = new Timer();
             timer.schedule(new TimerTask() {
                 @Override
                 public void run() {
                     updateButtonLabel("Ball");
                  
                 }
             }, 0, 2000); // Change label every 2 seconds

       }
       
      if(label.equals("Character")) {
    	
    	  addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		setBackground(Color.gray);
            	}
            });
          

            // Create a timer to change the button label
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    updateButtonLabel("Character");
                    
                }
            }, 0, 2000); // Change label every 2 seconds
      }
       
     
    }
    
    protected void paintComponent(Graphics g) {
    	if (getModel().isRollover()) {
            // If the button is pressed, use the clicked color
            setBackground(Color.gray);
        } else {
            // Otherwise, use the default color
            setBackground(Color.black);
        }
        super.paintComponent(g);
    }

    private void updateButtonLabel(String input) {
    	
    	if(input.equals("Ball")) {
    		
    		remove(label);
        	BallcurrentIndex = (BallcurrentIndex + 1) % BallThemeLabel.size();
            
           
        	label.setText(BallThemeLabel.get(BallcurrentIndex));
        	label.setForeground(Color.red);
        	label.setBackground(Color.red);
        	label.setFont( new Font("Gamix",Font.PLAIN, 25));
        	label.setHorizontalAlignment(JLabel.CENTER);
        	label.setBorder(null);
            
           add(label, BorderLayout.CENTER);
    	}
    
    	if(input.equals("Character")) {
    	
    		remove(label);
        	CharaccurrentIndex = (CharaccurrentIndex + 1) % CharacterThemeLabel.size();
            
           
        	label.setText(CharacterThemeLabel.get(CharaccurrentIndex));
        	label.setForeground(Color.red);
        	label.setBackground(Color.red);
        	label.setFont( new Font("Gamix",Font.PLAIN, 25));
        	label.setHorizontalAlignment(JLabel.CENTER);
        	label.setBorder(null);
            
           add(label, BorderLayout.CENTER);
    	
    	}
    	
    }
    
//    public void LabelProperties(List<String> ListType, int IndexType, JLabel label) {
//    	remove(label);
//    	IndexType = (IndexType + 1) % ListType.size();
//        
//       
//    	label.setText(ListType.get(IndexType));
//    	label.setForeground(Color.red);
//    	label.setBackground(Color.red);
//    	label.setFont( new Font("Gamix",Font.PLAIN, 25));
//    	label.setHorizontalAlignment(JLabel.CENTER);
//    	label.setBorder(null);
//        
//       add(label, BorderLayout.CENTER);
//    }
//    
//    public void LabelTransition(String inputText) {
//    	addActionListener(new ActionListener() {
//          	public void actionPerformed(ActionEvent e) {
//          		setBackground(Color.gray);
//          	}
//          });
//        
//
//          // Create a timer to change the button label
//          Timer timer = new Timer();
//          timer.schedule(new TimerTask() {
//              @Override
//              public void run() {
//                  updateButtonLabel(inputText);
//                  System.out.println("System running");
//              }
//          }, 0, 2000); // Change label every 2 seconds
//    }
    
    public String getButtonLabelText() {
    	return label.getText();
    }
}
    
    

   

