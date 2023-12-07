import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P5 {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("RadioButton");
        frame.setSize(300, 150);

        // Create a JPanel with FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("male");
        JRadioButton radioButton2 = new JRadioButton("female");

        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("male selected");
            }
        });

        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("male selected");
            }
        });

        // Add radio buttons to the ButtonGroup
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        // Add components to the panel
        panel.add(radioButton1);
        panel.add(radioButton2);
        frame.add(panel);
        frame.setVisible(true);
    }
}
