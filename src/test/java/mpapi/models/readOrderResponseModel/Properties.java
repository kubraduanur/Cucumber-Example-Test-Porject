package mpapi.models.readOrderResponseModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
    private Object IS_FREE_FROM_FEE;

    public Object getIS_FREE_FROM_FEE() {
        return IS_FREE_FROM_FEE;
    }

    public void setIS_FREE_FROM_FEE(Object IS_FREE_FROM_FEE) {
        this.IS_FREE_FROM_FEE = IS_FREE_FROM_FEE;
    }
}
