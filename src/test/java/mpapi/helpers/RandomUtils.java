package mpapi.helpers;

import java.security.SecureRandom;
import java.util.ArrayList;

import static mpapi.helpers.RoundHelper.roundToTwoDigitsAfterPoint;

public class RandomUtils {

    public static int createRandomNumber(int downLimitValue, int upLimitValue) {
        SecureRandom random = new SecureRandom();
        return random.nextInt(upLimitValue - downLimitValue) + downLimitValue;
    }

    public static double createRandomDoubleNumber(int rangeMin, int rangeMax) {
        SecureRandom random = new SecureRandom();
        return roundToTwoDigitsAfterPoint(rangeMin + (rangeMax - rangeMin) * random.nextDouble());
    }


    public static String createRandomTCNo() {
        ArrayList<Integer> array = new ArrayList<>();
        SecureRandom randomGenerator = new SecureRandom();

        array.add(1 + randomGenerator.nextInt(9));

        for (int i = 1; i < 9; i++) {
            array.add(randomGenerator.nextInt(10));
        }

        int t1 = 0;
        for (int i = 0; i < 9; i += 2) {
            t1 += array.get(i);
        }

        int t2 = 0;
        for (int i = 1; i < 8; i += 2) {
            t2 += array.get(i);
        }

        int x = (t1 * 7 - t2) % 10;

        array.add(x);

        x = 0;
        for (int i = 0; i < 10; i++) {
            x += array.get(i);
        }

        x = x % 10;
        array.add(x);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            sb.append(array.get(i));
        }

        return sb.toString();
    }

}
