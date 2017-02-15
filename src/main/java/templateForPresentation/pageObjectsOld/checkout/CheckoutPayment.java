package templateForPresentation.pageObjectsOld.checkout;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPayment {

    public CheckoutPayment selectPaymentServiceById(Integer paymentServiceId){
        $(by("data-sm-target*",""+paymentServiceId)).click();
        return this;
    }

    public void submitDeliveryChoose(){
        $(by("data-action-click*","OnPaymentServiceSelected")).click();
    }

}
