package templateForPresentation.businesObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class User {

    public final By FIELD_LOGIN = by("name*", "username"),
            FIELD_PASSWORD = by("name*", "password"),
            FIELD_FIRST_NAME = by("name*", "firstName"),
            FIELD_LAST_NAME = by("name*", "lastName"),
            FIELD_EMAIL = by("name*", "email"),
            FIELD_CITY = byCssSelector("input#city"),
            FIELD_MIDDLE_NAME = by("name*", "middleName"),
            CUSTOM_COUNTRY = byCssSelector("#country_id_chosen"),
            CUSTOM_REGION = byCssSelector("#state_id_chosen"),
            CUSTOM_CITY = byCssSelector("#city_id_chosen"),
            FIELD_ADDRESS = by("name*", "[address]"), //because of element have name = "address[address]"
            CUSTOM_PHONE_CODES = byCssSelector("a.styled-phone-dropdown-button"),
            FIELD_PHONE_NUMBER = byCssSelector(".styled-phone-edit > input");

    public User fillLogin(String loginValue){
        $(FIELD_LOGIN).sendKeys(loginValue);
        return this;
    }

    public User fillPasw (String passwordValue){
        $(FIELD_PASSWORD).sendKeys(passwordValue);
        return this;
    }

    public User fillFirstName (String firstNameValue){
        $(FIELD_FIRST_NAME).setValue(firstNameValue);
        return this;
    }

    public User fillLastName (String lastNameValue){
        $(FIELD_LAST_NAME).setValue(lastNameValue);
        return this;
    }

    public User fillMiddleName (String middleNameValue){
        $(FIELD_MIDDLE_NAME).setValue(middleNameValue);
        return this;
    }

    public User fillEmail (String emailValue){
        $(FIELD_EMAIL).setValue(emailValue);
        return this;
    }

    public User fillCity (String cityValue){
        $(FIELD_CITY).setValue(cityValue);
        return this;
    }

    public User selectCountry(String countryValue){
        return this.chooseCustom(CUSTOM_COUNTRY, countryValue);
    }

    public User selectRegion(String regionValue){
        return this.chooseCustom(CUSTOM_REGION, regionValue);
    }

    public User selectCity(String cityValue){
        return this.chooseCustom(CUSTOM_CITY, cityValue);
    }

    private User chooseCustom(final By customElement, final String value){
        $(customElement).shouldBe(Condition.visible).click();
        $(customElement + " input").sendKeys(value + Keys.ENTER);
        return this;
    }

    public User fillAddress(String addressValue){
        $(FIELD_ADDRESS).setValue(addressValue);
        return this;
    }

    public User fillPhoneByCountry(final String country, final String phone){
        $(this.CUSTOM_PHONE_CODES).click();
        $(String.format("b[data-hint='%s']", country)).scrollTo().click();
        $(this.FIELD_PHONE_NUMBER).setValue(phone);
        return this;
    }


}
