package gui;

import javax.swing.*;

public class Dashboard extends JFrame {

    public Dashboard() {

        setTitle("Online Reservation System");

        setSize(900,600);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);

        JTabbedPane tabs =
                new JTabbedPane();

        tabs.add(
                "Reservation",
                new ReservationForm()
        );

        tabs.add(
                "Cancellation",
                new CancellationForm()
        );

        add(tabs);

        setVisible(true);
    }
}