package templateForPresentation.componentObjectsNew.checkout;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.by;

public class PaymentService {

    public PaymentService selectPaymentServiceById(Integer paymentServiceId){
        Selenide.$(by("data-sm-target*", String.valueOf(paymentServiceId))).click();
        return this;
    }

    public void submitDeliveryChoose(){
        Selenide.$(by("data-action-click*","OnPaymentServiceSelected")).click();
    }

}
