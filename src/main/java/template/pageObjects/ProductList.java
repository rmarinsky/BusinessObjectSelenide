package template.pageObjects;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class ProductList {

    public ProductList clickToWishListProduct(Integer productId){
        $(by("data-product-id",""+productId)).$(".ga-add-to-wishlist").click();
        return this;
    }

}
