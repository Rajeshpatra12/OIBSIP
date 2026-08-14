package gui;

import model.Reservation;
import service.ReservationService;

import javax.swing.*;
import java.awt.*;

public class CancellationForm extends JPanel {

    private JTextField txtPNR;

    private JTextArea txtDetails;

    private JButton btnFetch;
    private JButton btnCancel;

    private ReservationService service =
            new ReservationService();

    public CancellationForm() {

        setLayout(new BorderLayout());

        JPanel top =
                new JPanel();

        top.add(new JLabel("PNR"));

        txtPNR = new JTextField(20);
        top.add(txtPNR);

        btnFetch = new JButton("Fetch");
        top.add(btnFetch);

        add(top, BorderLayout.NORTH);

        txtDetails = new JTextArea();

        txtDetails.setEditable(false);

        add(
                new JScrollPane(txtDetails),
                BorderLayout.CENTER
        );

        btnCancel =
                new JButton(
                        "Cancel Reservation"
                );

        add(
                btnCancel,
                BorderLayout.SOUTH
        );

        btnFetch.addActionListener(
                e -> fetchReservation()
        );

        btnCancel.addActionListener(
                e -> cancelReservation()
        );
    }

    private void fetchReservation() {

        String pnr =
                txtPNR.getText().trim();

        Reservation reservation =
                service.fetchReservation(
                        pnr
                );

        if (reservation == null) {

            JOptionPane.showMessageDialog(
                    this,
                    "PNR Not Found"
            );

            txtDetails.setText("");

            return;
        }

        txtDetails.setText(
                "PNR : "
                        + reservation.getPnr()
                        + "\nPassenger : "
                        + reservation.getPassengerName()
                        + "\nTrain Number : "
                        + reservation.getTrainNumber()
                        + "\nTrain Name : "
                        + reservation.getTrainName()
                        + "\nClass : "
                        + reservation.getClassType()
                        + "\nJourney Date : "
                        + reservation.getJourneyDate()
                        + "\nSource : "
                        + reservation.getSourceStation()
                        + "\nDestination : "
                        + reservation.getDestinationStation()
        );
    }

    private void cancelReservation() {

        String pnr =
                txtPNR.getText().trim();

        if (pnr.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Enter PNR Number"
            );

            return;
        }

        int choice =
                JOptionPane.showConfirmDialog(
                        this,
                        "Are You Sure?",
                        "Confirm Cancellation",
                        JOptionPane.YES_NO_OPTION
                );

        if (choice ==
                JOptionPane.YES_OPTION) {

            boolean deleted =
                    service.cancelReservation(
                            pnr
                    );

            if (deleted) {

                JOptionPane.showMessageDialog(
                        this,
                        "Reservation Cancelled"
                );

                txtDetails.setText("");
                txtPNR.setText("");

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Cancellation Failed"
                );
            }
        }
    }
}