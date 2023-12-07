import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P1 {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("P_1");
        
        frame.setSize(400, 200);

        // Create a JPanel with FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a JTextField
        JTextField textField = new JTextField("", 15);

        // Create a JTextArea
        JTextArea textArea = new JTextArea("", 5, 20);

        // Create a JButton
        JButton button = new JButton("Click Me");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                textArea.append("\n" + inputText);
                textField.setText("");
            }
        });

        // Add components to the panel
        panel.add(textField);
        panel.add(button);
        panel.add(textArea);
        frame.add(panel);
        frame.setVisible(true);
    }
}
