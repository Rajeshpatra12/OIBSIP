package gui;

import service.ReservationService;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    private ReservationService service =
            new ReservationService();

    public LoginForm() {

        setTitle("Online Reservation System - Login");
        setSize(400,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel =
                new JPanel(new GridLayout(3,2,10,10));

        panel.setBorder(
                BorderFactory.createEmptyBorder(
                        20,20,20,20
                )
        );

        panel.add(new JLabel("Username"));

        txtUsername = new JTextField();
        panel.add(txtUsername);

        panel.add(new JLabel("Password"));

        txtPassword = new JPasswordField();
        panel.add(txtPassword);

        btnLogin = new JButton("Login");
        panel.add(btnLogin);

        add(panel);

        btnLogin.addActionListener(e -> login());

        setVisible(true);
    }

    private void login() {

        String username =
                txtUsername.getText().trim();

        String password =
                String.valueOf(
                        txtPassword.getPassword()
                );

        if(service.validateLogin(
                username,
                password
        )) {

            JOptionPane.showMessageDialog(
                    this,
                    "Login Successful"
            );

            dispose();

            new Dashboard();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Invalid Username or Password"
            );
        }
    }
}