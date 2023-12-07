import javax.swing.*;
import java.awt.*;

public class P2 {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Label_checkBox");
        frame.setSize(300, 150);

        // Create a JPanel with FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a JLabel
        JLabel label = new JLabel("Select an option:");

        // Create a JCheckBox
        JCheckBox checkBox = new JCheckBox("Enable feature");

        panel.add(label);
        panel.add(checkBox);
        frame.add(panel);
        frame.setVisible(true);
    }
}
