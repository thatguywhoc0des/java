import javax.swing.*;
import java.awt.*;

public class P3 {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("PasswordField");
        
        frame.setSize(300, 150);

        // Create a JPanel with FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a JLabel for the password field
        JLabel label = new JLabel("Password:");

        // Create a JPasswordField
        JPasswordField passwordField = new JPasswordField(15);

        // Add components to the panel
        panel.add(label);
        panel.add(passwordField);
        frame.add(panel);
        frame.setVisible(true);
    }
}
