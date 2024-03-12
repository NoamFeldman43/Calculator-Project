import javax.swing.*;
import java.awt.*;

public class BackgroundFrameExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Background Frame Example");

        // Set the size and layout of the frame
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        // Create a label with an image icon
        ImageIcon backgroundIcon = new ImageIcon("C:\\Users\\noamj\\Desktop\\Calculator Project\\src\\background.jpg"); // Path to your image file
        JLabel backgroundLabel = new JLabel(backgroundIcon);

        // Set the layout of the label to fit the frame
        backgroundLabel.setLayout(new BorderLayout());

        // Add components or panels onto the background label as needed
        // For example:
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());
        contentPanel.setOpaque(false); // Make the panel transparent
        contentPanel.add(new JButton("Button 1"));
        contentPanel.add(new JButton("Button 2"));
        backgroundLabel.add(contentPanel, BorderLayout.CENTER);

        // Add the background label to the frame
        frame.setContentPane(backgroundLabel);

        // Set the frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}