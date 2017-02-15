package templateForPresentation.pageObjectsOld;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class LoginPopup {

    public RegistrationPopup clickOnTabRegistration(){
        $(by("href*","signup")).click();
        return new RegistrationPopup();
    }

    //qazx, 1111
    public void fillLoginField(String loginValue){
        $(by("name*","username")).setValue(loginValue);
    }

    public void fillPaswField(String pasw){
        $(by("name*","password")).setValue(pasw);
    }

    public void submitForm(){
        $("[type='submit']").click();
    }

}
