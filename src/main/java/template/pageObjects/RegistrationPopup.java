package template.pageObjects;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPopup {

    public RegistrationPopup clickOnTabRegistration(){
        $(by("href*","signup")).click();
        return this;
    }

    public RegistrationPopup fillFirstNameField(String firstName){
        $(by("name*","firstName")).setValue(firstName);
        return this;
    }

    public RegistrationPopup fillLoginField(String login){
        $(by("name*","username")).setValue(login);
        return this;
    }

    public RegistrationPopup fillEmailField(String email){
        $(by("name*","email")).setValue(email);
        return this;
    }

    public RegistrationPopup selectCountry(String country){
        $("#country_id_chosen").click();
        $("#country_id_chosen input").sendKeys(country, Keys.ENTER);
        return this;
    }

    public void submitRegisterForm(){
        $("[type='submit']").click();
    }

}
