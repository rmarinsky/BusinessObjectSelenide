package templateForPresentation.pageObjectsOld;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class LoginPopup {

    //qazx, 1111
    public LoginPopup fillLoginForm(String loginValue, String pasw){
        $(by("name*","username")).setValue(loginValue);
        $(by("name*","password")).setValue(pasw);
        return this;
    }

    public void submitForm(){
        $("[type='submit']").click();
    }

}
