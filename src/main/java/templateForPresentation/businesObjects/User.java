package templateForPresentation.businesObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class User {

    public final By loginField = by("name*", "username"),
            paswField = by("name*", "password"),
            firstNameField = by("name*", "firstName"),
            lastNameField = by("name*", "lastName"),
            emailField = by("name*", "email"),
            cityField = byCssSelector("input#city"),
            middleNameField = by("name*", "middleName"),
            countryCustom = byCssSelector("#country_id_chosen"),
            regionCustom = byCssSelector("#state_id_chosen"),
            cityCustom = byCssSelector("#city_id_chosen"),
            addressField = by("name*", "[address]"), //because of element have name = "address[address]"
            phoneCodeCustom = byCssSelector("a.styled-phone-dropdown-button"),
            phoneNumberCutom = byCssSelector(".styled-phone-edit > input");

    public User fillLogin(String loginValue){
        $(loginField).sendKeys(loginValue);
        return this;
    }

    public User fillPasw (String passwordValue){
        $(paswField).sendKeys(passwordValue);
        return this;
    }

    public User fillFirstName (String firstNameValue){
        $(firstNameField).setValue(firstNameValue);
        return this;
    }

    public User fillLastName (String lastNameValue){
        $(lastNameField).setValue(lastNameValue);
        return this;
    }

    public User fillMiddleName (String middleNameValue){
        $(middleNameField).setValue(middleNameValue);
        return this;
    }

    public User fillEmail (String emailValue){
        $(emailField).setValue(emailValue);
        return this;
    }

    public User fillCity (String cityValue){
        $(cityField).setValue(cityValue);
        return this;
    }

    public User selectCountry(String countryValue){
        return this.chooseCustom(countryCustom, countryValue);
    }

    public User selectRegion(String regionValue){
        return this.chooseCustom(regionCustom, regionValue);
    }

    public User selectCity(String cityValue){
        return this.chooseCustom(cityCustom, cityValue);
    }

    private User chooseCustom(final By customElement, final String value){
        $(customElement).shouldBe(Condition.visible).click();
        $(customElement).$("input").sendKeys(value + Keys.ENTER);
        return this;
    }

    public User fillAddress(String addressValue){
        $(addressField).setValue(addressValue);
        return this;
    }

    public User fillPhoneByCountry(final String country, final String phone){
        $(this.phoneCodeCustom).click();
        $(String.format("b[data-hint='%s']", country)).scrollTo().click();
        $(this.phoneNumberCutom).setValue(phone);
        return this;
    }


}
