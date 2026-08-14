import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private String details;
    private LocalDateTime timestamp;

    public Transaction(String type, double amount, String details) {
        this.type = type;
        this.amount = amount;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return timestamp + " | " + type +
                " | Amount: ₹" + amount +
                " | " + details;
    }
}