package templateForPresentation.componentObjectsNew.checkout;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.by;

public class DeliveryService {

    public DeliveryService selectDeliveryServiceById(Integer deliveryServiceId){
        Selenide.$(by("data-sm-target*", String.valueOf(deliveryServiceId))).click();
        return this;
    }

    public void submitDeliveryChoose(){
        Selenide.$(by("data-action-click*","OnDeliveryServiceSelected")).click();
    }

}
