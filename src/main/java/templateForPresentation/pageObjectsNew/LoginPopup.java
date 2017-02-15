package templateForPresentation.pageObjectsNew;

import templateForPresentation.businesObject.User;

import static com.codeborne.selenide.Selenide.$;

public class LoginPopup {

    private User user;

    public LoginPopup(){
        this.user = new User();
    }

    public LoginPopup loginUser(String emailValue, String paswValue){
        this.user.fillEmail(emailValue);
        this.user.fillPasw(paswValue);
        $("[type='submit']").click();
        return this;
    }

}
