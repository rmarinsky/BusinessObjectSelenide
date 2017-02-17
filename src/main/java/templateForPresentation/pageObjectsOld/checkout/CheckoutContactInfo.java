package templateForPresentation.pageObjectsOld.checkout;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.by;

public class CheckoutContactInfo {

    public void openCheckout(){
        Selenide.open("/checkout");
    }

    public void fillFirstName (String firstName){
        Selenide.$(by("name*","firstName")).setValue(firstName);
    }

    public void fillLastName (String lastName){
        Selenide.$(by("name*","lastName")).setValue(lastName);
    }

    public void fillEmail (String email){
        Selenide.$(by("name*","email")).setValue(email);
    }

    public void fillPhoneNumber (String phoneNumber){
        Selenide.$(".styled-phone-edit > input").setValue(phoneNumber);
    }

    public void selectCountry(String country){
        Selenide.$("#country_id_chosen").click();
        Selenide.$("#country_id_chosen input").sendKeys(country, Keys.ENTER);
    }

    public void  fillCity (String city){
        Selenide.$("#city").setValue(city);
    }

    public void fillAddress (String address){
        Selenide.$(by("name","address[address]")).setValue(address);
    }

    public void submitContactInfo(){
        Selenide.$(by("data-action-click*","Address")).click();
    }

}
