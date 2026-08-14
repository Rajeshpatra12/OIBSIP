import java.util.ArrayList;
import java.util.List;

public class ExamManager {

    private List<Question> questions;
    private int[] userAnswers;

    public ExamManager() {

        questions = new ArrayList<>();

        loadQuestions();

        userAnswers = new int[questions.size()];

        for (int i = 0; i < userAnswers.length; i++) {
            userAnswers[i] = -1;
        }
    }

    private void loadQuestions() {

        questions.add(new Question(
                "What is Java?",
                new String[]{
                        "Programming Language",
                        "Database",
                        "Operating System",
                        "Browser"
                },
                0));

        questions.add(new Question(
                "JVM stands for?",
                new String[]{
                        "Java Variable Machine",
                        "Java Virtual Machine",
                        "Java Verified Machine",
                        "Joint Virtual Machine"
                },
                1));

        questions.add(new Question(
                "Which package is used for GUI?",
                new String[]{
                        "java.sql",
                        "java.net",
                        "java.io",
                        "javax.swing"
                },
                3));

        questions.add(new Question(
                "Which keyword is used for inheritance?",
                new String[]{
                        "extends",
                        "implements",
                        "inherit",
                        "super"
                },
                0));

        questions.add(new Question(
                "Which collection stores unique values?",
                new String[]{
                        "ArrayList",
                        "LinkedList",
                        "HashSet",
                        "Vector"
                },
                2));

        questions.add(new Question(
                "Which company developed Java?",
                new String[]{
                        "Google",
                        "Sun Microsystems",
                        "Microsoft",
                        "IBM"
                },
                1));

        questions.add(new Question(
                "Which method starts a thread?",
                new String[]{
                        "execute()",
                        "run()",
                        "start()",
                        "begin()"
                },
                2));

        questions.add(new Question(
                "Java is a ____ language.",
                new String[]{
                        "Compiled",
                        "Interpreted",
                        "Both",
                        "None"
                },
                2));

        questions.add(new Question(
                "Which operator compares values?",
                new String[]{
                        "=",
                        "==",
                        "!=",
                        "&&"
                },
                1));

        questions.add(new Question(
                "Default value of int?",
                new String[]{
                        "0",
                        "1",
                        "null",
                        "-1"
                },
                0));
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public Question getQuestion(int index) {
        return questions.get(index);
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    public void saveAnswer(int questionIndex, int answer) {

        if (questionIndex >= 0 &&
                questionIndex < userAnswers.length) {

            userAnswers[questionIndex] = answer;
        }
    }

    public int getSavedAnswer(int questionIndex) {

        if (questionIndex >= 0 &&
                questionIndex < userAnswers.length) {

            return userAnswers[questionIndex];
        }

        return -1;
    }

    public int[] getUserAnswers() {
        return userAnswers;
    }

    public int calculateScore() {

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {

            if (userAnswers[i] ==
                    questions.get(i).getCorrectAnswer()) {

                score++;
            }
        }

        return score;
    }

    public int getCorrectAnswersCount() {

        int count = 0;

        for (int i = 0; i < questions.size(); i++) {

            if (userAnswers[i] ==
                    questions.get(i).getCorrectAnswer()) {

                count++;
            }
        }

        return count;
    }

    public int getWrongAnswersCount() {

        return questions.size() - getCorrectAnswersCount();
    }

    public String getResultBreakdown() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < questions.size(); i++) {

            sb.append("Question ")
                    .append(i + 1)
                    .append(": ");

            if (userAnswers[i] ==
                    questions.get(i).getCorrectAnswer()) {

                sb.append("Correct");
            } else {
                sb.append("Wrong");
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}