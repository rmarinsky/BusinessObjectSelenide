package templateForPresentation.pageObjectsNew;

import templateForPresentation.businesObjects.User;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPopup {

    private User user;

    RegistrationPopup(){
        this.user = new User();
    }

    public void registerNewUser(String firstNameValue, String loginValue, String emailValue, String country){
        user.fillFirstName(firstNameValue).
                fillLogin(loginValue).
                fillEmail(emailValue).
                selectCountry(country);
        $("[type='submit']").click();
    }

}
