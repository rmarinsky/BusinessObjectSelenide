package templateForPresentation.componentObjectsNew;

import com.codeborne.selenide.Condition;
import templateForPresentation.businesObjects.Product;

import static com.codeborne.selenide.Selenide.$;

public class AccountWishList {

    public AccountWishList productShouldBeInWishList(Integer productId){
        $("#user_product_table_full").shouldBe(Condition.visible);
        Product.findProduct(productId).shouldBe(Condition.visible);
        return this;
    }

    public void removeProductFromWishList(Integer productId){
        Product.findProduct(productId).$(".remove-product a").click();
    }

}
