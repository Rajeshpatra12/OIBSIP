import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        ATM atm = new ATM(bank);

        System.out.println(
                "===== ATM SYSTEM =====");

        if (atm.login(sc)) {

            atm.start(sc);

        } else {

            System.out.println(
                    "\nAccess Denied!");
            System.out.println(
                    "Too Many Failed Attempts.");
        }

        sc.close();
    }
}