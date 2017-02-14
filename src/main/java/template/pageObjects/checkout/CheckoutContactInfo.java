package template.pageObjects.checkout;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutContactInfo {

    public CheckoutContactInfo openCheckout(){
        Selenide.open("/checkout");
        return this;
    }

    public CheckoutContactInfo fillFirstName (String firstName){
        $(by("name*","firstName")).setValue(firstName);
        return this;
    }

    public CheckoutContactInfo fillLastName (String lastName){
        $(by("name*","lastName")).setValue(lastName);
        return this;
    }

    public CheckoutContactInfo fillEmail (String email){
        $(by("name*","email")).setValue(email);
        return this;
    }

    public CheckoutContactInfo fillPhoneNumber (String phoneNumber){
        $(".styled-phone-edit > input").setValue(phoneNumber);
        return this;
    }

    public CheckoutContactInfo selectCountry(String country){
        $("#country_id_chosen").click();
        $("#country_id_chosen input").sendKeys(country, Keys.ENTER);
        return this;
    }

    public CheckoutContactInfo fillCity (String city){
        $("#city").setValue(city);
        return this;
    }

    public CheckoutContactInfo fillAddress (String address){
        $(by("name","address[address]")).setValue(address);
        return this;
    }

    public void submitContactInfo(){
        $(by("data-action-click*","Address")).click();
    }

}
