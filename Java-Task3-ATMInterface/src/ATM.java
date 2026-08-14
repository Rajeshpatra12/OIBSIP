import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    private Bank bank;
    private Account currentUser;
    private ArrayList<Transaction> history;

    public ATM(Bank bank) {
        this.bank = bank;
        history = new ArrayList<>();
    }

    public boolean login(Scanner sc) {

        int attempts = 0;

        while (attempts < 3) {

            System.out.print("Enter User ID: ");
            String userId = sc.nextLine();

            System.out.print("Enter PIN: ");
            String pin = sc.nextLine();

            Account account = bank.getAccount(userId);

            if (account != null &&
                    account.getPin().equals(pin)) {

                currentUser = account;
                System.out.println("\nLogin Successful!\n");
                return true;
            }

            attempts++;
            System.out.println("Invalid Credentials!");
            System.out.println("Attempts Left: "
                    + (3 - attempts));
        }

        return false;
    }

    public void start(Scanner sc) {

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    showHistory();
                    break;

                case 2:
                    withdraw(sc);
                    break;

                case 3:
                    deposit(sc);
                    break;

                case 4:
                    transfer(sc);
                    break;

                case 5:
                    System.out.println(
                            "\nThank you for using ATM!");
                    break;

                default:
                    System.out.println(
                            "Invalid Choice!");
            }

        } while (choice != 5);
    }

    private void showHistory() {

        if (history.isEmpty()) {
            System.out.println(
                    "\nNo Transactions Found.");
            return;
        }

        System.out.println(
                "\n===== TRANSACTION HISTORY =====");

        for (Transaction t : history) {
            System.out.println(t);
        }
    }

    private void withdraw(Scanner sc) {

        System.out.print(
                "Enter Amount to Withdraw: ₹");

        double amount = sc.nextDouble();

        if (currentUser.withdraw(amount)) {

            history.add(new Transaction(
                    "WITHDRAW",
                    amount,
                    "Cash Withdrawal"));

            System.out.println(
                    "Withdrawal Successful!");

            System.out.println(
                    "Remaining Balance: ₹"
                            + currentUser.getBalance());

        } else {

            System.out.println(
                    "Insufficient Funds!");
        }
    }

    private void deposit(Scanner sc) {

        System.out.print(
                "Enter Amount to Deposit: ₹");

        double amount = sc.nextDouble();

        currentUser.deposit(amount);

        history.add(new Transaction(
                "DEPOSIT",
                amount,
                "Cash Deposit"));

        System.out.println(
                "Deposit Successful!");

        System.out.println(
                "Updated Balance: ₹"
                        + currentUser.getBalance());
    }

    private void transfer(Scanner sc) {

        System.out.print(
                "Enter Receiver Account ID: ");

        String receiverId = sc.next();

        System.out.print(
                "Enter Amount: ₹");

        double amount = sc.nextDouble();

        boolean success =
                bank.transfer(
                        currentUser,
                        receiverId,
                        amount);

        if (success) {

            history.add(new Transaction(
                    "TRANSFER",
                    amount,
                    "Transferred to "
                            + receiverId));

            System.out.println(
                    "Transfer Successful!");

            System.out.println(
                    "Remaining Balance: ₹"
                            + currentUser.getBalance());

        } else {

            System.out.println(
                    "Transfer Failed!");
        }
    }
}