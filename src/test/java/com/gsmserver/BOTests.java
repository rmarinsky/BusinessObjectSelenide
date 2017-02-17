package com.gsmserver;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import templateForPresentation.businesObjects.Product;
import templateForPresentation.componentObjectsNew.AccountWishList;
import templateForPresentation.componentObjectsNew.LoginPopup;
import templateForPresentation.componentObjectsNew.RegistrationPopup;
import templateForPresentation.componentObjectsNew.Search;
import templateForPresentation.componentObjectsNew.checkout.ContactData;
import templateForPresentation.componentObjectsNew.checkout.DeliveryService;
import templateForPresentation.componentObjectsNew.checkout.PaymentService;

public class BOTests extends BaseTest{

    @Test
    public void registerNewAccountTest(){
        Selenide.open("/");
        new LoginPopup().
                openLoginPopup().
                openRegistrationTab();
        new RegistrationPopup().
                registerNewUser(TEST_VALUE,
                        TEST_VALUE + RandomUtils.nextInt(0, 500),
                        TEST_VALUE + RandomUtils.nextInt(0, 500) + "@gmail.com",
                        "Turkey");

        Selenide.$("#SignUpConfirm").waitUntil(Condition.visible, 10000);
    }

    @Test
    public void makeOrderTest(){
        new Product().
                openProductPage(super.TEST_PRODUCT_ID).
                addToCartProduct(super.TEST_PRODUCT_ID);
        new ContactData().openCheckout().
                fillContactData("Turkey",
                        TEST_VALUE, TEST_VALUE,
                        TEST_VALUE, TEST_VALUE+"@popopo.com",
                        TEST_VALUE).
                submitContactInfo();
        new DeliveryService().
                selectDeliveryServiceById(super.DELIVERY_SERVICE_ID).
                submitDeliveryChoose();
        new PaymentService().
                selectPaymentServiceById(super.PAYMENT_SERVICE_ID).
                submitDeliveryChoose();
        /*new CheckoutConfirmation().submitCheckout();

        Selenide.$("[data-order-id]").waitUntil(Condition.visible, 15000);*/
    }

    @Test
    public void addToWishListProduct(){
        new Search().
                openSearchResultFor(String.valueOf(super.TEST_PRODUCT_ID));
        new Product().
                addToWishListProduct(super.TEST_PRODUCT_ID);
        new LoginPopup().
                loginUser("qazx", "1111");
        new AccountWishList().
                productShouldBeInWishList(super.TEST_PRODUCT_ID).
                removeProductFromWishList(super.TEST_PRODUCT_ID);

        Product.findProduct(super.TEST_PRODUCT_ID).shouldBe(Condition.hidden);

    }

}
