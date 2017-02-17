package templateForPresentation.pageObjectsOld;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.by;

public class ProductPage {

    private Integer productId;

    public ProductPage(){
    }

    public ProductPage(Integer product){
        this.productId = product;
    }

    public void open(){
        Selenide.open("/item/"+productId);
    }

    public void clickAddToCart(){
        Selenide.$(by("data-product-id",""+productId)).$(by("data-action-click", "site.cart.add")).click();
        Selenide.$(by("data-product-id",""+productId)).$(by("data-action-click", "site.cart.add")).shouldBe(Condition.hidden);
    }

}
