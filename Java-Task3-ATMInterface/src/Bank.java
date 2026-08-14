import java.util.HashMap;

public class Bank {

    private HashMap<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();

        accounts.put("user1",
                new Account("user1", "1234", 10000));

        accounts.put("user2",
                new Account("user2", "5678", 5000));

        accounts.put("user3",
                new Account("user3", "9999", 8000));
    }

    public Account getAccount(String userId) {
        return accounts.get(userId);
    }

    public boolean transfer(Account sender,
                            String receiverId,
                            double amount) {

        Account receiver = accounts.get(receiverId);

        if (receiver == null) {
            return false;
        }

        if (sender.withdraw(amount)) {
            receiver.deposit(amount);
            return true;
        }

        return false;
    }
}