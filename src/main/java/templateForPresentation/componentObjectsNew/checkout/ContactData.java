package templateForPresentation.componentObjectsNew.checkout;

import com.codeborne.selenide.Selenide;
import templateForPresentation.businesObjects.User;

import static com.codeborne.selenide.Selectors.by;

public class ContactData {

    private User user;

    public ContactData(){
        this.user= new User();
    }

    public ContactData openCheckout(){
        Selenide.open("/checkout");
        return this;
    }

    public ContactData fillContactData(String country, String city, String firstName, String lastName, String email, String address){
        user.selectCountry(country).
                fillFirstName(firstName).
                fillLastName(lastName).
                fillEmail(email).
                fillPhoneByCountry(country,"112223333").
                fillCity(city).
                fillAddress(address);
        return this;
    }

    public void submitContactInfo(){
        Selenide.$(by("data-action-click*","Address")).click();
    }

}
