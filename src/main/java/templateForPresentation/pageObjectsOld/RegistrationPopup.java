package templateForPresentation.pageObjectsOld;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPopup {

    public void fillFirstNameField(String firstName){
        Selenide.$(by("name*","firstName")).setValue(firstName);
    }

    public void fillLoginField(String login){
        Selenide.$(by("name*","username")).setValue(login);
    }

    public void fillEmailField(String email){
        Selenide.$(by("name*","email")).setValue(email);
    }

    public void selectCountry(String country){
        Selenide.$("#country_id_chosen").click();
        Selenide.$("#country_id_chosen input").sendKeys(country, Keys.ENTER);
    }

    public void submitRegisterForm(){
        Selenide.$("[type='submit']").click();
    }

}
