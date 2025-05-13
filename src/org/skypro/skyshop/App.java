package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        basket.addProduct(new SimpleProduct("Чипсы",120));
        basket.addProduct(new DiscountedProduct("Хлеб",70,50));
        basket.addProduct(new FixPriceProduct("Мыло"));
        basket.addProduct(new FixPriceProduct("Бананы"));

        basket.printBasketContents();
    }
}
