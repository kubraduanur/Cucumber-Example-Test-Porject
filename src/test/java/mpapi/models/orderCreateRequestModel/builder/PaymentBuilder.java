package mpapi.models.orderCreateRequestModel.builder;

import mpapi.models.orderCreateRequestModel.Payment;
import mpapi.models.orderCreateRequestModel.Wallet;

public final class PaymentBuilder {
    private long paymentGatewayId;
    private String provision;
    private String methodName;
    private String paymentType;
    private boolean savedCard;
    private String binCode;
    private String maskedCardNumber;
    private boolean payWithThreeDSecure;
    private Wallet wallet;
    private String creditCardType;
    private String usedBankName;
    private long savedCardId;
    private String cardTypeLogoUrl;

    private PaymentBuilder() {
    }

    public static PaymentBuilder aPayment() {
        return new PaymentBuilder();
    }

    public PaymentBuilder paymentGatewayId(long paymentGatewayId) {
        this.paymentGatewayId = paymentGatewayId;
        return this;
    }

    public PaymentBuilder provision(String provision) {
        this.provision = provision;
        return this;
    }

    public PaymentBuilder methodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    public PaymentBuilder paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public PaymentBuilder savedCard(boolean savedCard) {
        this.savedCard = savedCard;
        return this;
    }

    public PaymentBuilder binCode(String binCode) {
        this.binCode = binCode;
        return this;
    }

    public PaymentBuilder maskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
        return this;
    }

    public PaymentBuilder payWithThreeDSecure(boolean payWithThreeDSecure) {
        this.payWithThreeDSecure = payWithThreeDSecure;
        return this;
    }

    public PaymentBuilder wallet(Wallet wallet) {
        this.wallet = wallet;
        return this;
    }

    public PaymentBuilder creditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
        return this;
    }

    public PaymentBuilder usedBankName(String usedBankName) {
        this.usedBankName = usedBankName;
        return this;
    }

    public PaymentBuilder savedCardId(long savedCardId) {
        this.savedCardId = savedCardId;
        return this;
    }

    public PaymentBuilder cardTypeLogoUrl(String cardTypeLogoUrl) {
        this.cardTypeLogoUrl = cardTypeLogoUrl;
        return this;
    }

    public Payment build() {
        Payment payment = new Payment();
        payment.setPaymentGatewayId(paymentGatewayId);
        payment.setProvision(provision);
        payment.setMethodName(methodName);
        payment.setPaymentType(paymentType);
        payment.setSavedCard(savedCard);
        payment.setBinCode(binCode);
        payment.setMaskedCardNumber(maskedCardNumber);
        payment.setPayWithThreeDSecure(payWithThreeDSecure);
        payment.setWallet(wallet);
        payment.setCreditCardType(creditCardType);
        payment.setUsedBankName(usedBankName);
        payment.setSavedCardId(savedCardId);
        payment.setCardTypeLogoUrl(cardTypeLogoUrl);
        return payment;
    }
}
