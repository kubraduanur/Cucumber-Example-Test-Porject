package mpapi.models.orderCreateRequestModel;

public class Payment {
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

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getUsedBankName() {
        return usedBankName;
    }

    public void setUsedBankName(String usedBankName) {
        this.usedBankName = usedBankName;
    }

    public long getSavedCardId() {
        return savedCardId;
    }

    public void setSavedCardId(long savedCardId) {
        this.savedCardId = savedCardId;
    }

    public String getCardTypeLogoUrl() {
        return cardTypeLogoUrl;
    }

    public void setCardTypeLogoUrl(String cardTypeLogoUrl) {
        this.cardTypeLogoUrl = cardTypeLogoUrl;
    }

    public long getPaymentGatewayId() {
        return paymentGatewayId;
    }

    public void setPaymentGatewayId(long paymentGatewayId) {
        this.paymentGatewayId = paymentGatewayId;
    }

    public String getProvision() {
        return provision;
    }

    public void setProvision(String provision) {
        this.provision = provision;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public boolean isSavedCard() {
        return savedCard;
    }

    public void setSavedCard(boolean savedCard) {
        this.savedCard = savedCard;
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        this.binCode = binCode;
    }

    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    public boolean isPayWithThreeDSecure() {
        return payWithThreeDSecure;
    }

    public void setPayWithThreeDSecure(boolean payWithThreeDSecure) {
        this.payWithThreeDSecure = payWithThreeDSecure;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
