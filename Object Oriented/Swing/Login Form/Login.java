package Shoib;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{

    private JPanel panel1;
    private JTextField userText;
    private JPasswordField password;
    private JButton loginButton;
    private JFrame frame;

    public Login(){
        frame = new JFrame("Login Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250, 200));
        frame.setResizable(false);

        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
