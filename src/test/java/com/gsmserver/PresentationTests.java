package com.gsmserver;

import com.codeborne.selenide.Condition;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import templateForPresentation.pageObjectsOld.*;
import templateForPresentation.pageObjectsOld.checkout.CheckoutConfirmation;
import templateForPresentation.pageObjectsOld.checkout.CheckoutContactInfo;
import templateForPresentation.pageObjectsOld.checkout.CheckoutDelivery;
import templateForPresentation.pageObjectsOld.checkout.CheckoutPayment;

public class PresentationTests extends BaseTest{

    private String testValue = "testValue";
    private Integer testProductId = 7462;

    @Test
    public void makeOrderTest(){
        ProductPage productPage = new ProductPage(testProductId);
        productPage.open();
        productPage.clickAddToCart();

        CheckoutContactInfo checkoutContactInfo = new CheckoutContactInfo();
        checkoutContactInfo.openCheckout();
        checkoutContactInfo.fillFirstName(testValue);
        checkoutContactInfo.fillLastName(testValue);
        checkoutContactInfo.fillEmail(testValue+"@test.com");
        checkoutContactInfo.fillPhoneNumber("112223333");
        checkoutContactInfo.selectCountry("Sweden");
        checkoutContactInfo.fillCity(testValue);
        checkoutContactInfo.fillAddress(testValue);
        checkoutContactInfo.submitContactInfo();

        CheckoutDelivery checkoutDelivery =new CheckoutDelivery(2045558838);
        checkoutDelivery.selectDeliveryServiceById();
        checkoutDelivery.submitDeliveryChoose();

        CheckoutPayment checkoutPayment = new CheckoutPayment(2032449552);
        checkoutPayment.selectPaymentServiceById();
        checkoutPayment.submitDeliveryChoose();

        new CheckoutConfirmation().submitCheckout();
    }

    @Test
    public void registerNewAccountTest(){
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickLoginLink();

        RegistrationPopup registrationPopup = new LoginPopup().clickOnTabRegistration();
        registrationPopup.fillFirstNameField(testValue);
        registrationPopup.fillLoginField(testValue+ RandomUtils.nextInt(0, 500));
        registrationPopup.fillEmailField(testValue+ RandomUtils.nextInt(0, 500) + "@gmail.com");
        registrationPopup.selectCountry("Sweden");
        registrationPopup.submitRegisterForm();
    }

    @Test
    public void addToWishListProductTest(){
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.fillSearchField(""+testProductId);
        homePage.submitSearch();

        ProductList productList = new ProductList();
        productList.clickToWishListProduct(testProductId);

        LoginPopup loginPopup = new LoginPopup();
        loginPopup.fillLoginField("qazx");
        loginPopup.fillPaswField("1111");
        loginPopup.submitForm();

        WishListPage wishList = new WishListPage().isLoaded();
        wishList.getProductById(testProductId).shouldBe(Condition.visible);
        wishList.clickOnRemoveProductFromWishList();
    }

}
