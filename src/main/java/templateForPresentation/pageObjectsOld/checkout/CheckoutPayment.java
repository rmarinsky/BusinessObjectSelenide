package templateForPresentation.pageObjectsOld.checkout;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPayment {

    private Integer paymentServiceId;

    public CheckoutPayment(Integer paymentServiceId) {
        this.paymentServiceId = paymentServiceId;
    }

    public void selectPaymentServiceById(){
        $(by("data-sm-target*",""+paymentServiceId)).click();
    }

    public void submitDeliveryChoose(){
        $(by("data-action-click*","OnPaymentServiceSelected")).click();
    }

}
