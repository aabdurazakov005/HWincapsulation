package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        Product apple = new Product("Яблоки", 100);
        Product bread = new Product("Хлеб", 50);
        Product milk = new Product("Молоко", 80);
        Product eggs = new Product("Яйца", 120);
        Product cheese = new Product("Сыр", 200);
        Product meat = new Product("Мясо", 300);

        System.out.println("1. Добавление продуктов в корзину:");
        basket.addProduct(apple);
        basket.addProduct(bread);
        basket.addProduct(milk);
        basket.addProduct(eggs);
        basket.addProduct(cheese);
        System.out.println("");
        System.out.println("2. Добавление лишнего товара:");
        basket.addProduct(meat);
        System.out.println("");
        System.out.println("3. Содержимое корзины с несколькими товарами:");
        basket.printBasketContents();
        System.out.println("");
        System.out.println("4. Стоимость корзины:");
        System.out.println("Общая стоимость: " + basket.getTotalPrice() + " руб.");
        System.out.println("");
        System.out.println("5. Поиск товара, который есть в корзине:");
        System.out.println("Есть ли Хлеб в корзине? " + basket.containsProduct("Хлеб"));
        System.out.println("");
        System.out.println("6. Поиск товара, которого нет в корзине:");
        System.out.println("Есть ли Мясо в корзине? " + basket.containsProduct("Мясо"));
        System.out.println("");
        System.out.println("7. Очистка корзины:");
        basket.clearBasket();
        System.out.println("Корзина очищена");
        System.out.println("");
        System.out.println("8. Печать содержимого пустой корзины:");
        basket.printBasketContents(); // Должно вывести "в корзине пусто"
        System.out.println("");
        System.out.println("9. Получение стоимости пустой корзины:");
        System.out.println("Общая стоимость: " + basket.getTotalPrice() + " руб.");
        System.out.println("");
        System.out.println("10. Поиск товара по имени в пустой корзине:");
        System.out.println("Есть ли Яблоки в корзине? " + basket.containsProduct("Яблоки"));
    }
}
