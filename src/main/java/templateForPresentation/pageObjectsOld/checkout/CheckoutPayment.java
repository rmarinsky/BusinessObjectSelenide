package templateForPresentation.pageObjectsOld.checkout;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.by;

public class CheckoutPayment {

    private Integer paymentServiceId;

    public CheckoutPayment(Integer paymentServiceId) {
        this.paymentServiceId = paymentServiceId;
    }

    public void selectPaymentServiceById(){
        Selenide.$(by("data-sm-target*", String.valueOf(paymentServiceId))).click();
    }

    public void submitDeliveryChoose(){
        Selenide.$(by("data-action-click*","OnPaymentServiceSelected")).click();
    }

}
