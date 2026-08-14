import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        DatabaseManager.createTables();

        SwingUtilities.invokeLater(() -> {

            new LoginFrame()
                    .setVisible(true);
        });
    }
}