package templateForPresentation.componentObjectsNew;

import templateForPresentation.businesObjects.User;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPopup {

    private User user;

    public RegistrationPopup(){
        this.user = new User();
    }

    public void registerNewUser(String firstNameValue, String loginValue, String emailValue, String country){
        this.user.fillFirstName(firstNameValue).
                fillLogin(loginValue).
                fillEmail(emailValue).
                selectCountry(country);
        $("[type='submit']").click();
    }

}
