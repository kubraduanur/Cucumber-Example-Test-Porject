package mpapi.models.orderCreateRequestModel.factory;


import mpapi.models.orderCreateRequestModel.*;
import mpapi.models.orderCreateRequestModel.builder.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static mpapi.helpers.MoneyUtils.formatDoubleForTwoDigit;
import static mpapi.helpers.RandomUtils.*;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class OrderCreateFactory {
    public static OrderCreateRequestModel createOrderWithoutDiscountRequestModel(int lineQuantity,boolean isGoDelivery) {
        OrderCreateRequestModel orderCreateRequestModel = createBaseOrderCreateRequestModel(isGoDelivery);
        List<Line> lineProducts = new ArrayList<>();
        for (int i = 0; i < lineQuantity; i++) {
            lineProducts.add(createLineWithoutDiscount());
        }
        orderCreateRequestModel.setLines(lineProducts);
        orderCreateRequestModel.getPrice().setTotalCargo(10);
        return orderCreateRequestModel;
    }
    private static OrderCreateRequestModel createBaseOrderCreateRequestModel(boolean isGoDelivery) {
        String orderNumber = "3" + randomNumeric(8);
        return OrderCreateRequestModelBuilder.
                anOrderCreateRequestModel()
                .orderParentNumber(orderNumber)
                .paymentStatus("Created")
                .storefrontId(1)
                .isTestOrder(false)
                .currency("TRY")
                .customer(createCustomer())
                .delivery(createDelivery(isGoDelivery))
                .invoiceAddress(createAddress())
                .shipmentAddress(createAddress())
                .payment(createPayment())
                .price(createPrice(500))
                .userInformation(createUserInformation())
                .charges(List.of())
                .promotions(List.of())
                .coupons(List.of())
                .build();
    }
    private static Line createLineWithoutDiscount() {
        return LineBuilder
                .aLine()
                .chargeDistribution(createChargeDistribution())
                .discountDistribution(createDiscountDistributionWithoutDiscount())
                .price(createLinePrice())
                .product(createLineProduct())
                .quantity(1)
                .stock(createStock())
                .build();
    }


    private static Customer createCustomer() {
        return CustomerBuilder
                .aCustomer()
                .firstName("UatFirstName")
                .lastName("UatLastName")
                .note(randomAlphabetic(10))
                .guid(String.valueOf(createRandomNumber(10, 50)))
                .guest(false)
                .freeFromFraudControl(true)
                .id(createRandomNumber(1000, 200000))
                .staffUser(true)
                .tcIdentityNumber(createRandomTCNo())
                .build();
    }
    private static Delivery createDelivery(boolean isGoDelivery) {
        String deliveryType = isGoDelivery ?  "GO" : "STORE";
        return DeliveryBuilder
                .aDelivery()
                .model(deliveryType)
                .scheduleType("INSTANT")
                .timeSlotId("gnhsnwpyxgei")
                .build();
    }
    private static Address createAddress() {
        return AddressBuilder
                .anAddress()
                .lastName("UatLastName")
                .address2(randomAlphabetic(50))
                .city("İstanbul")
                .address1(randomAlphabetic(50))
                .cityCode(34)
                .latitude("39.898392")
                .postalCode("34000")
                .cityId(133)
                .firstName("UatFirstName")
                .neighborhoodId(24042)
                .districtId(93)
                .identityNumber("99999999999")
                .phone("5" + randomNumeric(9))
                .countryCode("TR")
                .district("OMS Mah")
                .company("TRENDYOL")
                .neighborhood("Maslak mh.")
                .email("uatbuyer10@mailinator.com")
                .longitude("32.793679")
                .build();
    }
    private static Payment createPayment() {
        return PaymentBuilder
                .aPayment()
                .payWithThreeDSecure(true)
                .wallet(createWallet())
                .binCode("557113")
                .methodName("AkbankSanalPos")
                .maskedCardNumber("557113******5575")
                .paymentType("payWithCard")
                .paymentGatewayId(9)
                .provision("Required")
                .savedCard(true)
                .savedCardId(1197161877)
                .usedBankName("Akbank")
                .paymentType("payWithCard")
                .cardTypeLogoUrl("https://cdn.dsmcdn.com/assets/BankLogos/bank-logo-new/bg-cc-mastercard.png")
                .build();
    }
    private static Wallet createWallet() {
        return WalletBuilder
                .aWallet()
                .rebateSpendAmount(0.0)
                .rebateGainAmount(0.0)
                .build();
    }
    private static Price createPrice(int price) {
        return PriceBuilder
                .aPrice()
                .total(price)
                .totalCargo(15)
                .totalPromotion(50)
                .totalCoupon(0.0)
                .build();
    }

    private static UserInformation createUserInformation() {
        return UserInformationBuilder
                .anUserInformation()
                .createdDate(1662721097)
                .userTypeStatus("MEMBER")
                .application(4)
                .visitorType("BUYER")
                .userIp("82.222.188.130")
                .pid(randomNumeric(8))
                .sid(randomNumeric(8))
                .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36" +
                        " (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36")
                .build();
    }
    private static ChargeDistribution createChargeDistribution() {
        return ChargeDistributionBuilder
                .aChargeDistribution()
                .cargo(createCargo())
                .installment(createCargo())
                .build();
    }
    private static Cargo createCargo() {
        return CargoBuilder
                .aCargo()
                .amount(0.0)
                .build();
    }
    private static DiscountDistribution createDiscountDistributionWithoutDiscount() {
        return DiscountDistributionBuilder
                .aDiscountDistribution()
                .coupons(List.of())
                .promotions(List.of())
                .build();
    }


    private static LinePrice createLinePrice() {
        return LinePriceBuilder
                .aLinePrice()
                .discountedPrice(50)
                .originalPrice(500)
                .price(500)
                .vatBaseAmount(500)
                .build();
    }
    private static LineProduct createLineProduct() {
        return LineProductBuilder
                .aLineProduct()
                .name("Koltuk Takımı")
                .productContentId(697847653)
                .sku("12345")
                .productCategory("İçecek")
                .productCategoryId(123)
                .categoryHierarchy(List.of("Gazlı İçecek"))
                .brandId(123)
                .instantDeci(3)
                .saleUnitValue(500)
                .productSaleName("Koltuk Takımı")
                .build();
    }
    private static Stock createStock() {
        return StockBuilder
                .aStock()
                .reservationId("reservation")
                .id("id")
                .build();
    }
    private static DiscountDistributionPromotion createDiscountDistributionPromotion(double sellingPrice, int index,
                                                                                     Map<String,Object> discountInfoForSellerType) {
        double discountRate = createRandomDoubleNumber(5, 15);
        double sellerCoverageRatio = (Double) discountInfoForSellerType.get("sellerCoverageRatio");
        boolean isSellerPaid = (Boolean) discountInfoForSellerType.get("isSellerPaid");
        double totalAmount = formatDoubleForTwoDigit((sellingPrice * discountRate) /100);
        double sellerAmount = formatDoubleForTwoDigit((totalAmount * sellerCoverageRatio) /100);
        double tyAmount = formatDoubleForTwoDigit(totalAmount -sellerAmount);
        return DiscountDistributionPromotionBuilder
                .aDiscountDistributionPromotion()
                .amount(createAmount(totalAmount, tyAmount, sellerAmount))
                .appliedQuantity(1)
                .discountType("INSTANT_DISCOUNT")
                .promotionId(1000 + index)
                .sellerCoverageRatio(sellerCoverageRatio)
                .sellerPaid(isSellerPaid)
                .legacyPromotionId(1000 + index)
                .build();
    }

    private static Amount createAmount(double totalAmount, double tyAmount, double sellerAmount) {
        return AmountBuilder
                .anAmount()
                .seller(sellerAmount)
                .ty(tyAmount)
                .total(totalAmount)
                .build();
    }

}
