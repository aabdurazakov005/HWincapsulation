package org.skypro.skyshop;

import org.skypro.skyshop.articles.Article;
import org.skypro.skyshop.articles.Searchable;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;

public class App {
    public static void main(String[] args) {
        // 1. Создаем поисковый движок с емкостью 20 элементов
        SearchEngine searchEngine = new SearchEngine(20);

        // 2. Добавляем товары из других тестов
        searchEngine.add(new SimpleProduct("Хлеб", 50));
        searchEngine.add(new SimpleProduct("Молоко", 80));
        searchEngine.add(new DiscountedProduct("Сыр", 300, 15));
        searchEngine.add(new FixPriceProduct("Соль"));
        searchEngine.add(new FixPriceProduct("Сахар"));
        searchEngine.add(new DiscountedProduct("Кофе", 500, 10));

        // 3. Добавляем статьи о товарах
        searchEngine.add(new Article("О хлебе", "Хлеб - всему голова. Полезные свойства хлеба."));
        searchEngine.add(new Article("О молоке", "Молоко содержит кальций и другие полезные вещества."));
        searchEngine.add(new Article("О сыре", "Как выбрать хороший сыр. Польза сыра для организма."));
        searchEngine.add(new Article("О соли", "Морская соль vs обычная соль. Что полезнее?"));

        // 4. Демонстрация поиска
        System.out.println("=== Поиск 'хлеб' ===");
        printSearchResults(searchEngine.search("хлеб"));

        System.out.println("\n=== Поиск 'молоко' ===");
        printSearchResults(searchEngine.search("молоко"));

        System.out.println("\n=== Поиск 'соль' ===");
        printSearchResults(searchEngine.search("соль"));

        System.out.println("\n=== Поиск 'сыр' ===");
        printSearchResults(searchEngine.search("сыр"));

        System.out.println("\n=== Поиск 'сахар' ===");
        printSearchResults(searchEngine.search("сахар"));

        System.out.println("\n=== Поиск 'кофе' ===");
        printSearchResults(searchEngine.search("кофе"));
    }

    private static void printSearchResults(Searchable[] results) {
        int count = 0;
        for (Searchable item : results) {
            if (item != null) {
                System.out.println(item.getStringRepresentation());
                count++;
            }
        }
        System.out.println("Найдено результатов: " + count);
    }
}
