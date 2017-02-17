package templateForPresentation.pageObjectsOld;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.by;

public class LoginPopup {

    public RegistrationPopup clickOnTabRegistration(){
        Selenide.$(by("href*","signup")).click();
        return new RegistrationPopup();
    }

    //qazx, 1111
    public void fillLoginField(String loginValue){
        Selenide.$(by("name*","username")).setValue(loginValue);
    }

    public void fillPaswField(String pasw){
        Selenide.$(by("name*","password")).setValue(pasw);
    }

    public void submitForm(){
        Selenide.$("[type='submit']").click();
    }

}
