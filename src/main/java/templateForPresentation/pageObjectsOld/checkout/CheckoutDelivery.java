package templateForPresentation.pageObjectsOld.checkout;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.by;

public class CheckoutDelivery {

    private Integer deliveryServiceId;

    public CheckoutDelivery(Integer deliveryServiceId) {
        this.deliveryServiceId = deliveryServiceId;
    }

    public void selectDeliveryServiceById(){
        Selenide.$(by("data-sm-target*", String.valueOf(deliveryServiceId))).click();
    }

    public void submitDeliveryChoose(){
        Selenide.$(by("data-action-click*","OnDeliveryServiceSelected")).click();
    }

}
