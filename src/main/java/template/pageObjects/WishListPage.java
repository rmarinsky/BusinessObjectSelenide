package template.pageObjects;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class WishListPage {

    public WishListPage isLoaded(){
        $("#user_product_table_full").shouldBe(Condition.visible);
        return this;
    }

    public WishListPage wishListShouldHaveProduct(Integer productId){
        $(by("data-product-id",""+productId)).shouldBe(Condition.visible);
        return this;
    }

    public void clickOnRemoveProductFromWishList(){
        $(by("href*","/account/wishlist/remove/")).click();
    }

}
