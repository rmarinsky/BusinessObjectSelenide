package templateForPresentation.pageObjectsOld.checkout;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutDelivery {

    private Integer deliveryServiceId;

    public CheckoutDelivery(Integer deliveryServiceId) {
        this.deliveryServiceId = deliveryServiceId;
    }

    public void selectDeliveryServiceById(){
        $(by("data-sm-target*",""+deliveryServiceId)).click();
    }

    public void submitDeliveryChoose(){
        $(by("data-action-click*","OnDeliveryServiceSelected")).click();
    }

}
