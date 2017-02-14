package template.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    public ProductPage open(Integer productId){
        Selenide.open("/item/"+productId);
        return this;
    }

    public ProductPage clickAddToCart(Integer productId){
        $(by("data-product-id",""+productId)).$(by("data-action-click", "site.cart.add")).click();
        $(by("data-product-id",""+productId)).$(by("data-action-click", "site.cart.add")).shouldBe(Condition.hidden);
        return this;
    }

}
