
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TestingSlideTransition extends JPanel {

    private ArrayList<ImageIcon> imageList;
    private JLabel label;
    private int currentIndex;

    public TestingSlideTransition() {
        imageList = new ArrayList<>();
        currentIndex = 0;

        label = new JLabel();
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
    }

    public void setImageList(ArrayList<ImageIcon> images) {
        imageList = images;
        currentIndex = 0;
        showCurrentImage();
    }

    private void showCurrentImage() {
        if (currentIndex >= 0 && currentIndex < imageList.size()) {
            label.setIcon(imageList.get(currentIndex));
        }
    }

    public void startSlideshow(int delay) {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentIndex++;
                if (currentIndex >= imageList.size()) {
                    currentIndex = 0;
                }
                showCurrentImage();
            }
        };
        Timer timer = new Timer(delay, listener);
        timer.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TestingSlideTransition ballDisplay = new TestingSlideTransition();
        ArrayList<ImageIcon> ballImages = new ArrayList<>();
        ballImages.add(new ImageIcon("DisplayFireball.gif"));
        ballImages.add(new ImageIcon("DisplayElectricball.gif"));
        ballImages.add(new ImageIcon("DisplayIceball.gif"));
        ballDisplay.setImageList(ballImages);
        ballDisplay.startSlideshow(2000); // Change the delay (in milliseconds) according to your needs

        frame.add(ballDisplay);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
