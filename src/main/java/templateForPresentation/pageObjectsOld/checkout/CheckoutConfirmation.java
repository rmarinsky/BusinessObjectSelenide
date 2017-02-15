package templateForPresentation.pageObjectsOld.checkout;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutConfirmation {

    public void submitCheckout(){
        $(by("data-action-click*","OnConfirmOrder")).click();
    }

}
