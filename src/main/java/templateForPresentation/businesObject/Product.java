package templateForPresentation.businesObject;

import com.codeborne.selenide.SelenideElement;
import utils.JSExecutor;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class Product {

    public SelenideElement findProductById(Integer productId){
        return $(by("data-product-id",""+productId));
    }

    public Product addProductToCartViaJS(final Integer productId, Integer count){
        new JSExecutor().GETWithParam("/ajax/cart/add/"+ productId, String.valueOf(count));
        return this;
    }

    public void addToCartProduct(Integer productId){
        this.findProductById(productId).$(by("data-action-click", "site.cart.add")).click();
    }

    public void addToWishListProduct(Integer productId){
        this.findProductById(productId).$(".ga-add-to-wishlist").click();
    }

}
