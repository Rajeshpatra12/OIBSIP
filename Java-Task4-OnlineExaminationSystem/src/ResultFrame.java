import javax.swing.*;
import java.awt.*;

public class ResultFrame extends JFrame {

    private User user;
    private ExamManager examManager;
    private int timeTaken;

    public ResultFrame(User user,
                       ExamManager examManager,
                       int timeTaken) {

        this.user = user;
        this.examManager = examManager;
        this.timeTaken = timeTaken;

        setTitle("Exam Result");
        setSize(700, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeUI();
    }

    private void initializeUI() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        int score = examManager.calculateScore();
        int total = examManager.getTotalQuestions();
        int correct = examManager.getCorrectAnswersCount();
        int wrong = examManager.getWrongAnswersCount();

        JLabel lblTitle =
                new JLabel("EXAM RESULT");

        lblTitle.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24));

        lblTitle.setBounds(
                250,
                20,
                250,
                30);

        JLabel lblStudent =
                new JLabel(
                        "Student : "
                                + user.getDisplayName());

        lblStudent.setBounds(
                50,
                80,
                300,
                25);

        JLabel lblScore =
                new JLabel(
                        "Score : "
                                + score
                                + "/"
                                + total);

        lblScore.setBounds(
                50,
                120,
                300,
                25);

        JLabel lblCorrect =
                new JLabel(
                        "Correct Answers : "
                                + correct);

        lblCorrect.setBounds(
                50,
                160,
                300,
                25);

        JLabel lblWrong =
                new JLabel(
                        "Wrong Answers : "
                                + wrong);

        lblWrong.setBounds(
                50,
                200,
                300,
                25);

        JLabel lblTime =
                new JLabel(
                        "Time Taken : "
                                + Utils.formatTime(
                                timeTaken));

        lblTime.setBounds(
                50,
                240,
                300,
                25);

        JTextArea resultArea =
                new JTextArea();

        resultArea.setEditable(false);

        resultArea.setText(
                examManager.getResultBreakdown());

        JScrollPane scrollPane =
                new JScrollPane(resultArea);

        scrollPane.setBounds(
                50,
                280,
                580,
                160);

        JButton btnLogout =
                new JButton("Logout");

        btnLogout.setBounds(
                270,
                460,
                120,
                40);

        panel.add(lblTitle);
        panel.add(lblStudent);
        panel.add(lblScore);
        panel.add(lblCorrect);
        panel.add(lblWrong);
        panel.add(lblTime);
        panel.add(scrollPane);
        panel.add(btnLogout);

        add(panel);

        btnLogout.addActionListener(
                e -> logout());
    }

    private void logout() {

        dispose();

        new LoginFrame()
                .setVisible(true);
    }
}