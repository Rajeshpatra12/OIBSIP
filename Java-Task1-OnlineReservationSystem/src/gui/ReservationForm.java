package gui;

import model.Reservation;
import service.ReservationService;
import util.PNRGenerator;
import util.ValidationUtil;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class ReservationForm extends JPanel {

    private JTextField txtPassengerName;
    private JTextField txtTrainNumber;
    private JTextField txtTrainName;
    private JTextField txtDate;
    private JTextField txtSource;
    private JTextField txtDestination;

    private JComboBox<String> cmbClass;

    private JButton btnBook;

    private ReservationService service =
            new ReservationService();

    private HashMap<Integer, String> trains =
            new HashMap<>();

    public ReservationForm() {

        trains.put(101, "Rajdhani Express");
        trains.put(102, "Duronto Express");
        trains.put(103, "Shatabdi Express");
        trains.put(104, "Vande Bharat Express");

        setLayout(new GridLayout(8, 2, 10, 10));

        add(new JLabel("Passenger Name"));
        txtPassengerName = new JTextField();
        add(txtPassengerName);

        add(new JLabel("Train Number"));
        txtTrainNumber = new JTextField();
        add(txtTrainNumber);

        add(new JLabel("Train Name"));
        txtTrainName = new JTextField();
        txtTrainName.setEditable(false);
        add(txtTrainName);

        add(new JLabel("Class Type"));

        cmbClass = new JComboBox<>(
                new String[]{
                        "Sleeper",
                        "AC 3 Tier",
                        "AC 2 Tier",
                        "First Class"
                });

        add(cmbClass);

        add(new JLabel("Journey Date (dd-MM-yyyy)"));
        txtDate = new JTextField();
        add(txtDate);

        add(new JLabel("Source Station"));
        txtSource = new JTextField();
        add(txtSource);

        add(new JLabel("Destination Station"));
        txtDestination = new JTextField();
        add(txtDestination);

        btnBook = new JButton("Book Ticket");
        add(btnBook);

        txtTrainNumber.addKeyListener(
                new java.awt.event.KeyAdapter() {
                    @Override
                    public void keyReleased(
                            java.awt.event.KeyEvent e
                    ) {
                        loadTrainName();
                    }
                }
        );

        btnBook.addActionListener(
                e -> bookTicket()
        );
    }

    private void loadTrainName() {

        try {

            int trainNo =
                    Integer.parseInt(
                            txtTrainNumber.getText()
                    );

            txtTrainName.setText(
                    trains.getOrDefault(
                            trainNo,
                            "Unknown Train"
                    )
            );

        } catch (Exception ex) {

            txtTrainName.setText("");
        }
    }

    private void bookTicket() {

        String passenger =
                txtPassengerName.getText();

        String trainNoText =
                txtTrainNumber.getText();

        String trainName =
                txtTrainName.getText();

        String date =
                txtDate.getText();

        String source =
                txtSource.getText();

        String destination =
                txtDestination.getText();

        if (ValidationUtil.isEmpty(passenger)
                || ValidationUtil.isEmpty(trainNoText)
                || ValidationUtil.isEmpty(date)
                || ValidationUtil.isEmpty(source)
                || ValidationUtil.isEmpty(destination)) {

            JOptionPane.showMessageDialog(
                    this,
                    "All Fields Are Required"
            );

            return;
        }

        if (!ValidationUtil.isNumeric(trainNoText)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Train Number Must Be Numeric"
            );

            return;
        }

        if (!ValidationUtil.validDate(date)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Invalid Date Format"
            );

            return;
        }

        String pnr =
                PNRGenerator.generatePNR();

        Reservation reservation =
                new Reservation(
                        pnr,
                        passenger,
                        Integer.parseInt(trainNoText),
                        trainName,
                        cmbClass.getSelectedItem().toString(),
                        date,
                        source,
                        destination
                );

        boolean saved =
                service.saveReservation(
                        reservation
                );

        if (saved) {

            JOptionPane.showMessageDialog(
                    this,
                    "Reservation Successful\n\n" +
                            "PNR : " + pnr +
                            "\nPassenger : " + passenger +
                            "\nTrain : " + trainName
            );

            clearFields();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Booking Failed"
            );
        }
    }

    private void clearFields() {

        txtPassengerName.setText("");
        txtTrainNumber.setText("");
        txtTrainName.setText("");
        txtDate.setText("");
        txtSource.setText("");
        txtDestination.setText("");
    }
}