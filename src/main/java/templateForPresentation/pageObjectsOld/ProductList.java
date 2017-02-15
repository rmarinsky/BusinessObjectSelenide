package templateForPresentation.pageObjectsOld;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class ProductList {

    public void clickToWishListProduct(Integer productId){
        $(by("data-product-id",""+productId)).$(".ga-add-to-wishlist").click();
    }

}
