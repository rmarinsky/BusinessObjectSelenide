package template.businesObject;

import utils.JSExecutor;

public class Product {

    public Product addProductToCartViaJS(final Integer productId, Integer count){
        new JSExecutor().GETWithParam("/ajax/cart/add/"+ productId, String.valueOf(count));
        return this;
    }

}
