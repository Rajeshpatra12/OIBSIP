package util;

import java.text.SimpleDateFormat;

public class ValidationUtil {

    public static boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isNumeric(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validDate(String date) {

        try {
            SimpleDateFormat sdf =
                    new SimpleDateFormat("dd-MM-yyyy");

            sdf.setLenient(false);
            sdf.parse(date);

            return true;

        } catch (Exception e) {
            return false;
        }
    }
}