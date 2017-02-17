package templateForPresentation.componentObjectsNew.checkout;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.by;

public class CheckoutConfirmation {

    public void submitCheckout(){
        Selenide.$(by("data-action-click*","OnConfirmOrder")).click();
    }

}
