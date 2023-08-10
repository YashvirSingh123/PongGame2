import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TestingBG {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Create a custom panel with the GIF as the background
        JPanel panel = new GifBackgroundPanel("C:\\Users\\User\\eclipse-workspace\\2023SummerProjects\\src\\IceBall.gif");

        // Add other components to the panel
        // ...

        // Set the panel as the content pane of the frame
        frame.setContentPane(panel);

        // Make the frame visible
        frame.setVisible(true);
    }

    static class GifBackgroundPanel extends JPanel {
        private BufferedImage backgroundImage;

        public GifBackgroundPanel(String imagePath) {
            try {
                backgroundImage = ImageIO.read(getClass().getResource(imagePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
            }
        }
    }
}
