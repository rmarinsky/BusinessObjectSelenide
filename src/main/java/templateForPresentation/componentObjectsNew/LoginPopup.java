package templateForPresentation.componentObjectsNew;

import com.codeborne.selenide.Selenide;
import templateForPresentation.businesObjects.User;

import static com.codeborne.selenide.Selectors.by;

public class LoginPopup {

    private User user;

    public LoginPopup(){
        this.user = new User();
    }

    public LoginPopup openLoginPopup(){
        Selenide.$(".login").click();
        return this;
    }

    public LoginPopup openRegistrationTab(){
        Selenide.$(by("href*","signup")).click();
        return new LoginPopup();
    }

    public LoginPopup loginUser(String loginValue, String paswValue){
        this.user.fillLogin(loginValue);
        this.user.fillPasw(paswValue);
        Selenide.$("[type='submit']").click();
        return this;
    }

}
