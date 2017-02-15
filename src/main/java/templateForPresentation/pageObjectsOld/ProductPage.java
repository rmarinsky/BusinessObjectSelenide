package templateForPresentation.pageObjectsOld;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

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
        $(by("data-product-id",""+productId)).$(by("data-action-click", "site.cart.add")).click();
        $(by("data-product-id",""+productId)).$(by("data-action-click", "site.cart.add")).shouldBe(Condition.hidden);
    }

}
