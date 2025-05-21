package org.skypro.skyshop.search;

import org.skypro.skyshop.articles.Searchable;

public class SearchEngine {
    private final Searchable[] searchables;  // Массив для хранения элементов
    private int size;                       // Текущее количество элементов

    public SearchEngine(int capacity) {
        this.searchables = new Searchable[capacity];
        this.size = 0;
    }

    public void add(Searchable searchable) {
        if (size < searchables.length) {
            searchables[size++] = searchable;
        }
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int foundCount = 0;

        String lowerQuery = query.toLowerCase();

        for (int i = 0; i < size && foundCount < 5; i++) {
            Searchable item = searchables[i];
            if (item != null && item.getSearchTerm().toLowerCase().contains(lowerQuery)) {
                results[foundCount++] = item;
            }
        }

        return results;
    }

    public int getSize() {
        return size;
    }
}