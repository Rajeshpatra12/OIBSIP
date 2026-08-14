import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerManager {

    private int remainingSeconds;
    private Timer timer;
    private JLabel timerLabel;
    private Runnable timeoutCallback;

    public TimerManager(int minutes,
                        JLabel timerLabel,
                        Runnable timeoutCallback) {

        this.remainingSeconds = minutes * 60;
        this.timerLabel = timerLabel;
        this.timeoutCallback = timeoutCallback;

        updateLabel();

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                remainingSeconds--;

                updateLabel();

                if (remainingSeconds <= 0) {

                    timer.stop();

                    if (timeoutCallback != null) {
                        timeoutCallback.run();
                    }
                }
            }
        });
    }

    private void updateLabel() {

        int min = remainingSeconds / 60;
        int sec = remainingSeconds % 60;

        timerLabel.setText(
                String.format(
                        "Time Left: %02d:%02d",
                        min,
                        sec
                )
        );
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    public int getRemainingSeconds() {
        return remainingSeconds;
    }

    public int getTimeTaken(int totalMinutes) {

        int totalSeconds = totalMinutes * 60;

        return totalSeconds - remainingSeconds;
    }
}