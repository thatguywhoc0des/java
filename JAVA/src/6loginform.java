import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P6{
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 150);

        // Create a JPanel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Create JLabels
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        // Create JTextFields
        JTextField userTextField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);

        // Create JButton
        JButton loginButton = new JButton("Login");

        // Add ActionListener to the button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                char[] password = passField.getPassword();
                // You can add your authentication logic here
                if (isValidUser(username, password)) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
                // Clear the password field for security reasons
                passField.setText("");
            }
        });

        // Add components to the panel
        panel.add(userLabel);
        panel.add(userTextField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(new JLabel()); // Empty label for layout
        panel.add(loginButton);
        frame.add(panel);
        frame.setVisible(true);
    }
    private static boolean isValidUser(String username, char[] password) {
        return username.equals("admin") && new String(password).equals("123");
    }
}
