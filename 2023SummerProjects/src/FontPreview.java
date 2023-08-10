import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FontPreview extends JPanel {

    private static final String[] FONT_NAMES = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

    @Override
    public Dimension getPreferredSize() {
        int height = FONT_NAMES.length * 40;
        return new Dimension(200, height);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int y = 30;
        for (String fontName : FONT_NAMES) {
            Font font = new Font(fontName, Font.PLAIN, 20);
            g.setFont(font);
            g.drawString(fontName, 20, y);
            y += 30;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Font Preview");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        // Create the FontPreview panel
        FontPreview fontPreview = new FontPreview();

        // Create a JScrollPane and add the FontPreview panel to it
        JScrollPane scrollPane = new JScrollPane(fontPreview);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Add the scroll pane to the frame
        frame.getContentPane().add(scrollPane);

        frame.setVisible(true);
    }
}
