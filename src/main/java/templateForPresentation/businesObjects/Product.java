package templateForPresentation.businesObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import utils.JSExecutor;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class Product {

    public static SelenideElement findProduct(Integer productId){
        return $(by("data-product-id", String.valueOf(productId)));
    }

    public Product openProductPage(Integer productId){
        Selenide.open("/item/" + String.valueOf(productId));
        return this;
    }

    public Product addToCartProduct(Integer productId){
        Product.findProduct(productId).$(by("data-action-click", "site.cart.add")).click();
        Product.findProduct(productId).$(by("data-action-click", "site.cart.add")).shouldBe(Condition.hidden);
        return this;
    }

    public Product addToWishListProduct(Integer productId){
        Product.findProduct(productId).$(".ga-add-to-wishlist").click();
        return this;
    }

    public Product addProductToCartViaJS(final Integer productId, Integer count){
        new JSExecutor().GETWithParam("/ajax/cart/add/"+ String.valueOf(productId), String.valueOf(count));
        return this;
    }

}
