import javax.swing.*;
import java.awt.*;

public class ProfileFrame extends JFrame {

    private User user;

    private JTextField txtDisplayName;
    private JPasswordField txtNewPassword;

    private JButton btnSave;
    private JButton btnStartExam;

    public ProfileFrame(User user) {

        this.user = user;

        setTitle("Update Profile");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        initializeUI();
    }

    private void initializeUI() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblTitle =
                new JLabel("PROFILE SETTINGS");

        lblTitle.setFont(
                new Font("Arial",
                        Font.BOLD,
                        20));

        lblTitle.setBounds(
                130,
                20,
                250,
                30);

        JLabel lblName =
                new JLabel("Display Name:");

        lblName.setBounds(
                70,
                90,
                120,
                25);

        txtDisplayName =
                new JTextField(
                        user.getDisplayName());

        txtDisplayName.setBounds(
                200,
                90,
                200,
                25);

        JLabel lblPassword =
                new JLabel("New Password:");

        lblPassword.setBounds(
                70,
                140,
                120,
                25);

        txtNewPassword =
                new JPasswordField(
                        user.getPassword());

        txtNewPassword.setBounds(
                200,
                140,
                200,
                25);

        btnSave =
                new JButton("Save");

        btnSave.setBounds(
                100,
                230,
                120,
                40);

        btnStartExam =
                new JButton("Start Exam");

        btnStartExam.setBounds(
                250,
                230,
                120,
                40);

        panel.add(lblTitle);
        panel.add(lblName);
        panel.add(txtDisplayName);
        panel.add(lblPassword);
        panel.add(txtNewPassword);
        panel.add(btnSave);
        panel.add(btnStartExam);

        add(panel);

        btnSave.addActionListener(
                e -> updateProfile());

        btnStartExam.addActionListener(
                e -> startExam());
    }

    private void updateProfile() {

        String displayName =
                txtDisplayName
                        .getText()
                        .trim();

        String password =
                String.valueOf(
                        txtNewPassword
                                .getPassword());

        if (displayName.isEmpty()
                || password.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Fields cannot be empty"
            );

            return;
        }

        user.setDisplayName(
                displayName);

        user.setPassword(
                password);

        JOptionPane.showMessageDialog(
                this,
                "Profile Updated Successfully"
        );
    }

    private void startExam() {

        if (txtDisplayName
                .getText()
                .trim()
                .isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter Display Name"
            );

            return;
        }

        user.setDisplayName(
                txtDisplayName
                        .getText()
                        .trim());

        dispose();

        ExamManager examManager =
                new ExamManager();

        new ExamFrame(
                user,
                examManager
        ).setVisible(true);
    }
}