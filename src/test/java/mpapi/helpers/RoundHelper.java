package mpapi.helpers;

public class RoundHelper {
    public static double roundToTwoDigitsAfterPoint(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
    public static double roundToFourDigitsAfterPoint(double number) {
        return Math.round(number * 10000.0) / 10000.0;
    }

    public static String roundToTwoDigitsAfterPoint(String number) {
        return String.valueOf(Math.round(Double.parseDouble(number) * 100.0) / 100.0);
    }

    public static String addZeroWhenSingleZeroAfterPoint(String number) {
        if (number.split("\\.").length > 1 && number.split("\\.")[1].length()==1) {
            return number + "0";
        }
        return number;
    }
}
