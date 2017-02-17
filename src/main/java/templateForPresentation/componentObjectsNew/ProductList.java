package templateForPresentation.componentObjectsNew;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import templateForPresentation.businesObjects.Product;

public class ProductList {

    private SelenideElement searchTitle = Selenide.$(".search-title-highlight"),
            paginationTop = Selenide.$(".pagination-wrapper-top"),
            paginationBottom = Selenide.$(".pagination-wrapper-bottom");

    public ProductList openProductListPage(){
        Selenide.open("/gsm/boxes-and-dongles/");
        return this;
    }

    public ProductList searchResultShouldHasSearchedPhrase(String searchedPhrase){
        this.searchTitle.shouldHave(Condition.text(searchedPhrase));
        return this;
    }

    public ProductList filterProducts(){
        return this;
    }

    public ProductList searchResultShouldHaveRequest(){

        return this;
    }

    public AccountWishList openWishListPageViaProduct(Integer productId){
        Product.findProduct(productId).$("[href='/account/wishlist/']").click();
        return new AccountWishList();
    }



}
