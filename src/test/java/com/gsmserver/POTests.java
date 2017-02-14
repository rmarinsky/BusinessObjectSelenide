package com.gsmserver;

import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import template.pageObjects.*;
import template.pageObjects.checkout.CheckoutConfirmation;
import template.pageObjects.checkout.CheckoutContactInfo;
import template.pageObjects.checkout.CheckoutDelivery;
import template.pageObjects.checkout.CheckoutPayment;

public class POTests extends BaseTest{

    private String testValue = "testValue";
    private Integer testProductId = 7462;

    @Test
    public void makeOrderTest(){
        new ProductPage().open(testProductId)
                .clickAddToCart(testProductId);
        new CheckoutContactInfo().openCheckout().fillFirstName(testValue).fillLastName(testValue).
                fillEmail(testValue+"@test.com").
                fillPhoneNumber("112223333").
                selectCountry("Sweden").fillCity(testValue).
                fillAddress(testValue).submitContactInfo();

        new CheckoutDelivery().selectDeliveryServiceById(2045558838).submitDeliveryChoose();

        new CheckoutPayment().selectPaymentServiceById(2032449552).submitDeliveryChoose();

        new CheckoutConfirmation().submitCheckout();
    }

    @Test
    public void registerNewAccountTest(){
        new HomePage().open().clickLoginLink();
        new RegistrationPopup().clickOnTabRegistration().
                fillFirstNameField(testValue).
                fillLoginField(testValue+ RandomUtils.nextInt(0, 500)).
                fillEmailField(testValue+ RandomUtils.nextInt(0, 500) + "@gmail.com").
                selectCountry("Sweden").
                submitRegisterForm();
    }

    @Test
    public void addToWishListProductTest(){
        new HomePage().open().searchFor(""+testProductId);
        new ProductList().clickToWishListProduct(testProductId);
        new LoginPopup().fillLoginForm("qazx","1111").submitForm();
        new WishListPage().isLoaded().wishListShouldHaveProduct(testProductId);
    }

}
