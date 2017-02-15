package templateForPresentation.pageObjectsOld;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPopup {

    public void fillFirstNameField(String firstName){
        $(by("name*","firstName")).setValue(firstName);
    }

    public void fillLoginField(String login){
        $(by("name*","username")).setValue(login);
    }

    public void fillEmailField(String email){
        $(by("name*","email")).setValue(email);
    }

    public void selectCountry(String country){
        $("#country_id_chosen").click();
        $("#country_id_chosen input").sendKeys(country, Keys.ENTER);
    }

    public void submitRegisterForm(){
        $("[type='submit']").click();
    }

}
