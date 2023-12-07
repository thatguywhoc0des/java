import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P4 {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("ToggleButton");
        frame.setSize(300, 150);

        // Create a JPanel with FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a JToggleButton
        JToggleButton toggleButton = new JToggleButton("Toggle Me");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    System.out.println("Button is selected");
                } else {
                    System.out.println("Button is not selected");
                }
            }
        });
 // Add components to the panel
        panel.add(toggleButton);
        frame.add(panel);
        frame.setVisible(true);
    }
}
