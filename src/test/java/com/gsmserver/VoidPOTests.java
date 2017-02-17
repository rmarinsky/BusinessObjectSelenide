package com.gsmserver;

import com.codeborne.selenide.Condition;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import templateForPresentation.pageObjectsOld.*;
import templateForPresentation.pageObjectsOld.checkout.CheckoutContactInfo;
import templateForPresentation.pageObjectsOld.checkout.CheckoutDelivery;
import templateForPresentation.pageObjectsOld.checkout.CheckoutPayment;

import static com.codeborne.selenide.Selenide.$;

public class VoidPOTests extends BaseTest{

    @Test
    public void makeOrderTest(){
        ProductPage productPage = new ProductPage(TEST_PRODUCT_ID);
        productPage.open();
        productPage.clickAddToCart();

        CheckoutContactInfo checkoutContactInfo = new CheckoutContactInfo();
        checkoutContactInfo.openCheckout();
        checkoutContactInfo.fillFirstName(TEST_VALUE);
        checkoutContactInfo.fillLastName(TEST_VALUE);
        checkoutContactInfo.fillEmail(TEST_VALUE +"@test.com");
        checkoutContactInfo.fillPhoneNumber("112223333");
        checkoutContactInfo.selectCountry("Sweden");
        checkoutContactInfo.fillCity(TEST_VALUE);
        checkoutContactInfo.fillAddress(TEST_VALUE);
        checkoutContactInfo.submitContactInfo();

        CheckoutDelivery checkoutDelivery = new CheckoutDelivery(DELIVERY_SERVICE_ID);
        checkoutDelivery.selectDeliveryServiceById();
        checkoutDelivery.submitDeliveryChoose();

        CheckoutPayment checkoutPayment = new CheckoutPayment(PAYMENT_SERVICE_ID);
        checkoutPayment.selectPaymentServiceById();
        checkoutPayment.submitDeliveryChoose();

        /*new CheckoutConfirmation().submitCheckout();
        Selenide.$("[data-order-id]").waitUntil(Condition.visible, 15000);*/
    }

    @Test
    public void registerNewAccountTest(){
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickLoginLink();

        RegistrationPopup registrationPopup = new LoginPopup().clickOnTabRegistration();
        registrationPopup.fillFirstNameField(TEST_VALUE);
        registrationPopup.fillLoginField(TEST_VALUE + RandomUtils.nextInt(0, 500));
        registrationPopup.fillEmailField(TEST_VALUE + RandomUtils.nextInt(0, 500) + "@gmail.com");
        registrationPopup.selectCountry("Sweden");
        registrationPopup.submitRegisterForm();
        $("#SignUpConfirm").waitUntil(Condition.visible, 10000);
    }

    @Test
    public void addToWishListProductTest(){
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.fillSearchField(String.valueOf(TEST_PRODUCT_ID));
        homePage.submitSearch();

        ProductList productList = new ProductList();
        productList.clickToWishListProduct(TEST_PRODUCT_ID);

        LoginPopup loginPopup = new LoginPopup();
        loginPopup.fillLoginField("qazx");
        loginPopup.fillPaswField("1111");
        loginPopup.submitForm();

        AccountWishList wishList = new AccountWishList().isLoaded();
        wishList.getProductById(TEST_PRODUCT_ID).shouldBe(Condition.visible);
        wishList.clickOnRemoveProductFromWishList();
    }

}
