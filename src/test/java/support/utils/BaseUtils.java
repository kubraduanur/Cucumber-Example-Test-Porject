package support.utils;


import mpapi.models.orderSummary.OrderSummary;

import java.util.List;

import static com.trendyol.mpapi.finance.matcher.CancelledMatcher.isTrueSettlementCanceled;
import static mpapi.helpers.RandomUtils.createRandomNumber;
import static org.hamcrest.MatcherAssert.assertThat;

public class BaseUtils {

    private static int getRandomSeller() {
        List<Integer> sellerIdList = List.of(208,664929,664931,665001,665002,665004,665567,665935,666098,666099,666100,666101,666174,666254,666255,666258,666336,667499,667648,667649,667650,667651);
        return sellerIdList.get(createRandomNumber(0, sellerIdList.size()));
    }

    public int createSellers(){
        int sellerId = getRandomSeller();
        return sellerId;
    }


}
