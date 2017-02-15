package templateForPresentation.pageObjectsOld.checkout;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutContactInfo {

    public void openCheckout(){
        Selenide.open("/checkout");
    }

    public void fillFirstName (String firstName){
        $(by("name*","firstName")).setValue(firstName);
    }

    public void fillLastName (String lastName){
        $(by("name*","lastName")).setValue(lastName);
    }

    public void fillEmail (String email){
        $(by("name*","email")).setValue(email);
    }

    public void fillPhoneNumber (String phoneNumber){
        $(".styled-phone-edit > input").setValue(phoneNumber);
    }

    public void selectCountry(String country){
        $("#country_id_chosen").click();
        $("#country_id_chosen input").sendKeys(country, Keys.ENTER);
    }

    public void  fillCity (String city){
        $("#city").setValue(city);
    }

    public void fillAddress (String address){
        $(by("name","address[address]")).setValue(address);
    }

    public void submitContactInfo(){
        $(by("data-action-click*","Address")).click();
    }

}
