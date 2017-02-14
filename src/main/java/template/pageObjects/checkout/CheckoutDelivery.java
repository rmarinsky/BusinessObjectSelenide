package template.pageObjects.checkout;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutDelivery {

    public CheckoutDelivery selectDeliveryServiceById(Integer deliveryServiceId){
        $(by("data-sm-target*",""+deliveryServiceId)).click();
        return this;
    }

    public void submitDeliveryChoose(){
        $(by("data-action-click*","OnDeliveryServiceSelected")).click();
    }

}
