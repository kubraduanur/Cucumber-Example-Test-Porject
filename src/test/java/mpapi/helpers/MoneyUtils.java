package mpapi.helpers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import static java.lang.Double.parseDouble;
import static java.lang.Math.abs;
import static java.lang.Math.floor;
import static org.apache.commons.math3.util.Precision.EPSILON;
import static org.apache.commons.math3.util.Precision.round;

public final class MoneyUtils {

    private MoneyUtils() {
    }

    public static double formatDoubleForTwoDigit(double price) {
        return Double.parseDouble(formatDoubleForTwoDigitCampaignProductPrice(price));
    }

    public static String formatDoubleForTwoDigitCampaignProductPrice(double price) {
        return new DecimalFormat("#0.00").format(price);
    }


}
