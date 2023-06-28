package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sign_in extends JDialog {
    private JTextField tfEmail;
    private JTextField tfPassword;
    private JButton btnOK;
    private JButton btnCancel;
    private JPanel loginPanel;
    private JPasswordField pfPassword;

    public Sign_in(JFrame parent){
        super(parent);
        setTitle("Login");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String[] args) {
        Sign_in loginForm = new Sign_in(null);
    }
}
