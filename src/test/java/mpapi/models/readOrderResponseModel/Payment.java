package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment {
    private String paymentType;
    private boolean payWithThreeDSecure;
    private boolean savedCard;
    private String maskedCardNumber;
    private long paymentGatewayId;
    private String methodName;
    private String binCode;
    private String provision;
    private Object wallet;

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public boolean isPayWithThreeDSecure() {
        return payWithThreeDSecure;
    }

    public void setPayWithThreeDSecure(boolean payWithThreeDSecure) {
        this.payWithThreeDSecure = payWithThreeDSecure;
    }

    public boolean isSavedCard() {
        return savedCard;
    }

    public void setSavedCard(boolean savedCard) {
        this.savedCard = savedCard;
    }

    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    public long getPaymentGatewayId() {
        return paymentGatewayId;
    }

    public void setPaymentGatewayId(long paymentGatewayId) {
        this.paymentGatewayId = paymentGatewayId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        this.binCode = binCode;
    }

    public String getProvision() {
        return provision;
    }

    public void setProvision(String provision) {
        this.provision = provision;
    }

    public Object getWallet() {
        return wallet;
    }

    public void setWallet(Object wallet) {
        this.wallet = wallet;
    }
}
