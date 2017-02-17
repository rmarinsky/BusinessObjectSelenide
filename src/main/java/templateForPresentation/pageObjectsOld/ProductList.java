package templateForPresentation.pageObjectsOld;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.by;

public class ProductList {

    public void clickToWishListProduct(Integer productId){
        Selenide.$(by("data-product-id",""+productId)).$(".ga-add-to-wishlist").click();
    }

}
