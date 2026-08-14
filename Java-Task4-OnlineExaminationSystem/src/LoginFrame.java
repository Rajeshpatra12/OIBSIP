import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnExit;

    public LoginFrame() {

        setTitle("Online Examination System - Login");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        initializeUI();
    }

    private void initializeUI() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblTitle = new JLabel("ONLINE EXAMINATION SYSTEM");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(55, 20, 350, 30);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(60, 80, 100, 25);

        txtUsername = new JTextField();
        txtUsername.setBounds(160, 80, 180, 25);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(60, 120, 100, 25);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(160, 120, 180, 25);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 190, 100, 35);

        btnExit = new JButton("Exit");
        btnExit.setBounds(230, 190, 100, 35);

        panel.add(lblTitle);
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        panel.add(btnExit);

        add(panel);

        btnLogin.addActionListener(e -> login());

        btnExit.addActionListener(e -> System.exit(0));
    }

    private void login() {

        String username = txtUsername.getText().trim();
        String password = String.valueOf(txtPassword.getPassword());

        if (username.equals("admin")
                && password.equals("1234")) {

            User user = new User(
                    username,
                    password,
                    "Student"
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Login Successful"
            );

            dispose();

            new ProfileFrame(user).setVisible(true);

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Invalid Username or Password"
            );
        }
    }
}