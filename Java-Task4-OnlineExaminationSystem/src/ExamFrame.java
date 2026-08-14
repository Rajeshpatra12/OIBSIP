import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExamFrame extends JFrame {

    private User user;
    private ExamManager examManager;

    private JLabel lblStudent;
    private JLabel lblQuestionNumber;
    private JLabel lblQuestion;
    private JLabel lblTimer;

    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private JRadioButton rb4;

    private ButtonGroup buttonGroup;

    private JButton btnPrevious;
    private JButton btnNext;
    private JButton btnSubmit;

    private int currentQuestion = 0;

    private TimerManager timerManager;

    private final int EXAM_DURATION = 30;

    public ExamFrame(User user,
                     ExamManager examManager) {

        this.user = user;
        this.examManager = examManager;

        setTitle("Online Examination System");
        setSize(850, 550);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                JFrame.DO_NOTHING_ON_CLOSE);

        initializeUI();

        addWindowListener(
                new WindowAdapter() {

                    @Override
                    public void windowClosing(
                            WindowEvent e) {

                        int choice =
                                JOptionPane.showConfirmDialog(
                                        ExamFrame.this,
                                        "Are you sure you want to quit the exam?",
                                        "Confirm Exit",
                                        JOptionPane.YES_NO_OPTION
                                );

                        if (choice ==
                                JOptionPane.YES_OPTION) {

                            System.exit(0);
                        }
                    }
                });

        loadQuestion();

        timerManager =
                new TimerManager(
                        EXAM_DURATION,
                        lblTimer,
                        this::autoSubmit
                );

        timerManager.start();
    }

    private void initializeUI() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        lblStudent =
                new JLabel(
                        "Student: "
                                + user.getDisplayName());

        lblStudent.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16));

        lblStudent.setBounds(
                30,
                20,
                300,
                30);

        lblTimer =
                new JLabel();

        lblTimer.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16));

        lblTimer.setForeground(
                Color.RED);

        lblTimer.setBounds(
                620,
                20,
                180,
                30);

        lblQuestionNumber =
                new JLabel();

        lblQuestionNumber.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15));

        lblQuestionNumber.setBounds(
                30,
                80,
                300,
                30);

        lblQuestion =
                new JLabel();

        lblQuestion.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        16));

        lblQuestion.setBounds(
                30,
                120,
                760,
                40);

        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        rb3 = new JRadioButton();
        rb4 = new JRadioButton();

        rb1.setBounds(60, 200, 500, 30);
        rb2.setBounds(60, 240, 500, 30);
        rb3.setBounds(60, 280, 500, 30);
        rb4.setBounds(60, 320, 500, 30);

        buttonGroup = new ButtonGroup();

        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        buttonGroup.add(rb3);
        buttonGroup.add(rb4);

        btnPrevious =
                new JButton("Previous");

        btnPrevious.setBounds(
                140,
                420,
                120,
                40);

        btnNext =
                new JButton("Next");

        btnNext.setBounds(
                340,
                420,
                120,
                40);

        btnSubmit =
                new JButton("Submit");

        btnSubmit.setBounds(
                540,
                420,
                120,
                40);

        panel.add(lblStudent);
        panel.add(lblTimer);
        panel.add(lblQuestionNumber);
        panel.add(lblQuestion);

        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);
        panel.add(rb4);

        panel.add(btnPrevious);
        panel.add(btnNext);
        panel.add(btnSubmit);

        add(panel);

        btnNext.addActionListener(
                e -> nextQuestion());

        btnPrevious.addActionListener(
                e -> previousQuestion());

        btnSubmit.addActionListener(
                e -> submitExam());
    }

    private void loadQuestion() {

        Question question =
                examManager.getQuestion(
                        currentQuestion);

        lblQuestionNumber.setText(
                "Question "
                        + (currentQuestion + 1)
                        + " of "
                        + examManager.getTotalQuestions());

        lblQuestion.setText(
                question.getQuestionText());

        String[] options =
                question.getOptions();

        rb1.setText(options[0]);
        rb2.setText(options[1]);
        rb3.setText(options[2]);
        rb4.setText(options[3]);

        buttonGroup.clearSelection();

        int savedAnswer =
                examManager.getSavedAnswer(
                        currentQuestion);

        if (savedAnswer == 0)
            rb1.setSelected(true);

        else if (savedAnswer == 1)
            rb2.setSelected(true);

        else if (savedAnswer == 2)
            rb3.setSelected(true);

        else if (savedAnswer == 3)
            rb4.setSelected(true);
    }

    private void saveCurrentAnswer() {

        int selectedAnswer = -1;

        if (rb1.isSelected())
            selectedAnswer = 0;

        else if (rb2.isSelected())
            selectedAnswer = 1;

        else if (rb3.isSelected())
            selectedAnswer = 2;

        else if (rb4.isSelected())
            selectedAnswer = 3;

        examManager.saveAnswer(
                currentQuestion,
                selectedAnswer);
    }

    private void nextQuestion() {

        saveCurrentAnswer();

        if (currentQuestion <
                examManager.getTotalQuestions() - 1) {

            currentQuestion++;

            loadQuestion();
        }
    }

    private void previousQuestion() {

        saveCurrentAnswer();

        if (currentQuestion > 0) {

            currentQuestion--;

            loadQuestion();
        }
    }

    private void submitExam() {

        int choice =
                JOptionPane.showConfirmDialog(
                        this,
                        "Are you sure you want to submit?",
                        "Confirm Submission",
                        JOptionPane.YES_NO_OPTION);

        if (choice ==
                JOptionPane.YES_OPTION) {

            finishExam();
        }
    }

    private void autoSubmit() {

        JOptionPane.showMessageDialog(
                this,
                "Time is over.\nExam submitted automatically.");

        finishExam();
    }

    private void finishExam() {

        saveCurrentAnswer();

        timerManager.stop();

        int timeTaken =
                timerManager.getTimeTaken(
                        EXAM_DURATION);

        dispose();

        new ResultFrame(
                user,
                examManager,
                timeTaken
        ).setVisible(true);
    }
}