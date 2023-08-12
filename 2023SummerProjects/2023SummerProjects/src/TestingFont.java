import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;

import java.io.File;
import java.io.IOException;



public class TestingFont {



    private ArrayList<ImageIcon> ballThemeList = new ArrayList<>();
    private ArrayList<ImageIcon> padThemeList = new ArrayList<>();
    private ArrayList<ImageIcon> bgThemeList = new ArrayList<>();



    public TestingFont(){


//        ballThemeList.add(new ImageIcon("\"C:\\Users\\User\\Documents\\GitHub\\JavaProjects\\fireball.gif\""));
//        ballThemeList.add(new ImageIcon("\"C:\\Users\\User\\Documents\\GitHub\\JavaProjects\\electricball.gif\""));
//        ballThemeList.add(new ImageIcon("\"C:\\Users\\User\\Documents\\GitHub\\JavaProjects\\IceBall.gif\""));


    }

    /**
     * 
     */
    public void runTheme(){

        JFrame Themeframe = new JFrame();

        Font RetroFont ;
        JLabel TitleLabel = new JLabel("Select Theme");

        JPanel titlepanel = new JPanel();

        

        //setting up the custom font style
        try{
             
            String FontFilePath = "C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\Gamix.ttf";
            RetroFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(FontFilePath));
            
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(FontFilePath)));
            //setting the label to the font style
            TitleLabel.setFont(RetroFont.deriveFont(Font.PLAIN, 30));

            System.out.println(RetroFont.getName());
            System.out.println(RetroFont.getStyle());

            
            
        }
        catch(IOException | FontFormatException e){

            e.printStackTrace();
        }



        //label and panel for the title 
        TitleLabel.setForeground(Color.red);
        TitleLabel.setBounds(75,25,150,50);
        //TitleLabel.setFont(new Font("Arial",Font.PLAIN, 23));
         GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();

        for (String fontName : fontNames) {
            System.out.println(fontName);
        }

        
        titlepanel.setBackground(Color.yellow);
        titlepanel.setBounds(168,30, 150,50);
       
        titlepanel.add(TitleLabel);

        Themeframe.add(titlepanel);

        Themeframe.setTitle("Select Preferences");
        Themeframe.setSize(500,500);
        Themeframe.setLayout(null);
        Themeframe.setResizable(false);
        Themeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Themeframe.getContentPane().setBackground(Color.black);
        Themeframe.setVisible(true);

        

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

    public static void main (String[] main){

        TestingFont theme = new TestingFont();
       
        theme.runTheme();
    }


}
